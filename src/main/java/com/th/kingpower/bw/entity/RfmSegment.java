/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.th.kingpower.bw.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "RFM_SEGMENT", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RfmSegment.findAll", query = "SELECT r FROM RfmSegment r"),
    @NamedQuery(name = "RfmSegment.findByRfmSegmentId", query = "SELECT r FROM RfmSegment r WHERE r.rfmSegmentId = :rfmSegmentId"),
    @NamedQuery(name = "RfmSegment.findByRfmSegmentCode", query = "SELECT r FROM RfmSegment r WHERE r.rfmSegmentCode = :rfmSegmentCode"),
    @NamedQuery(name = "RfmSegment.findByRfmSegmentName", query = "SELECT r FROM RfmSegment r WHERE r.rfmSegmentName = :rfmSegmentName"),
    @NamedQuery(name = "RfmSegment.findByRfmDescription", query = "SELECT r FROM RfmSegment r WHERE r.rfmDescription = :rfmDescription"),
    @NamedQuery(name = "RfmSegment.findByCreateDate", query = "SELECT r FROM RfmSegment r WHERE r.createDate = :createDate"),
    @NamedQuery(name = "RfmSegment.findByCreateBy", query = "SELECT r FROM RfmSegment r WHERE r.createBy = :createBy"),
    @NamedQuery(name = "RfmSegment.findByUpdateDate", query = "SELECT r FROM RfmSegment r WHERE r.updateDate = :updateDate"),
    @NamedQuery(name = "RfmSegment.findByUpdateBy", query = "SELECT r FROM RfmSegment r WHERE r.updateBy = :updateBy"),
    @NamedQuery(name = "RfmSegment.findByIsDelete", query = "SELECT r FROM RfmSegment r WHERE r.isDelete = :isDelete")})
public class RfmSegment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RFM_SEGMENT_ID", nullable = false)
    private Long rfmSegmentId;
    @Basic(optional = false)
    @Column(name = "RFM_SEGMENT_CODE", nullable = false, length = 50)
    private String rfmSegmentCode;
    @Column(name = "RFM_SEGMENT_NAME", length = 500)
    private String rfmSegmentName;
    @Basic(optional = false)
    @Column(name = "RFM_DESCRIPTION", nullable = false, length = 1000)
    private String rfmDescription;
    @Basic(optional = false)
    @Column(name = "CREATE_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "CREATE_BY", nullable = false, length = 50)
    private String createBy;
    @Basic(optional = false)
    @Column(name = "UPDATE_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Basic(optional = false)
    @Column(name = "UPDATE_BY", nullable = false, length = 50)
    private String updateBy;
    @Basic(optional = false)
    @Column(name = "IS_DELETE", nullable = false)
    private char isDelete;
    @OneToMany(mappedBy = "rfmSegmentId", fetch = FetchType.LAZY)
    private List<Member1> member1List;
    @JoinColumn(name = "RFM_SEGMENT_GROUP_ID", referencedColumnName = "RFM_SEGMENT_GROUP_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RfmSegmentGroup rfmSegmentGroupId;

    public RfmSegment() {
    }

    public RfmSegment(Long rfmSegmentId) {
        this.rfmSegmentId = rfmSegmentId;
    }

    public RfmSegment(Long rfmSegmentId, String rfmSegmentCode, String rfmDescription, Date createDate, String createBy, Date updateDate, String updateBy, char isDelete) {
        this.rfmSegmentId = rfmSegmentId;
        this.rfmSegmentCode = rfmSegmentCode;
        this.rfmDescription = rfmDescription;
        this.createDate = createDate;
        this.createBy = createBy;
        this.updateDate = updateDate;
        this.updateBy = updateBy;
        this.isDelete = isDelete;
    }

    public Long getRfmSegmentId() {
        return rfmSegmentId;
    }

    public void setRfmSegmentId(Long rfmSegmentId) {
        this.rfmSegmentId = rfmSegmentId;
    }

    public String getRfmSegmentCode() {
        return rfmSegmentCode;
    }

    public void setRfmSegmentCode(String rfmSegmentCode) {
        this.rfmSegmentCode = rfmSegmentCode;
    }

    public String getRfmSegmentName() {
        return rfmSegmentName;
    }

    public void setRfmSegmentName(String rfmSegmentName) {
        this.rfmSegmentName = rfmSegmentName;
    }

    public String getRfmDescription() {
        return rfmDescription;
    }

    public void setRfmDescription(String rfmDescription) {
        this.rfmDescription = rfmDescription;
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

    public RfmSegmentGroup getRfmSegmentGroupId() {
        return rfmSegmentGroupId;
    }

    public void setRfmSegmentGroupId(RfmSegmentGroup rfmSegmentGroupId) {
        this.rfmSegmentGroupId = rfmSegmentGroupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rfmSegmentId != null ? rfmSegmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RfmSegment)) {
            return false;
        }
        RfmSegment other = (RfmSegment) object;
        if ((this.rfmSegmentId == null && other.rfmSegmentId != null) || (this.rfmSegmentId != null && !this.rfmSegmentId.equals(other.rfmSegmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.RfmSegment[ rfmSegmentId=" + rfmSegmentId + " ]";
    }
    
}
