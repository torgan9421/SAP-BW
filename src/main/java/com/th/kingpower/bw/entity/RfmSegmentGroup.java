/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.th.kingpower.bw.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "RFM_SEGMENT_GROUP", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RfmSegmentGroup.findAll", query = "SELECT r FROM RfmSegmentGroup r"),
    @NamedQuery(name = "RfmSegmentGroup.findByRfmSegmentGroupId", query = "SELECT r FROM RfmSegmentGroup r WHERE r.rfmSegmentGroupId = :rfmSegmentGroupId"),
    @NamedQuery(name = "RfmSegmentGroup.findByRfmSegmentGroupCode", query = "SELECT r FROM RfmSegmentGroup r WHERE r.rfmSegmentGroupCode = :rfmSegmentGroupCode"),
    @NamedQuery(name = "RfmSegmentGroup.findByRfmSegmentGroupName", query = "SELECT r FROM RfmSegmentGroup r WHERE r.rfmSegmentGroupName = :rfmSegmentGroupName"),
    @NamedQuery(name = "RfmSegmentGroup.findByRfmGroupDescription", query = "SELECT r FROM RfmSegmentGroup r WHERE r.rfmGroupDescription = :rfmGroupDescription"),
    @NamedQuery(name = "RfmSegmentGroup.findByCreateDate", query = "SELECT r FROM RfmSegmentGroup r WHERE r.createDate = :createDate"),
    @NamedQuery(name = "RfmSegmentGroup.findByCreateBy", query = "SELECT r FROM RfmSegmentGroup r WHERE r.createBy = :createBy"),
    @NamedQuery(name = "RfmSegmentGroup.findByUpdateDate", query = "SELECT r FROM RfmSegmentGroup r WHERE r.updateDate = :updateDate"),
    @NamedQuery(name = "RfmSegmentGroup.findByUpdateBy", query = "SELECT r FROM RfmSegmentGroup r WHERE r.updateBy = :updateBy"),
    @NamedQuery(name = "RfmSegmentGroup.findByIsDelete", query = "SELECT r FROM RfmSegmentGroup r WHERE r.isDelete = :isDelete")})
public class RfmSegmentGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RFM_SEGMENT_GROUP_ID", nullable = false)
    private Long rfmSegmentGroupId;
    @Column(name = "RFM_SEGMENT_GROUP_CODE")
    private BigInteger rfmSegmentGroupCode;
    @Column(name = "RFM_SEGMENT_GROUP_NAME", length = 500)
    private String rfmSegmentGroupName;
    @Basic(optional = false)
    @Column(name = "RFM_GROUP_DESCRIPTION", nullable = false, length = 1000)
    private String rfmGroupDescription;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rfmSegmentGroupId", fetch = FetchType.LAZY)
    private List<RfmSegment> rfmSegmentList;

    public RfmSegmentGroup() {
    }

    public RfmSegmentGroup(Long rfmSegmentGroupId) {
        this.rfmSegmentGroupId = rfmSegmentGroupId;
    }

    public RfmSegmentGroup(Long rfmSegmentGroupId, String rfmGroupDescription, Date createDate, String createBy, Date updateDate, String updateBy, char isDelete) {
        this.rfmSegmentGroupId = rfmSegmentGroupId;
        this.rfmGroupDescription = rfmGroupDescription;
        this.createDate = createDate;
        this.createBy = createBy;
        this.updateDate = updateDate;
        this.updateBy = updateBy;
        this.isDelete = isDelete;
    }

    public Long getRfmSegmentGroupId() {
        return rfmSegmentGroupId;
    }

    public void setRfmSegmentGroupId(Long rfmSegmentGroupId) {
        this.rfmSegmentGroupId = rfmSegmentGroupId;
    }

    public BigInteger getRfmSegmentGroupCode() {
        return rfmSegmentGroupCode;
    }

    public void setRfmSegmentGroupCode(BigInteger rfmSegmentGroupCode) {
        this.rfmSegmentGroupCode = rfmSegmentGroupCode;
    }

    public String getRfmSegmentGroupName() {
        return rfmSegmentGroupName;
    }

    public void setRfmSegmentGroupName(String rfmSegmentGroupName) {
        this.rfmSegmentGroupName = rfmSegmentGroupName;
    }

    public String getRfmGroupDescription() {
        return rfmGroupDescription;
    }

    public void setRfmGroupDescription(String rfmGroupDescription) {
        this.rfmGroupDescription = rfmGroupDescription;
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
    public List<RfmSegment> getRfmSegmentList() {
        return rfmSegmentList;
    }

    public void setRfmSegmentList(List<RfmSegment> rfmSegmentList) {
        this.rfmSegmentList = rfmSegmentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rfmSegmentGroupId != null ? rfmSegmentGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RfmSegmentGroup)) {
            return false;
        }
        RfmSegmentGroup other = (RfmSegmentGroup) object;
        if ((this.rfmSegmentGroupId == null && other.rfmSegmentGroupId != null) || (this.rfmSegmentGroupId != null && !this.rfmSegmentGroupId.equals(other.rfmSegmentGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.RfmSegmentGroup[ rfmSegmentGroupId=" + rfmSegmentGroupId + " ]";
    }
    
}
