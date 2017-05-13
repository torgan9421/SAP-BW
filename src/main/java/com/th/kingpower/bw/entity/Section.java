/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.th.kingpower.bw.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DominoMan
 */
@Entity
@Table(name = "SECTION", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Section.findAll", query = "SELECT s FROM Section s"),
    @NamedQuery(name = "Section.findBySectionId", query = "SELECT s FROM Section s WHERE s.sectionId = :sectionId"),
    @NamedQuery(name = "Section.findBySectionCode", query = "SELECT s FROM Section s WHERE s.sectionCode = :sectionCode"),
    @NamedQuery(name = "Section.findBySectionName", query = "SELECT s FROM Section s WHERE s.sectionName = :sectionName"),
    @NamedQuery(name = "Section.findByCreateDate", query = "SELECT s FROM Section s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "Section.findByCreateBy", query = "SELECT s FROM Section s WHERE s.createBy = :createBy"),
    @NamedQuery(name = "Section.findByUpdateDate", query = "SELECT s FROM Section s WHERE s.updateDate = :updateDate"),
    @NamedQuery(name = "Section.findByUpdateBy", query = "SELECT s FROM Section s WHERE s.updateBy = :updateBy"),
    @NamedQuery(name = "Section.findByIsDelete", query = "SELECT s FROM Section s WHERE s.isDelete = :isDelete")})
public class Section implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECTION_ID", nullable = false)
    private Long sectionId;
    @Basic(optional = false)
    @Column(name = "SECTION_CODE", nullable = false, length = 50)
    private String sectionCode;
    @Column(name = "SECTION_NAME", length = 255)
    private String sectionName;
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
    @JoinColumn(name = "CATEGORIES_ID", referencedColumnName = "CATEGORIES_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Categories categoriesId;

    public Section() {
    }

    public Section(Long sectionId) {
        this.sectionId = sectionId;
    }

    public Section(Long sectionId, String sectionCode, Date createDate, String createBy, char isDelete) {
        this.sectionId = sectionId;
        this.sectionCode = sectionCode;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
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

    public Categories getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(Categories categoriesId) {
        this.categoriesId = categoriesId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sectionId != null ? sectionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Section)) {
            return false;
        }
        Section other = (Section) object;
        if ((this.sectionId == null && other.sectionId != null) || (this.sectionId != null && !this.sectionId.equals(other.sectionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.Section[ sectionId=" + sectionId + " ]";
    }
    
}
