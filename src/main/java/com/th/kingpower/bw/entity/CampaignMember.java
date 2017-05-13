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
@Table(name = "CAMPAIGN_MEMBER", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CampaignMember.findAll", query = "SELECT c FROM CampaignMember c"),
    @NamedQuery(name = "CampaignMember.findByCampaignMemberId", query = "SELECT c FROM CampaignMember c WHERE c.campaignMemberId = :campaignMemberId"),
    @NamedQuery(name = "CampaignMember.findByCreateDate", query = "SELECT c FROM CampaignMember c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "CampaignMember.findByCreateBy", query = "SELECT c FROM CampaignMember c WHERE c.createBy = :createBy"),
    @NamedQuery(name = "CampaignMember.findByUpdateDate", query = "SELECT c FROM CampaignMember c WHERE c.updateDate = :updateDate"),
    @NamedQuery(name = "CampaignMember.findByUpdateBy", query = "SELECT c FROM CampaignMember c WHERE c.updateBy = :updateBy"),
    @NamedQuery(name = "CampaignMember.findByIsDelete", query = "SELECT c FROM CampaignMember c WHERE c.isDelete = :isDelete")})
public class CampaignMember implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CAMPAIGN_MEMBER_ID", nullable = false)
    private Long campaignMemberId;
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
    @JoinColumn(name = "CAMPAIGN_ID", referencedColumnName = "CAMPAIGN_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Campaign campaignId;

    public CampaignMember() {
    }

    public CampaignMember(Long campaignMemberId) {
        this.campaignMemberId = campaignMemberId;
    }

    public CampaignMember(Long campaignMemberId, Date createDate, String createBy, char isDelete) {
        this.campaignMemberId = campaignMemberId;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getCampaignMemberId() {
        return campaignMemberId;
    }

    public void setCampaignMemberId(Long campaignMemberId) {
        this.campaignMemberId = campaignMemberId;
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

    public Campaign getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Campaign campaignId) {
        this.campaignId = campaignId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (campaignMemberId != null ? campaignMemberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CampaignMember)) {
            return false;
        }
        CampaignMember other = (CampaignMember) object;
        if ((this.campaignMemberId == null && other.campaignMemberId != null) || (this.campaignMemberId != null && !this.campaignMemberId.equals(other.campaignMemberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.CampaignMember[ campaignMemberId=" + campaignMemberId + " ]";
    }
    
}
