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
@Table(name = "CUSTOMER_TYPE", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerType.findAll", query = "SELECT c FROM CustomerType c"),
    @NamedQuery(name = "CustomerType.findByCustomerTypeId", query = "SELECT c FROM CustomerType c WHERE c.customerTypeId = :customerTypeId"),
    @NamedQuery(name = "CustomerType.findByCustomerTypeCode", query = "SELECT c FROM CustomerType c WHERE c.customerTypeCode = :customerTypeCode"),
    @NamedQuery(name = "CustomerType.findByCustomerTypeName", query = "SELECT c FROM CustomerType c WHERE c.customerTypeName = :customerTypeName"),
    @NamedQuery(name = "CustomerType.findByCreateDate", query = "SELECT c FROM CustomerType c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "CustomerType.findByCreateBy", query = "SELECT c FROM CustomerType c WHERE c.createBy = :createBy"),
    @NamedQuery(name = "CustomerType.findByUpdateDate", query = "SELECT c FROM CustomerType c WHERE c.updateDate = :updateDate"),
    @NamedQuery(name = "CustomerType.findByUpdateBy", query = "SELECT c FROM CustomerType c WHERE c.updateBy = :updateBy"),
    @NamedQuery(name = "CustomerType.findByIsDelete", query = "SELECT c FROM CustomerType c WHERE c.isDelete = :isDelete")})
public class CustomerType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CUSTOMER_TYPE_ID", nullable = false)
    private Long customerTypeId;
    @Basic(optional = false)
    @Column(name = "CUSTOMER_TYPE_CODE", nullable = false, length = 50)
    private String customerTypeCode;
    @Basic(optional = false)
    @Column(name = "CUSTOMER_TYPE_NAME", nullable = false, length = 255)
    private String customerTypeName;
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
    @JoinColumn(name = "CUSTOMER_GROUP_TYPE_ID", referencedColumnName = "CUSTOMER_TYPE_GROUP_ID")
    @ManyToOne( fetch = FetchType.LAZY)
    private CustomerTypeGroup customerGroupTypeId;

    public CustomerType() {
    }

    public CustomerType(Long customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public CustomerType(Long customerTypeId, String customerTypeCode, String customerTypeName, Date createDate, String createBy, char isDelete) {
        this.customerTypeId = customerTypeId;
        this.customerTypeCode = customerTypeCode;
        this.customerTypeName = customerTypeName;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Long customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeCode() {
        return customerTypeCode;
    }

    public void setCustomerTypeCode(String customerTypeCode) {
        this.customerTypeCode = customerTypeCode;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
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

    public CustomerTypeGroup getCustomerGroupTypeId() {
        return customerGroupTypeId;
    }

    public void setCustomerGroupTypeId(CustomerTypeGroup customerGroupTypeId) {
        this.customerGroupTypeId = customerGroupTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerTypeId != null ? customerTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerType)) {
            return false;
        }
        CustomerType other = (CustomerType) object;
        if ((this.customerTypeId == null && other.customerTypeId != null) || (this.customerTypeId != null && !this.customerTypeId.equals(other.customerTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.CustomerType[ customerTypeId=" + customerTypeId + " ]";
    }
    
}
