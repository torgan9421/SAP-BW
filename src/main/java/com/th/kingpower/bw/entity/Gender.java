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
@Table(name = "GENDER", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gender.findAll", query = "SELECT g FROM Gender g"),
    @NamedQuery(name = "Gender.findByGenderId", query = "SELECT g FROM Gender g WHERE g.genderId = :genderId"),
    @NamedQuery(name = "Gender.findByGenderCode", query = "SELECT g FROM Gender g WHERE g.genderCode = :genderCode"),
    @NamedQuery(name = "Gender.findByGenderName", query = "SELECT g FROM Gender g WHERE g.genderName = :genderName"),
    @NamedQuery(name = "Gender.findByCreateDate", query = "SELECT g FROM Gender g WHERE g.createDate = :createDate"),
    @NamedQuery(name = "Gender.findByCreateBy", query = "SELECT g FROM Gender g WHERE g.createBy = :createBy"),
    @NamedQuery(name = "Gender.findByUpdateDate", query = "SELECT g FROM Gender g WHERE g.updateDate = :updateDate"),
    @NamedQuery(name = "Gender.findByUpdateBy", query = "SELECT g FROM Gender g WHERE g.updateBy = :updateBy"),
    @NamedQuery(name = "Gender.findByIsDelete", query = "SELECT g FROM Gender g WHERE g.isDelete = :isDelete")})
public class Gender implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "GENDER_ID", nullable = false)
    private Long genderId;
    @Basic(optional = false)
    @Column(name = "GENDER_CODE", nullable = false, length = 5)
    private String genderCode;
    @Column(name = "GENDER_NAME", length = 10)
    private String genderName;
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

    public Gender() {
    }

    public Gender(Long genderId) {
        this.genderId = genderId;
    }

    public Gender(Long genderId, String genderCode, Date createDate, String createBy, char isDelete) {
        this.genderId = genderId;
        this.genderCode = genderCode;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getGenderId() {
        return genderId;
    }

    public void setGenderId(Long genderId) {
        this.genderId = genderId;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
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
        hash += (genderId != null ? genderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gender)) {
            return false;
        }
        Gender other = (Gender) object;
        if ((this.genderId == null && other.genderId != null) || (this.genderId != null && !this.genderId.equals(other.genderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.Gender[ genderId=" + genderId + " ]";
    }
    
}
