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
@Table(name = "TOUR_AGENT", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TourAgent.findAll", query = "SELECT t FROM TourAgent t"),
    @NamedQuery(name = "TourAgent.findByTourAgentId", query = "SELECT t FROM TourAgent t WHERE t.tourAgentId = :tourAgentId"),
    @NamedQuery(name = "TourAgent.findByTourAgentCode", query = "SELECT t FROM TourAgent t WHERE t.tourAgentCode = :tourAgentCode"),
    @NamedQuery(name = "TourAgent.findByTourAgentName", query = "SELECT t FROM TourAgent t WHERE t.tourAgentName = :tourAgentName"),
    @NamedQuery(name = "TourAgent.findByCreateDate", query = "SELECT t FROM TourAgent t WHERE t.createDate = :createDate"),
    @NamedQuery(name = "TourAgent.findByCreateBy", query = "SELECT t FROM TourAgent t WHERE t.createBy = :createBy"),
    @NamedQuery(name = "TourAgent.findByUpdateDate", query = "SELECT t FROM TourAgent t WHERE t.updateDate = :updateDate"),
    @NamedQuery(name = "TourAgent.findByUpdateBy", query = "SELECT t FROM TourAgent t WHERE t.updateBy = :updateBy"),
    @NamedQuery(name = "TourAgent.findByIsDelete", query = "SELECT t FROM TourAgent t WHERE t.isDelete = :isDelete")})
public class TourAgent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TOUR_AGENT_ID", nullable = false)
    private Long tourAgentId;
    @Basic(optional = false)
    @Column(name = "TOUR_AGENT_CODE", nullable = false, length = 50)
    private String tourAgentCode;
    @Column(name = "TOUR_AGENT_NAME", length = 255)
    private String tourAgentName;
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

    public TourAgent() {
    }

    public TourAgent(Long tourAgentId) {
        this.tourAgentId = tourAgentId;
    }

    public TourAgent(Long tourAgentId, String tourAgentCode, Date createDate, String createBy, char isDelete) {
        this.tourAgentId = tourAgentId;
        this.tourAgentCode = tourAgentCode;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getTourAgentId() {
        return tourAgentId;
    }

    public void setTourAgentId(Long tourAgentId) {
        this.tourAgentId = tourAgentId;
    }

    public String getTourAgentCode() {
        return tourAgentCode;
    }

    public void setTourAgentCode(String tourAgentCode) {
        this.tourAgentCode = tourAgentCode;
    }

    public String getTourAgentName() {
        return tourAgentName;
    }

    public void setTourAgentName(String tourAgentName) {
        this.tourAgentName = tourAgentName;
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
        hash += (tourAgentId != null ? tourAgentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TourAgent)) {
            return false;
        }
        TourAgent other = (TourAgent) object;
        if ((this.tourAgentId == null && other.tourAgentId != null) || (this.tourAgentId != null && !this.tourAgentId.equals(other.tourAgentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.TourAgent[ tourAgentId=" + tourAgentId + " ]";
    }
    
}
