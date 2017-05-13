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
@Table(name = "PAYMENT_TYPE_GROUP", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaymentTypeGroup.findAll", query = "SELECT p FROM PaymentTypeGroup p"),
    @NamedQuery(name = "PaymentTypeGroup.findByPaymentTypeGroupId", query = "SELECT p FROM PaymentTypeGroup p WHERE p.paymentTypeGroupId = :paymentTypeGroupId"),
    @NamedQuery(name = "PaymentTypeGroup.findByPaymentTypeGroupCode", query = "SELECT p FROM PaymentTypeGroup p WHERE p.paymentTypeGroupCode = :paymentTypeGroupCode"),
    @NamedQuery(name = "PaymentTypeGroup.findByPaymentTypeGroupName", query = "SELECT p FROM PaymentTypeGroup p WHERE p.paymentTypeGroupName = :paymentTypeGroupName"),
    @NamedQuery(name = "PaymentTypeGroup.findByCreateDate", query = "SELECT p FROM PaymentTypeGroup p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "PaymentTypeGroup.findByCreateBy", query = "SELECT p FROM PaymentTypeGroup p WHERE p.createBy = :createBy"),
    @NamedQuery(name = "PaymentTypeGroup.findByUpdateDate", query = "SELECT p FROM PaymentTypeGroup p WHERE p.updateDate = :updateDate"),
    @NamedQuery(name = "PaymentTypeGroup.findByUpdateBy", query = "SELECT p FROM PaymentTypeGroup p WHERE p.updateBy = :updateBy"),
    @NamedQuery(name = "PaymentTypeGroup.findByIsDelete", query = "SELECT p FROM PaymentTypeGroup p WHERE p.isDelete = :isDelete")})
public class PaymentTypeGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_TYPE_GROUP_ID", nullable = false)
    private Long paymentTypeGroupId;
    @Basic(optional = false)
    @Column(name = "PAYMENT_TYPE_GROUP_CODE", nullable = false, length = 50)
    private String paymentTypeGroupCode;
    @Column(name = "PAYMENT_TYPE_GROUP_NAME", length = 255)
    private String paymentTypeGroupName;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentTypeGroupId", fetch = FetchType.LAZY)
    private List<PaymentType> paymentTypeList;

    public PaymentTypeGroup() {
    }

    public PaymentTypeGroup(Long paymentTypeGroupId) {
        this.paymentTypeGroupId = paymentTypeGroupId;
    }

    public PaymentTypeGroup(Long paymentTypeGroupId, String paymentTypeGroupCode, Date createDate, String createBy, char isDelete) {
        this.paymentTypeGroupId = paymentTypeGroupId;
        this.paymentTypeGroupCode = paymentTypeGroupCode;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getPaymentTypeGroupId() {
        return paymentTypeGroupId;
    }

    public void setPaymentTypeGroupId(Long paymentTypeGroupId) {
        this.paymentTypeGroupId = paymentTypeGroupId;
    }

    public String getPaymentTypeGroupCode() {
        return paymentTypeGroupCode;
    }

    public void setPaymentTypeGroupCode(String paymentTypeGroupCode) {
        this.paymentTypeGroupCode = paymentTypeGroupCode;
    }

    public String getPaymentTypeGroupName() {
        return paymentTypeGroupName;
    }

    public void setPaymentTypeGroupName(String paymentTypeGroupName) {
        this.paymentTypeGroupName = paymentTypeGroupName;
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
    public List<PaymentType> getPaymentTypeList() {
        return paymentTypeList;
    }

    public void setPaymentTypeList(List<PaymentType> paymentTypeList) {
        this.paymentTypeList = paymentTypeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentTypeGroupId != null ? paymentTypeGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentTypeGroup)) {
            return false;
        }
        PaymentTypeGroup other = (PaymentTypeGroup) object;
        if ((this.paymentTypeGroupId == null && other.paymentTypeGroupId != null) || (this.paymentTypeGroupId != null && !this.paymentTypeGroupId.equals(other.paymentTypeGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.PaymentTypeGroup[ paymentTypeGroupId=" + paymentTypeGroupId + " ]";
    }
    
}
