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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "PICKUP_COUNTER", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PickupCounter.findAll", query = "SELECT p FROM PickupCounter p"),
    @NamedQuery(name = "PickupCounter.findByPickupCounterId", query = "SELECT p FROM PickupCounter p WHERE p.pickupCounterId = :pickupCounterId"),
    @NamedQuery(name = "PickupCounter.findByPickupCounterCode", query = "SELECT p FROM PickupCounter p WHERE p.pickupCounterCode = :pickupCounterCode"),
    @NamedQuery(name = "PickupCounter.findByPickupCounterName", query = "SELECT p FROM PickupCounter p WHERE p.pickupCounterName = :pickupCounterName"),
    @NamedQuery(name = "PickupCounter.findByCreateDate", query = "SELECT p FROM PickupCounter p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "PickupCounter.findByCreateBy", query = "SELECT p FROM PickupCounter p WHERE p.createBy = :createBy"),
    @NamedQuery(name = "PickupCounter.findByUpdateDate", query = "SELECT p FROM PickupCounter p WHERE p.updateDate = :updateDate"),
    @NamedQuery(name = "PickupCounter.findByUpdateBy", query = "SELECT p FROM PickupCounter p WHERE p.updateBy = :updateBy"),
    @NamedQuery(name = "PickupCounter.findByIsDelete", query = "SELECT p FROM PickupCounter p WHERE p.isDelete = :isDelete")})
public class PickupCounter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PICKUP_COUNTER_ID", nullable = false)
    private Long pickupCounterId;
    @Basic(optional = false)
    @Column(name = "PICKUP_COUNTER_CODE", nullable = false, length = 50)
    private String pickupCounterCode;
    @Column(name = "PICKUP_COUNTER_NAME", length = 255)
    private String pickupCounterName;
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

    public PickupCounter() {
    }

    public PickupCounter(Long pickupCounterId) {
        this.pickupCounterId = pickupCounterId;
    }

    public PickupCounter(Long pickupCounterId, String pickupCounterCode, Date createDate, String createBy, char isDelete) {
        this.pickupCounterId = pickupCounterId;
        this.pickupCounterCode = pickupCounterCode;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getPickupCounterId() {
        return pickupCounterId;
    }

    public void setPickupCounterId(Long pickupCounterId) {
        this.pickupCounterId = pickupCounterId;
    }

    public String getPickupCounterCode() {
        return pickupCounterCode;
    }

    public void setPickupCounterCode(String pickupCounterCode) {
        this.pickupCounterCode = pickupCounterCode;
    }

    public String getPickupCounterName() {
        return pickupCounterName;
    }

    public void setPickupCounterName(String pickupCounterName) {
        this.pickupCounterName = pickupCounterName;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pickupCounterId != null ? pickupCounterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PickupCounter)) {
            return false;
        }
        PickupCounter other = (PickupCounter) object;
        if ((this.pickupCounterId == null && other.pickupCounterId != null) || (this.pickupCounterId != null && !this.pickupCounterId.equals(other.pickupCounterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.PickupCounter[ pickupCounterId=" + pickupCounterId + " ]";
    }
    
}
