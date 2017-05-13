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
@Table(name = "CUSTOMER_TYPE_GROUP", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerTypeGroup.findAll", query = "SELECT c FROM CustomerTypeGroup c"),
    @NamedQuery(name = "CustomerTypeGroup.findByCustomerTypeGroupId", query = "SELECT c FROM CustomerTypeGroup c WHERE c.customerTypeGroupId = :customerTypeGroupId"),
    @NamedQuery(name = "CustomerTypeGroup.findByCustomerTypeGroupCode", query = "SELECT c FROM CustomerTypeGroup c WHERE c.customerTypeGroupCode = :customerTypeGroupCode"),
    @NamedQuery(name = "CustomerTypeGroup.findByCustomerTypeGroupName", query = "SELECT c FROM CustomerTypeGroup c WHERE c.customerTypeGroupName = :customerTypeGroupName"),
    @NamedQuery(name = "CustomerTypeGroup.findByCreateDate", query = "SELECT c FROM CustomerTypeGroup c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "CustomerTypeGroup.findByCreateBy", query = "SELECT c FROM CustomerTypeGroup c WHERE c.createBy = :createBy"),
    @NamedQuery(name = "CustomerTypeGroup.findByUpdateDate", query = "SELECT c FROM CustomerTypeGroup c WHERE c.updateDate = :updateDate"),
    @NamedQuery(name = "CustomerTypeGroup.findByUpdateBy", query = "SELECT c FROM CustomerTypeGroup c WHERE c.updateBy = :updateBy"),
    @NamedQuery(name = "CustomerTypeGroup.findByIsDelete", query = "SELECT c FROM CustomerTypeGroup c WHERE c.isDelete = :isDelete")})
public class CustomerTypeGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CUSTOMER_TYPE_GROUP_ID", nullable = false)
    private Long customerTypeGroupId;
    @Basic(optional = false)
    @Column(name = "CUSTOMER_TYPE_GROUP_CODE", nullable = false, length = 50)
    private String customerTypeGroupCode;
    @Basic(optional = false)
    @Column(name = "CUSTOMER_TYPE_GROUP_NAME", nullable = false, length = 255)
    private String customerTypeGroupName;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerGroupTypeId", fetch = FetchType.LAZY)
    private List<CustomerType> customerTypeList;

    public CustomerTypeGroup() {
    }

    public CustomerTypeGroup(Long customerTypeGroupId) {
        this.customerTypeGroupId = customerTypeGroupId;
    }

    public CustomerTypeGroup(Long customerTypeGroupId, String customerTypeGroupCode, String customerTypeGroupName, Date createDate, String createBy, char isDelete) {
        this.customerTypeGroupId = customerTypeGroupId;
        this.customerTypeGroupCode = customerTypeGroupCode;
        this.customerTypeGroupName = customerTypeGroupName;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getCustomerTypeGroupId() {
        return customerTypeGroupId;
    }

    public void setCustomerTypeGroupId(Long customerTypeGroupId) {
        this.customerTypeGroupId = customerTypeGroupId;
    }

    public String getCustomerTypeGroupCode() {
        return customerTypeGroupCode;
    }

    public void setCustomerTypeGroupCode(String customerTypeGroupCode) {
        this.customerTypeGroupCode = customerTypeGroupCode;
    }

    public String getCustomerTypeGroupName() {
        return customerTypeGroupName;
    }

    public void setCustomerTypeGroupName(String customerTypeGroupName) {
        this.customerTypeGroupName = customerTypeGroupName;
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
    public List<CustomerType> getCustomerTypeList() {
        return customerTypeList;
    }

    public void setCustomerTypeList(List<CustomerType> customerTypeList) {
        this.customerTypeList = customerTypeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerTypeGroupId != null ? customerTypeGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerTypeGroup)) {
            return false;
        }
        CustomerTypeGroup other = (CustomerTypeGroup) object;
        if ((this.customerTypeGroupId == null && other.customerTypeGroupId != null) || (this.customerTypeGroupId != null && !this.customerTypeGroupId.equals(other.customerTypeGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.CustomerTypeGroup[ customerTypeGroupId=" + customerTypeGroupId + " ]";
    }
    
}
