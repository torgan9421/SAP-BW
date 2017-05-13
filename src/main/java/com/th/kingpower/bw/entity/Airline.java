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
@Table(name = "AIRLINE", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Airline.findAll", query = "SELECT a FROM Airline a"),
    @NamedQuery(name = "Airline.findByAirlineId", query = "SELECT a FROM Airline a WHERE a.airlineId = :airlineId"),
    @NamedQuery(name = "Airline.findByAirlineCode", query = "SELECT a FROM Airline a WHERE a.airlineCode = :airlineCode"),
    @NamedQuery(name = "Airline.findByAirlineName", query = "SELECT a FROM Airline a WHERE a.airlineName = :airlineName"),
    @NamedQuery(name = "Airline.findByDestination", query = "SELECT a FROM Airline a WHERE a.destination = :destination"),
    @NamedQuery(name = "Airline.findByCreateDate", query = "SELECT a FROM Airline a WHERE a.createDate = :createDate"),
    @NamedQuery(name = "Airline.findByCreateBy", query = "SELECT a FROM Airline a WHERE a.createBy = :createBy"),
    @NamedQuery(name = "Airline.findByUpdateDate", query = "SELECT a FROM Airline a WHERE a.updateDate = :updateDate"),
    @NamedQuery(name = "Airline.findByUpdateBy", query = "SELECT a FROM Airline a WHERE a.updateBy = :updateBy"),
    @NamedQuery(name = "Airline.findByIsDelete", query = "SELECT a FROM Airline a WHERE a.isDelete = :isDelete")})
public class Airline implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AIRLINE_ID", nullable = false)
    private Long airlineId;
    @Basic(optional = false)
    @Column(name = "AIRLINE_CODE", nullable = false, length = 50)
    private String airlineCode;
    @Column(name = "AIRLINE_NAME", length = 255)
    private String airlineName;
    @Column(name = "DESTINATION", length = 255)
    private String destination;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "airlineId", fetch = FetchType.LAZY)
    private List<Flight> flightList;

    public Airline() {
    }

    public Airline(Long airlineId) {
        this.airlineId = airlineId;
    }

    public Airline(Long airlineId, String airlineCode, Date createDate, String createBy, char isDelete) {
        this.airlineId = airlineId;
        this.airlineCode = airlineCode;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(Long airlineId) {
        this.airlineId = airlineId;
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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
    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (airlineId != null ? airlineId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Airline)) {
            return false;
        }
        Airline other = (Airline) object;
        if ((this.airlineId == null && other.airlineId != null) || (this.airlineId != null && !this.airlineId.equals(other.airlineId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.Airline[ airlineId=" + airlineId + " ]";
    }
    
}
