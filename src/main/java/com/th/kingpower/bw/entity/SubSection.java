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
@Table(name = "SUB_SECTION", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubSection.findAll", query = "SELECT s FROM SubSection s"),
    @NamedQuery(name = "SubSection.findBySubSectionId", query = "SELECT s FROM SubSection s WHERE s.subSectionId = :subSectionId"),
    @NamedQuery(name = "SubSection.findBySubSectionCode", query = "SELECT s FROM SubSection s WHERE s.subSectionCode = :subSectionCode"),
    @NamedQuery(name = "SubSection.findBySubSectionName", query = "SELECT s FROM SubSection s WHERE s.subSectionName = :subSectionName"),
    @NamedQuery(name = "SubSection.findByCreateDate", query = "SELECT s FROM SubSection s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "SubSection.findByCreateBy", query = "SELECT s FROM SubSection s WHERE s.createBy = :createBy"),
    @NamedQuery(name = "SubSection.findByUpdateDate", query = "SELECT s FROM SubSection s WHERE s.updateDate = :updateDate"),
    @NamedQuery(name = "SubSection.findByUpdateBy", query = "SELECT s FROM SubSection s WHERE s.updateBy = :updateBy"),
    @NamedQuery(name = "SubSection.findByIsDelete", query = "SELECT s FROM SubSection s WHERE s.isDelete = :isDelete")})
public class SubSection implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SUB_SECTION_ID", nullable = false)
    private Long subSectionId;
    @Basic(optional = false)
    @Column(name = "SUB_SECTION_CODE", nullable = false, length = 50)
    private String subSectionCode;
    @Column(name = "SUB_SECTION_NAME", length = 255)
    private String subSectionName;
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
    @JoinColumn(name = "SECTION_ID", referencedColumnName = "SEGMENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Segment sectionId;

    public SubSection() {
    }

    public SubSection(Long subSectionId) {
        this.subSectionId = subSectionId;
    }

    public SubSection(Long subSectionId, String subSectionCode, Date createDate, String createBy, char isDelete) {
        this.subSectionId = subSectionId;
        this.subSectionCode = subSectionCode;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getSubSectionId() {
        return subSectionId;
    }

    public void setSubSectionId(Long subSectionId) {
        this.subSectionId = subSectionId;
    }

    public String getSubSectionCode() {
        return subSectionCode;
    }

    public void setSubSectionCode(String subSectionCode) {
        this.subSectionCode = subSectionCode;
    }

    public String getSubSectionName() {
        return subSectionName;
    }

    public void setSubSectionName(String subSectionName) {
        this.subSectionName = subSectionName;
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

    public Segment getSectionId() {
        return sectionId;
    }

    public void setSectionId(Segment sectionId) {
        this.sectionId = sectionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subSectionId != null ? subSectionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubSection)) {
            return false;
        }
        SubSection other = (SubSection) object;
        if ((this.subSectionId == null && other.subSectionId != null) || (this.subSectionId != null && !this.subSectionId.equals(other.subSectionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.SubSection[ subSectionId=" + subSectionId + " ]";
    }
    
}
