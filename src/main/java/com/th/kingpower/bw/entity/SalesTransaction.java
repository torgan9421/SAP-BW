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
@Table(name = "SALES_TRANSACTION", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesTransaction.findAll", query = "SELECT s FROM SalesTransaction s"),
    @NamedQuery(name = "SalesTransaction.findBySalesTransactionId", query = "SELECT s FROM SalesTransaction s WHERE s.salesTransactionId = :salesTransactionId"),
    @NamedQuery(name = "SalesTransaction.findByTransactionCode", query = "SELECT s FROM SalesTransaction s WHERE s.transactionCode = :transactionCode"),
    @NamedQuery(name = "SalesTransaction.findByTransactionDate", query = "SELECT s FROM SalesTransaction s WHERE s.transactionDate = :transactionDate"),
    @NamedQuery(name = "SalesTransaction.findByShoppingCardNo", query = "SELECT s FROM SalesTransaction s WHERE s.shoppingCardNo = :shoppingCardNo"),
    @NamedQuery(name = "SalesTransaction.findByLocationName", query = "SELECT s FROM SalesTransaction s WHERE s.locationName = :locationName"),
    @NamedQuery(name = "SalesTransaction.findByTransactionStatus", query = "SELECT s FROM SalesTransaction s WHERE s.transactionStatus = :transactionStatus"),
    @NamedQuery(name = "SalesTransaction.findByPickupGroupCode", query = "SELECT s FROM SalesTransaction s WHERE s.pickupGroupCode = :pickupGroupCode"),
    @NamedQuery(name = "SalesTransaction.findByPickupGroupName", query = "SELECT s FROM SalesTransaction s WHERE s.pickupGroupName = :pickupGroupName"),
    @NamedQuery(name = "SalesTransaction.findByPickupCounterDate", query = "SELECT s FROM SalesTransaction s WHERE s.pickupCounterDate = :pickupCounterDate"),
    @NamedQuery(name = "SalesTransaction.findByPickupCounterCode", query = "SELECT s FROM SalesTransaction s WHERE s.pickupCounterCode = :pickupCounterCode"),
    @NamedQuery(name = "SalesTransaction.findByPickupCounterName", query = "SELECT s FROM SalesTransaction s WHERE s.pickupCounterName = :pickupCounterName"),
    @NamedQuery(name = "SalesTransaction.findByAirlineCode", query = "SELECT s FROM SalesTransaction s WHERE s.airlineCode = :airlineCode"),
    @NamedQuery(name = "SalesTransaction.findByAirlineName", query = "SELECT s FROM SalesTransaction s WHERE s.airlineName = :airlineName"),
    @NamedQuery(name = "SalesTransaction.findByFlightCode", query = "SELECT s FROM SalesTransaction s WHERE s.flightCode = :flightCode"),
    @NamedQuery(name = "SalesTransaction.findByFlightDate", query = "SELECT s FROM SalesTransaction s WHERE s.flightDate = :flightDate"),
    @NamedQuery(name = "SalesTransaction.findByCreateDate", query = "SELECT s FROM SalesTransaction s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "SalesTransaction.findByCreateBy", query = "SELECT s FROM SalesTransaction s WHERE s.createBy = :createBy"),
    @NamedQuery(name = "SalesTransaction.findByUpdateDate", query = "SELECT s FROM SalesTransaction s WHERE s.updateDate = :updateDate"),
    @NamedQuery(name = "SalesTransaction.findByUpdateBy", query = "SELECT s FROM SalesTransaction s WHERE s.updateBy = :updateBy"),
    @NamedQuery(name = "SalesTransaction.findByIsDelete", query = "SELECT s FROM SalesTransaction s WHERE s.isDelete = :isDelete")})
public class SalesTransaction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SALES_TRANSACTION_ID", nullable = false)
    private Long salesTransactionId;
    @Basic(optional = false)
    @Column(name = "TRANSACTION_CODE", nullable = false)
    private long transactionCode;
    @Basic(optional = false)
    @Column(name = "TRANSACTION_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Column(name = "SHOPPING_CARD_NO", length = 50)
    private String shoppingCardNo;
    @Column(name = "LOCATION_NAME", length = 255)
    private String locationName;
    @Column(name = "TRANSACTION_STATUS", length = 255)
    private String transactionStatus;
    @Column(name = "PICKUP_GROUP_CODE", length = 50)
    private String pickupGroupCode;
    @Column(name = "PICKUP_GROUP_NAME", length = 255)
    private String pickupGroupName;
    @Column(name = "PICKUP_COUNTER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pickupCounterDate;
    @Column(name = "PICKUP_COUNTER_CODE", length = 50)
    private String pickupCounterCode;
    @Column(name = "PICKUP_COUNTER_NAME", length = 255)
    private String pickupCounterName;
    @Column(name = "AIRLINE_CODE", length = 50)
    private String airlineCode;
    @Column(name = "AIRLINE_NAME", length = 255)
    private String airlineName;
    @Column(name = "FLIGHT_CODE", length = 50)
    private String flightCode;
    @Column(name = "FLIGHT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date flightDate;
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
    @JoinColumn(name = "MEMBER_ID", referencedColumnName = "MEMBER_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Member1 memberId;

    public SalesTransaction() {
    }

    public SalesTransaction(Long salesTransactionId) {
        this.salesTransactionId = salesTransactionId;
    }

    public SalesTransaction(Long salesTransactionId, long transactionCode, Date transactionDate, Date createDate, String createBy, char isDelete) {
        this.salesTransactionId = salesTransactionId;
        this.transactionCode = transactionCode;
        this.transactionDate = transactionDate;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getSalesTransactionId() {
        return salesTransactionId;
    }

    public void setSalesTransactionId(Long salesTransactionId) {
        this.salesTransactionId = salesTransactionId;
    }

    public long getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(long transactionCode) {
        this.transactionCode = transactionCode;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getShoppingCardNo() {
        return shoppingCardNo;
    }

    public void setShoppingCardNo(String shoppingCardNo) {
        this.shoppingCardNo = shoppingCardNo;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getPickupGroupCode() {
        return pickupGroupCode;
    }

    public void setPickupGroupCode(String pickupGroupCode) {
        this.pickupGroupCode = pickupGroupCode;
    }

    public String getPickupGroupName() {
        return pickupGroupName;
    }

    public void setPickupGroupName(String pickupGroupName) {
        this.pickupGroupName = pickupGroupName;
    }

    public Date getPickupCounterDate() {
        return pickupCounterDate;
    }

    public void setPickupCounterDate(Date pickupCounterDate) {
        this.pickupCounterDate = pickupCounterDate;
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

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
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

    public Member1 getMemberId() {
        return memberId;
    }

    public void setMemberId(Member1 memberId) {
        this.memberId = memberId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesTransactionId != null ? salesTransactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesTransaction)) {
            return false;
        }
        SalesTransaction other = (SalesTransaction) object;
        if ((this.salesTransactionId == null && other.salesTransactionId != null) || (this.salesTransactionId != null && !this.salesTransactionId.equals(other.salesTransactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.SalesTransaction[ salesTransactionId=" + salesTransactionId + " ]";
    }
    
}
