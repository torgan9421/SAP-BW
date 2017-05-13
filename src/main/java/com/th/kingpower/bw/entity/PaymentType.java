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
@Table(name = "PAYMENT_TYPE", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaymentType.findAll", query = "SELECT p FROM PaymentType p"),
    @NamedQuery(name = "PaymentType.findByPaymentTypeId", query = "SELECT p FROM PaymentType p WHERE p.paymentTypeId = :paymentTypeId"),
    @NamedQuery(name = "PaymentType.findByPaymentTypeCode", query = "SELECT p FROM PaymentType p WHERE p.paymentTypeCode = :paymentTypeCode"),
    @NamedQuery(name = "PaymentType.findByPaymentTypeName", query = "SELECT p FROM PaymentType p WHERE p.paymentTypeName = :paymentTypeName"),
    @NamedQuery(name = "PaymentType.findByCreateDate", query = "SELECT p FROM PaymentType p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "PaymentType.findByCreateBy", query = "SELECT p FROM PaymentType p WHERE p.createBy = :createBy"),
    @NamedQuery(name = "PaymentType.findByUpdateDate", query = "SELECT p FROM PaymentType p WHERE p.updateDate = :updateDate"),
    @NamedQuery(name = "PaymentType.findByUpdateBy", query = "SELECT p FROM PaymentType p WHERE p.updateBy = :updateBy"),
    @NamedQuery(name = "PaymentType.findByIsDelete", query = "SELECT p FROM PaymentType p WHERE p.isDelete = :isDelete")})
public class PaymentType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_TYPE_ID", nullable = false)
    private Long paymentTypeId;
    @Basic(optional = false)
    @Column(name = "PAYMENT_TYPE_CODE", nullable = false, length = 50)
    private String paymentTypeCode;
    @Column(name = "PAYMENT_TYPE_NAME", length = 255)
    private String paymentTypeName;
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
    @JoinColumn(name = "PAYMENT_TYPE_GROUP_ID", referencedColumnName = "PAYMENT_TYPE_GROUP_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PaymentTypeGroup paymentTypeGroupId;

    public PaymentType() {
    }

    public PaymentType(Long paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public PaymentType(Long paymentTypeId, String paymentTypeCode, Date createDate, String createBy, char isDelete) {
        this.paymentTypeId = paymentTypeId;
        this.paymentTypeCode = paymentTypeCode;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(Long paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    public void setPaymentTypeCode(String paymentTypeCode) {
        this.paymentTypeCode = paymentTypeCode;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
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

    public PaymentTypeGroup getPaymentTypeGroupId() {
        return paymentTypeGroupId;
    }

    public void setPaymentTypeGroupId(PaymentTypeGroup paymentTypeGroupId) {
        this.paymentTypeGroupId = paymentTypeGroupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentTypeId != null ? paymentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentType)) {
            return false;
        }
        PaymentType other = (PaymentType) object;
        if ((this.paymentTypeId == null && other.paymentTypeId != null) || (this.paymentTypeId != null && !this.paymentTypeId.equals(other.paymentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.PaymentType[ paymentTypeId=" + paymentTypeId + " ]";
    }
    
}
