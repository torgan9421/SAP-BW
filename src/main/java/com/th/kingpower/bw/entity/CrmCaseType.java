/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.th.kingpower.bw.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DominoMan
 */
@Entity
@Table(name = "CRM_CASE_TYPE", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CrmCaseType.findAll", query = "SELECT c FROM CrmCaseType c"),
    @NamedQuery(name = "CrmCaseType.findByCrmCaseTypeId", query = "SELECT c FROM CrmCaseType c WHERE c.crmCaseTypeId = :crmCaseTypeId"),
    @NamedQuery(name = "CrmCaseType.findByCrmCaseTypeName", query = "SELECT c FROM CrmCaseType c WHERE c.crmCaseTypeName = :crmCaseTypeName"),
    @NamedQuery(name = "CrmCaseType.findByCrmCaseTypeDescription", query = "SELECT c FROM CrmCaseType c WHERE c.crmCaseTypeDescription = :crmCaseTypeDescription"),
    @NamedQuery(name = "CrmCaseType.findByCrmCaseTypeValue", query = "SELECT c FROM CrmCaseType c WHERE c.crmCaseTypeValue = :crmCaseTypeValue")})
public class CrmCaseType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRM_CASE_TYPE_ID", nullable = false, length = 50)
    private String crmCaseTypeId;
    @Basic(optional = false)
    @Column(name = "CRM_CASE_TYPE_NAME", nullable = false, length = 100)
    private String crmCaseTypeName;
    @Column(name = "CRM_CASE_TYPE_DESCRIPTION", length = 255)
    private String crmCaseTypeDescription;
    @Basic(optional = false)
    @Column(name = "CRM_CASE_TYPE_VALUE", nullable = false)
    private int crmCaseTypeValue;

    public CrmCaseType() {
    }

    public CrmCaseType(String crmCaseTypeId) {
        this.crmCaseTypeId = crmCaseTypeId;
    }

    public CrmCaseType(String crmCaseTypeId, String crmCaseTypeName, int crmCaseTypeValue) {
        this.crmCaseTypeId = crmCaseTypeId;
        this.crmCaseTypeName = crmCaseTypeName;
        this.crmCaseTypeValue = crmCaseTypeValue;
    }

    public String getCrmCaseTypeId() {
        return crmCaseTypeId;
    }

    public void setCrmCaseTypeId(String crmCaseTypeId) {
        this.crmCaseTypeId = crmCaseTypeId;
    }

    public String getCrmCaseTypeName() {
        return crmCaseTypeName;
    }

    public void setCrmCaseTypeName(String crmCaseTypeName) {
        this.crmCaseTypeName = crmCaseTypeName;
    }

    public String getCrmCaseTypeDescription() {
        return crmCaseTypeDescription;
    }

    public void setCrmCaseTypeDescription(String crmCaseTypeDescription) {
        this.crmCaseTypeDescription = crmCaseTypeDescription;
    }

    public int getCrmCaseTypeValue() {
        return crmCaseTypeValue;
    }

    public void setCrmCaseTypeValue(int crmCaseTypeValue) {
        this.crmCaseTypeValue = crmCaseTypeValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crmCaseTypeId != null ? crmCaseTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrmCaseType)) {
            return false;
        }
        CrmCaseType other = (CrmCaseType) object;
        if ((this.crmCaseTypeId == null && other.crmCaseTypeId != null) || (this.crmCaseTypeId != null && !this.crmCaseTypeId.equals(other.crmCaseTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.CrmCaseType[ crmCaseTypeId=" + crmCaseTypeId + " ]";
    }
    
}
