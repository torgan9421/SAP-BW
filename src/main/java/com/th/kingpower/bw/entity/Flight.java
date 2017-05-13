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
@Table(name = "FLIGHT", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Flight.findAll", query = "SELECT f FROM Flight f"),
    @NamedQuery(name = "Flight.findByFlightId", query = "SELECT f FROM Flight f WHERE f.flightId = :flightId"),
    @NamedQuery(name = "Flight.findByFlightCode", query = "SELECT f FROM Flight f WHERE f.flightCode = :flightCode"),
    @NamedQuery(name = "Flight.findByFlightDescription", query = "SELECT f FROM Flight f WHERE f.flightDescription = :flightDescription"),
    @NamedQuery(name = "Flight.findByCreateDate", query = "SELECT f FROM Flight f WHERE f.createDate = :createDate"),
    @NamedQuery(name = "Flight.findByCreateBy", query = "SELECT f FROM Flight f WHERE f.createBy = :createBy"),
    @NamedQuery(name = "Flight.findByUpdateDate", query = "SELECT f FROM Flight f WHERE f.updateDate = :updateDate"),
    @NamedQuery(name = "Flight.findByUpdateBy", query = "SELECT f FROM Flight f WHERE f.updateBy = :updateBy"),
    @NamedQuery(name = "Flight.findByIsDelete", query = "SELECT f FROM Flight f WHERE f.isDelete = :isDelete")})
public class Flight implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FLIGHT_ID", nullable = false)
    private Long flightId;
    @Basic(optional = false)
    @Column(name = "FLIGHT_CODE", nullable = false, length = 50)
    private String flightCode;
    @Column(name = "FLIGHT_DESCRIPTION", length = 255)
    private String flightDescription;
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
    @JoinColumn(name = "AIRLINE_ID", referencedColumnName = "AIRLINE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Airline airlineId;

    public Flight() {
    }

    public Flight(Long flightId) {
        this.flightId = flightId;
    }

    public Flight(Long flightId, String flightCode, Date createDate, String createBy, char isDelete) {
        this.flightId = flightId;
        this.flightCode = flightCode;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String fLIGHTCode) {
        this.flightCode = fLIGHTCode;
    }

    public String getFlightDescription() {
        return flightDescription;
    }

    public void setFlightDescription(String flightDescription) {
        this.flightDescription = flightDescription;
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

    public Airline getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(Airline airlineId) {
        this.airlineId = airlineId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (flightId != null ? flightId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Flight)) {
            return false;
        }
        Flight other = (Flight) object;
        if ((this.flightId == null && other.flightId != null) || (this.flightId != null && !this.flightId.equals(other.flightId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.Flight[ flightId=" + flightId + " ]";
    }
    
}
