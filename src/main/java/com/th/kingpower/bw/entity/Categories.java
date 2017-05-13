/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.th.kingpower.bw.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DominoMan
 */
@Entity
@Table(name = "CATEGORIES", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categories.findAll", query = "SELECT c FROM Categories c"),
    @NamedQuery(name = "Categories.findByCategoriesId", query = "SELECT c FROM Categories c WHERE c.categoriesId = :categoriesId"),
    @NamedQuery(name = "Categories.findByCategoriesCode", query = "SELECT c FROM Categories c WHERE c.categoriesCode = :categoriesCode"),
    @NamedQuery(name = "Categories.findByCategoriesName", query = "SELECT c FROM Categories c WHERE c.categoriesName = :categoriesName"),
    @NamedQuery(name = "Categories.findByCreateDate", query = "SELECT c FROM Categories c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "Categories.findByCreateBy", query = "SELECT c FROM Categories c WHERE c.createBy = :createBy"),
    @NamedQuery(name = "Categories.findByUpdateDate", query = "SELECT c FROM Categories c WHERE c.updateDate = :updateDate"),
    @NamedQuery(name = "Categories.findByUpdateBy", query = "SELECT c FROM Categories c WHERE c.updateBy = :updateBy"),
    @NamedQuery(name = "Categories.findByIsDelete", query = "SELECT c FROM Categories c WHERE c.isDelete = :isDelete")})
public class Categories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CATEGORIES_ID", nullable = false)
    private Long categoriesId;
    @Basic(optional = false)
    @Column(name = "CATEGORIES_CODE", nullable = false, length = 50)
    private String categoriesCode;
    @Column(name = "CATEGORIES_NAME", length = 255)
    private String categoriesName;
    @Basic(optional = false)
    @Column(name = "CREATE_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "CREATE_BY", nullable = false, length = 50)
    private String createBy;
    @Column(name = "UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Column(name = "UPDATE_BY", length = 50)
    private String updateBy;
    @Basic(optional = false)
    @Column(name = "IS_DELETE", nullable = false)
    private char isDelete;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriesId", fetch = FetchType.LAZY)
    private List<Section> sectionList;

    public Categories() {
    }

    public Categories(Long categoriesId) {
        this.categoriesId = categoriesId;
    }

    public Categories(Long categoriesId, String categoriesCode, Date createDate, String createBy, char isDelete) {
        this.categoriesId = categoriesId;
        this.categoriesCode = categoriesCode;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(Long categoriesId) {
        this.categoriesId = categoriesId;
    }

    public String getCategoriesCode() {
        return categoriesCode;
    }

    public void setCategoriesCode(String categoriesCode) {
        this.categoriesCode = categoriesCode;
    }

    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public char getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(char isDelete) {
        this.isDelete = isDelete;
    }

    @XmlTransient
    public List<Section> getSectionList() {
        return sectionList;
    }

    public void setSectionList(List<Section> sectionList) {
        this.sectionList = sectionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoriesId != null ? categoriesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categories)) {
            return false;
        }
        Categories other = (Categories) object;
        if ((this.categoriesId == null && other.categoriesId != null) || (this.categoriesId != null && !this.categoriesId.equals(other.categoriesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.Categories[ categoriesId=" + categoriesId + " ]";
    }
    
}
