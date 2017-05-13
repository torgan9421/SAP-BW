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
@Table(name = "CAMPAIGN", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campaign.findAll", query = "SELECT c FROM Campaign c"),
    @NamedQuery(name = "Campaign.findByCampaignId", query = "SELECT c FROM Campaign c WHERE c.campaignId = :campaignId"),
    @NamedQuery(name = "Campaign.findByCampaignCode", query = "SELECT c FROM Campaign c WHERE c.campaignCode = :campaignCode"),
    @NamedQuery(name = "Campaign.findByCampaignName", query = "SELECT c FROM Campaign c WHERE c.campaignName = :campaignName"),
    @NamedQuery(name = "Campaign.findByCampaignStartdate", query = "SELECT c FROM Campaign c WHERE c.campaignStartdate = :campaignStartdate"),
    @NamedQuery(name = "Campaign.findByCampaignEnddate", query = "SELECT c FROM Campaign c WHERE c.campaignEnddate = :campaignEnddate"),
    @NamedQuery(name = "Campaign.findByCampaignStatus", query = "SELECT c FROM Campaign c WHERE c.campaignStatus = :campaignStatus"),
    @NamedQuery(name = "Campaign.findByCreateDate", query = "SELECT c FROM Campaign c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "Campaign.findByCreateBy", query = "SELECT c FROM Campaign c WHERE c.createBy = :createBy"),
    @NamedQuery(name = "Campaign.findByUpdateDate", query = "SELECT c FROM Campaign c WHERE c.updateDate = :updateDate"),
    @NamedQuery(name = "Campaign.findByUpdateBy", query = "SELECT c FROM Campaign c WHERE c.updateBy = :updateBy"),
    @NamedQuery(name = "Campaign.findByIsDelete", query = "SELECT c FROM Campaign c WHERE c.isDelete = :isDelete")})
public class Campaign implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CAMPAIGN_ID", nullable = false)
    private Long campaignId;
    @Basic(optional = false)
    @Column(name = "CAMPAIGN_CODE", nullable = false, length = 50)
    private String campaignCode;
    @Basic(optional = false)
    @Column(name = "CAMPAIGN_NAME", nullable = false, length = 255)
    private String campaignName;
    @Basic(optional = false)
    @Column(name = "CAMPAIGN_STARTDATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date campaignStartdate;
    @Basic(optional = false)
    @Column(name = "CAMPAIGN_ENDDATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date campaignEnddate;
    @Column(name = "CAMPAIGN_STATUS")
    private Integer campaignStatus;
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
    @OneToMany(mappedBy = "campaignId", fetch = FetchType.LAZY)
    private List<CampaignSegment> campaignSegmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "campaignId", fetch = FetchType.LAZY)
    private List<CampaignMember> campaignMemberList;

    public Campaign() {
    }

    public Campaign(Long campaignId) {
        this.campaignId = campaignId;
    }

    public Campaign(Long campaignId, String campaignCode, String campaignName, Date campaignStartdate, Date campaignEnddate, Date createDate, String createBy, char isDelete) {
        this.campaignId = campaignId;
        this.campaignCode = campaignCode;
        this.campaignName = campaignName;
        this.campaignStartdate = campaignStartdate;
        this.campaignEnddate = campaignEnddate;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public Date getCampaignStartdate() {
        return campaignStartdate;
    }

    public void setCampaignStartdate(Date campaignStartdate) {
        this.campaignStartdate = campaignStartdate;
    }

    public Date getCampaignEnddate() {
        return campaignEnddate;
    }

    public void setCampaignEnddate(Date campaignEnddate) {
        this.campaignEnddate = campaignEnddate;
    }

    public Integer getCampaignStatus() {
        return campaignStatus;
    }

    public void setCampaignStatus(Integer campaignStatus) {
        this.campaignStatus = campaignStatus;
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
    public List<CampaignSegment> getCampaignSegmentList() {
        return campaignSegmentList;
    }

    public void setCampaignSegmentList(List<CampaignSegment> campaignSegmentList) {
        this.campaignSegmentList = campaignSegmentList;
    }

    @XmlTransient
    public List<CampaignMember> getCampaignMemberList() {
        return campaignMemberList;
    }

    public void setCampaignMemberList(List<CampaignMember> campaignMemberList) {
        this.campaignMemberList = campaignMemberList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (campaignId != null ? campaignId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campaign)) {
            return false;
        }
        Campaign other = (Campaign) object;
        if ((this.campaignId == null && other.campaignId != null) || (this.campaignId != null && !this.campaignId.equals(other.campaignId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.Campaign[ campaignId=" + campaignId + " ]";
    }
    
}
