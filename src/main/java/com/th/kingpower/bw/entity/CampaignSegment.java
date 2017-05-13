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
@Table(name = "CAMPAIGN_SEGMENT", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CampaignSegment.findAll", query = "SELECT c FROM CampaignSegment c"),
    @NamedQuery(name = "CampaignSegment.findByCampaignSegmentId", query = "SELECT c FROM CampaignSegment c WHERE c.campaignSegmentId = :campaignSegmentId"),
    @NamedQuery(name = "CampaignSegment.findByCreateDate", query = "SELECT c FROM CampaignSegment c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "CampaignSegment.findByCreateBy", query = "SELECT c FROM CampaignSegment c WHERE c.createBy = :createBy"),
    @NamedQuery(name = "CampaignSegment.findByUpdateDate", query = "SELECT c FROM CampaignSegment c WHERE c.updateDate = :updateDate"),
    @NamedQuery(name = "CampaignSegment.findByUpdateBy", query = "SELECT c FROM CampaignSegment c WHERE c.updateBy = :updateBy"),
    @NamedQuery(name = "CampaignSegment.findByIsDelete", query = "SELECT c FROM CampaignSegment c WHERE c.isDelete = :isDelete")})
public class CampaignSegment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CAMPAIGN_SEGMENT_ID", nullable = false)
    private Long campaignSegmentId;
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
    @JoinColumn(name = "SEGMENT_ID", referencedColumnName = "SEGMENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Segment segmentId;
    @JoinColumn(name = "CAMPAIGN_ID", referencedColumnName = "CAMPAIGN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Campaign campaignId;

    public CampaignSegment() {
    }

    public CampaignSegment(Long campaignSegmentId) {
        this.campaignSegmentId = campaignSegmentId;
    }

    public CampaignSegment(Long campaignSegmentId, Date createDate, String createBy, char isDelete) {
        this.campaignSegmentId = campaignSegmentId;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getCampaignSegmentId() {
        return campaignSegmentId;
    }

    public void setCampaignSegmentId(Long campaignSegmentId) {
        this.campaignSegmentId = campaignSegmentId;
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

    public Segment getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Segment segmentId) {
        this.segmentId = segmentId;
    }

    public Campaign getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Campaign campaignId) {
        this.campaignId = campaignId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (campaignSegmentId != null ? campaignSegmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CampaignSegment)) {
            return false;
        }
        CampaignSegment other = (CampaignSegment) object;
        if ((this.campaignSegmentId == null && other.campaignSegmentId != null) || (this.campaignSegmentId != null && !this.campaignSegmentId.equals(other.campaignSegmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.CampaignSegment[ campaignSegmentId=" + campaignSegmentId + " ]";
    }
    
}
