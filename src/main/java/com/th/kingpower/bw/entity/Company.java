/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.th.kingpower.bw.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "COMPANY", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c"),
    @NamedQuery(name = "Company.findByCompanyId", query = "SELECT c FROM Company c WHERE c.companyId = :companyId"),
    @NamedQuery(name = "Company.findByCompanyCode", query = "SELECT c FROM Company c WHERE c.companyCode = :companyCode"),
    @NamedQuery(name = "Company.findByCompanyName", query = "SELECT c FROM Company c WHERE c.companyName = :companyName"),
    @NamedQuery(name = "Company.findByCreateDate", query = "SELECT c FROM Company c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "Company.findByCreateBy", query = "SELECT c FROM Company c WHERE c.createBy = :createBy"),
    @NamedQuery(name = "Company.findByUpdateDate", query = "SELECT c FROM Company c WHERE c.updateDate = :updateDate"),
    @NamedQuery(name = "Company.findByUpdateBy", query = "SELECT c FROM Company c WHERE c.updateBy = :updateBy"),
    @NamedQuery(name = "Company.findByIsDelete", query = "SELECT c FROM Company c WHERE c.isDelete = :isDelete")})
public class Company implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COMPANY_ID", nullable = false)
    private Long companyId;
    @Basic(optional = false)
    @Column(name = "COMPANY_CODE", nullable = false, length = 50)
    private String companyCode;
    @Basic(optional = false)
    @Column(name = "COMPANY_NAME", nullable = false, length = 255)
    private String companyName;
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
    @OneToMany(mappedBy = "companyId", fetch = FetchType.LAZY)
    private List<Location> locationList;

    public Company() {
    }

    public Company(Long companyId) {
        this.companyId = companyId;
    }

    public Company(Long companyId, String companyCode, String companyName, Date createDate, String createBy, char isDelete) {
        this.companyId = companyId;
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyId != null ? companyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.companyId == null && other.companyId != null) || (this.companyId != null && !this.companyId.equals(other.companyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.Company[ companyId=" + companyId + " ]";
    }
    
}
