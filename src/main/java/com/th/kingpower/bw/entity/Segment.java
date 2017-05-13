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
@Table(name = "SEGMENT", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Segment.findAll", query = "SELECT s FROM Segment s"),
    @NamedQuery(name = "Segment.findBySegmentId", query = "SELECT s FROM Segment s WHERE s.segmentId = :segmentId"),
    @NamedQuery(name = "Segment.findBySegmentCode", query = "SELECT s FROM Segment s WHERE s.segmentCode = :segmentCode"),
    @NamedQuery(name = "Segment.findBySegmentName", query = "SELECT s FROM Segment s WHERE s.segmentName = :segmentName"),
    @NamedQuery(name = "Segment.findBySegmentDescription", query = "SELECT s FROM Segment s WHERE s.segmentDescription = :segmentDescription"),
    @NamedQuery(name = "Segment.findByCreateDate", query = "SELECT s FROM Segment s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "Segment.findByCreateBy", query = "SELECT s FROM Segment s WHERE s.createBy = :createBy"),
    @NamedQuery(name = "Segment.findByUpdateDate", query = "SELECT s FROM Segment s WHERE s.updateDate = :updateDate"),
    @NamedQuery(name = "Segment.findByUpdateBy", query = "SELECT s FROM Segment s WHERE s.updateBy = :updateBy"),
    @NamedQuery(name = "Segment.findByIsDelete", query = "SELECT s FROM Segment s WHERE s.isDelete = :isDelete")})
public class Segment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SEGMENT_ID", nullable = false)
    private Long segmentId;
    @Basic(optional = false)
    @Column(name = "SEGMENT_CODE", nullable = false, length = 50)
    private String segmentCode;
    @Basic(optional = false)
    @Column(name = "SEGMENT_NAME", nullable = false, length = 255)
    private String segmentName;
    @Column(name = "SEGMENT_DESCRIPTION", length = 1000)
    private String segmentDescription;
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
    @OneToMany(mappedBy = "segmentId", fetch = FetchType.LAZY)
    private List<Member1> member1List;
    @OneToMany(mappedBy = "segmentId", fetch = FetchType.LAZY)
    private List<CampaignSegment> campaignSegmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sectionId", fetch = FetchType.LAZY)
    private List<SubSection> subSectionList;

    public Segment() {
    }

    public Segment(Long segmentId) {
        this.segmentId = segmentId;
    }

    public Segment(Long segmentId, String segmentCode, String segmentName, Date createDate, String createBy, char isDelete) {
        this.segmentId = segmentId;
        this.segmentCode = segmentCode;
        this.segmentName = segmentName;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Long segmentId) {
        this.segmentId = segmentId;
    }

    public String getSegmentCode() {
        return segmentCode;
    }

    public void setSegmentCode(String segmentCode) {
        this.segmentCode = segmentCode;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public String getSegmentDescription() {
        return segmentDescription;
    }

    public void setSegmentDescription(String segmentDescription) {
        this.segmentDescription = segmentDescription;
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
    public List<Member1> getMember1List() {
        return member1List;
    }

    public void setMember1List(List<Member1> member1List) {
        this.member1List = member1List;
    }

    @XmlTransient
    public List<CampaignSegment> getCampaignSegmentList() {
        return campaignSegmentList;
    }

    public void setCampaignSegmentList(List<CampaignSegment> campaignSegmentList) {
        this.campaignSegmentList = campaignSegmentList;
    }

    @XmlTransient
    public List<SubSection> getSubSectionList() {
        return subSectionList;
    }

    public void setSubSectionList(List<SubSection> subSectionList) {
        this.subSectionList = subSectionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (segmentId != null ? segmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Segment)) {
            return false;
        }
        Segment other = (Segment) object;
        if ((this.segmentId == null && other.segmentId != null) || (this.segmentId != null && !this.segmentId.equals(other.segmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.Segment[ segmentId=" + segmentId + " ]";
    }
    
}
