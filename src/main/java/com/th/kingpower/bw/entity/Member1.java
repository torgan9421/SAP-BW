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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "MEMBER", catalog = "CIS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Member1.findAll", query = "SELECT m FROM Member1 m"),
    @NamedQuery(name = "Member1.findByMemberId", query = "SELECT m FROM Member1 m WHERE m.memberId = :memberId"),
    @NamedQuery(name = "Member1.findByMemberCode", query = "SELECT m FROM Member1 m WHERE m.memberCode = :memberCode"),
    @NamedQuery(name = "Member1.findByFullNameEng", query = "SELECT m FROM Member1 m WHERE m.fullNameEng = :fullNameEng"),
    @NamedQuery(name = "Member1.findByFullNameThai", query = "SELECT m FROM Member1 m WHERE m.fullNameThai = :fullNameThai"),
    @NamedQuery(name = "Member1.findByTitleEng", query = "SELECT m FROM Member1 m WHERE m.titleEng = :titleEng"),
    @NamedQuery(name = "Member1.findByTitleThai", query = "SELECT m FROM Member1 m WHERE m.titleThai = :titleThai"),
    @NamedQuery(name = "Member1.findBySex", query = "SELECT m FROM Member1 m WHERE m.sex = :sex"),
    @NamedQuery(name = "Member1.findByBirthday", query = "SELECT m FROM Member1 m WHERE m.birthday = :birthday"),
    @NamedQuery(name = "Member1.findByIdCard", query = "SELECT m FROM Member1 m WHERE m.idCard = :idCard"),
    @NamedQuery(name = "Member1.findByPassportNo", query = "SELECT m FROM Member1 m WHERE m.passportNo = :passportNo"),
    @NamedQuery(name = "Member1.findByMemberCardType", query = "SELECT m FROM Member1 m WHERE m.memberCardType = :memberCardType"),
    @NamedQuery(name = "Member1.findByCardTypeCoBrand", query = "SELECT m FROM Member1 m WHERE m.cardTypeCoBrand = :cardTypeCoBrand"),
    @NamedQuery(name = "Member1.findByNation", query = "SELECT m FROM Member1 m WHERE m.nation = :nation"),
    @NamedQuery(name = "Member1.findByBusinessTypeCode", query = "SELECT m FROM Member1 m WHERE m.businessTypeCode = :businessTypeCode"),
    @NamedQuery(name = "Member1.findByEmbossId", query = "SELECT m FROM Member1 m WHERE m.embossId = :embossId"),
    @NamedQuery(name = "Member1.findByEmbossName", query = "SELECT m FROM Member1 m WHERE m.embossName = :embossName"),
    @NamedQuery(name = "Member1.findByAddress1Line1", query = "SELECT m FROM Member1 m WHERE m.address1Line1 = :address1Line1"),
    @NamedQuery(name = "Member1.findByAddress1Line2", query = "SELECT m FROM Member1 m WHERE m.address1Line2 = :address1Line2"),
    @NamedQuery(name = "Member1.findByAddress1Line3", query = "SELECT m FROM Member1 m WHERE m.address1Line3 = :address1Line3"),
    @NamedQuery(name = "Member1.findByAddress1City", query = "SELECT m FROM Member1 m WHERE m.address1City = :address1City"),
    @NamedQuery(name = "Member1.findByAddress1Zip", query = "SELECT m FROM Member1 m WHERE m.address1Zip = :address1Zip"),
    @NamedQuery(name = "Member1.findByFax", query = "SELECT m FROM Member1 m WHERE m.fax = :fax"),
    @NamedQuery(name = "Member1.findByHomePhone", query = "SELECT m FROM Member1 m WHERE m.homePhone = :homePhone"),
    @NamedQuery(name = "Member1.findByMobilePhone", query = "SELECT m FROM Member1 m WHERE m.mobilePhone = :mobilePhone"),
    @NamedQuery(name = "Member1.findByEmail", query = "SELECT m FROM Member1 m WHERE m.email = :email"),
    @NamedQuery(name = "Member1.findByFacebookUserId", query = "SELECT m FROM Member1 m WHERE m.facebookUserId = :facebookUserId"),
    @NamedQuery(name = "Member1.findByNotMail", query = "SELECT m FROM Member1 m WHERE m.notMail = :notMail"),
    @NamedQuery(name = "Member1.findByHome", query = "SELECT m FROM Member1 m WHERE m.home = :home"),
    @NamedQuery(name = "Member1.findByOffice", query = "SELECT m FROM Member1 m WHERE m.office = :office"),
    @NamedQuery(name = "Member1.findByOtherAddr", query = "SELECT m FROM Member1 m WHERE m.otherAddr = :otherAddr"),
    @NamedQuery(name = "Member1.findByAddress2Line1", query = "SELECT m FROM Member1 m WHERE m.address2Line1 = :address2Line1"),
    @NamedQuery(name = "Member1.findByAddress2Line2", query = "SELECT m FROM Member1 m WHERE m.address2Line2 = :address2Line2"),
    @NamedQuery(name = "Member1.findByAddress2Line3", query = "SELECT m FROM Member1 m WHERE m.address2Line3 = :address2Line3"),
    @NamedQuery(name = "Member1.findByAddress2City", query = "SELECT m FROM Member1 m WHERE m.address2City = :address2City"),
    @NamedQuery(name = "Member1.findByAddress2Zip", query = "SELECT m FROM Member1 m WHERE m.address2Zip = :address2Zip"),
    @NamedQuery(name = "Member1.findByFax2", query = "SELECT m FROM Member1 m WHERE m.fax2 = :fax2"),
    @NamedQuery(name = "Member1.findByBusinessPhone", query = "SELECT m FROM Member1 m WHERE m.businessPhone = :businessPhone"),
    @NamedQuery(name = "Member1.findByValueSegment", query = "SELECT m FROM Member1 m WHERE m.valueSegment = :valueSegment"),
    @NamedQuery(name = "Member1.findByEmailSubscribe", query = "SELECT m FROM Member1 m WHERE m.emailSubscribe = :emailSubscribe"),
    @NamedQuery(name = "Member1.findBySmsSubscribe", query = "SELECT m FROM Member1 m WHERE m.smsSubscribe = :smsSubscribe"),
    @NamedQuery(name = "Member1.findByCreateDate", query = "SELECT m FROM Member1 m WHERE m.createDate = :createDate"),
    @NamedQuery(name = "Member1.findByCreateBy", query = "SELECT m FROM Member1 m WHERE m.createBy = :createBy"),
    @NamedQuery(name = "Member1.findByUpdateDate", query = "SELECT m FROM Member1 m WHERE m.updateDate = :updateDate"),
    @NamedQuery(name = "Member1.findByUpdateBy", query = "SELECT m FROM Member1 m WHERE m.updateBy = :updateBy"),
    @NamedQuery(name = "Member1.findByIsDelete", query = "SELECT m FROM Member1 m WHERE m.isDelete = :isDelete")})
public class Member1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MEMBER_ID", nullable = false)
    private Long memberId;
    @Basic(optional = false)
    @Column(name = "MEMBER_CODE", nullable = false, length = 50)
    private String memberCode;
    @Column(name = "FULL_NAME_ENG", length = 100)
    private String fullNameEng;
    @Basic(optional = false)
    @Column(name = "FULL_NAME_THAI", nullable = false, length = 100)
    private String fullNameThai;
    @Column(name = "TITLE_ENG", length = 100)
    private String titleEng;
    @Column(name = "TITLE_THAI", length = 100)
    private String titleThai;
    @Column(name = "SEX", length = 1)
    private String sex;
    @Column(name = "BIRTHDAY", length = 10)
    private String birthday;
    @Column(name = "ID_CARD", length = 50)
    private String idCard;
    @Column(name = "PASSPORT_NO", length = 50)
    private String passportNo;
    @Column(name = "MEMBER_CARD_TYPE", length = 50)
    private String memberCardType;
    @Column(name = "CARD_TYPE_CO_BRAND", length = 50)
    private String cardTypeCoBrand;
    @Column(name = "NATION", length = 50)
    private String nation;
    @Column(name = "BUSINESS_TYPE_CODE", length = 50)
    private String businessTypeCode;
    @Column(name = "EMBOSS_ID", length = 50)
    private String embossId;
    @Column(name = "EMBOSS_NAME", length = 100)
    private String embossName;
    @Column(name = "ADDRESS1_LINE1", length = 100)
    private String address1Line1;
    @Column(name = "ADDRESS1_LINE2", length = 100)
    private String address1Line2;
    @Column(name = "ADDRESS1_LINE3", length = 100)
    private String address1Line3;
    @Column(name = "ADDRESS1_CITY", length = 100)
    private String address1City;
    @Column(name = "ADDRESS1_ZIP", length = 50)
    private String address1Zip;
    @Column(name = "FAX", length = 50)
    private String fax;
    @Column(name = "HOME_PHONE", length = 50)
    private String homePhone;
    @Column(name = "MOBILE_PHONE", length = 50)
    private String mobilePhone;
    @Column(name = "EMAIL", length = 100)
    private String email;
    @Column(name = "FACEBOOK_USER_ID", length = 100)
    private String facebookUserId;
    @Column(name = "NOT_MAIL")
    private Integer notMail;
    @Column(name = "HOME")
    private Boolean home;
    @Column(name = "OFFICE")
    private Boolean office;
    @Column(name = "OTHER_ADDR")
    private Boolean otherAddr;
    @Column(name = "ADDRESS2_LINE1", length = 100)
    private String address2Line1;
    @Column(name = "ADDRESS2_LINE2", length = 100)
    private String address2Line2;
    @Column(name = "ADDRESS2_LINE3", length = 100)
    private String address2Line3;
    @Column(name = "ADDRESS2_CITY", length = 100)
    private String address2City;
    @Column(name = "ADDRESS2_ZIP", length = 50)
    private String address2Zip;
    @Column(name = "FAX2", length = 50)
    private String fax2;
    @Column(name = "BUSINESS_PHONE", length = 50)
    private String businessPhone;
    @Column(name = "VALUE_SEGMENT", length = 100)
    private String valueSegment;
    @Column(name = "EMAIL_SUBSCRIBE")
    private Boolean emailSubscribe;
    @Column(name = "SMS_SUBSCRIBE")
    private Boolean smsSubscribe;
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
    @JoinColumn(name = "RFM_SEGMENT_ID", referencedColumnName = "RFM_SEGMENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RfmSegment rfmSegmentId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "memberId", fetch = FetchType.LAZY)
    private List<SalesTransaction> salesTransactionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "memberId", fetch = FetchType.LAZY)
    private List<CampaignMember> campaignMemberList;

    public Member1() {
    }

    public Member1(Long memberId) {
        this.memberId = memberId;
    }

    public Member1(Long memberId, String memberCode, String fullNameThai, Date createDate, String createBy, char isDelete) {
        this.memberId = memberId;
        this.memberCode = memberCode;
        this.fullNameThai = fullNameThai;
        this.createDate = createDate;
        this.createBy = createBy;
        this.isDelete = isDelete;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getFullNameEng() {
        return fullNameEng;
    }

    public void setFullNameEng(String fullNameEng) {
        this.fullNameEng = fullNameEng;
    }

    public String getFullNameThai() {
        return fullNameThai;
    }

    public void setFullNameThai(String fullNameThai) {
        this.fullNameThai = fullNameThai;
    }

    public String getTitleEng() {
        return titleEng;
    }

    public void setTitleEng(String titleEng) {
        this.titleEng = titleEng;
    }

    public String getTitleThai() {
        return titleThai;
    }

    public void setTitleThai(String titleThai) {
        this.titleThai = titleThai;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getMemberCardType() {
        return memberCardType;
    }

    public void setMemberCardType(String memberCardType) {
        this.memberCardType = memberCardType;
    }

    public String getCardTypeCoBrand() {
        return cardTypeCoBrand;
    }

    public void setCardTypeCoBrand(String cardTypeCoBrand) {
        this.cardTypeCoBrand = cardTypeCoBrand;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBusinessTypeCode() {
        return businessTypeCode;
    }

    public void setBusinessTypeCode(String businessTypeCode) {
        this.businessTypeCode = businessTypeCode;
    }

    public String getEmbossId() {
        return embossId;
    }

    public void setEmbossId(String embossId) {
        this.embossId = embossId;
    }

    public String getEmbossName() {
        return embossName;
    }

    public void setEmbossName(String embossName) {
        this.embossName = embossName;
    }

    public String getAddress1Line1() {
        return address1Line1;
    }

    public void setAddress1Line1(String address1Line1) {
        this.address1Line1 = address1Line1;
    }

    public String getAddress1Line2() {
        return address1Line2;
    }

    public void setAddress1Line2(String address1Line2) {
        this.address1Line2 = address1Line2;
    }

    public String getAddress1Line3() {
        return address1Line3;
    }

    public void setAddress1Line3(String address1Line3) {
        this.address1Line3 = address1Line3;
    }

    public String getAddress1City() {
        return address1City;
    }

    public void setAddress1City(String address1City) {
        this.address1City = address1City;
    }

    public String getAddress1Zip() {
        return address1Zip;
    }

    public void setAddress1Zip(String address1Zip) {
        this.address1Zip = address1Zip;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebookUserId() {
        return facebookUserId;
    }

    public void setFacebookUserId(String facebookUserId) {
        this.facebookUserId = facebookUserId;
    }

    public Integer getNotMail() {
        return notMail;
    }

    public void setNotMail(Integer notMail) {
        this.notMail = notMail;
    }

    public Boolean getHome() {
        return home;
    }

    public void setHome(Boolean home) {
        this.home = home;
    }

    public Boolean getOffice() {
        return office;
    }

    public void setOffice(Boolean office) {
        this.office = office;
    }

    public Boolean getOtherAddr() {
        return otherAddr;
    }

    public void setOtherAddr(Boolean otherAddr) {
        this.otherAddr = otherAddr;
    }

    public String getAddress2Line1() {
        return address2Line1;
    }

    public void setAddress2Line1(String address2Line1) {
        this.address2Line1 = address2Line1;
    }

    public String getAddress2Line2() {
        return address2Line2;
    }

    public void setAddress2Line2(String address2Line2) {
        this.address2Line2 = address2Line2;
    }

    public String getAddress2Line3() {
        return address2Line3;
    }

    public void setAddress2Line3(String address2Line3) {
        this.address2Line3 = address2Line3;
    }

    public String getAddress2City() {
        return address2City;
    }

    public void setAddress2City(String address2City) {
        this.address2City = address2City;
    }

    public String getAddress2Zip() {
        return address2Zip;
    }

    public void setAddress2Zip(String address2Zip) {
        this.address2Zip = address2Zip;
    }

    public String getFax2() {
        return fax2;
    }

    public void setFax2(String fax2) {
        this.fax2 = fax2;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getValueSegment() {
        return valueSegment;
    }

    public void setValueSegment(String valueSegment) {
        this.valueSegment = valueSegment;
    }

    public Boolean getEmailSubscribe() {
        return emailSubscribe;
    }

    public void setEmailSubscribe(Boolean emailSubscribe) {
        this.emailSubscribe = emailSubscribe;
    }

    public Boolean getSmsSubscribe() {
        return smsSubscribe;
    }

    public void setSmsSubscribe(Boolean smsSubscribe) {
        this.smsSubscribe = smsSubscribe;
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

    public RfmSegment getRfmSegmentId() {
        return rfmSegmentId;
    }

    public void setRfmSegmentId(RfmSegment rfmSegmentId) {
        this.rfmSegmentId = rfmSegmentId;
    }

    @XmlTransient
    public List<SalesTransaction> getSalesTransactionList() {
        return salesTransactionList;
    }

    public void setSalesTransactionList(List<SalesTransaction> salesTransactionList) {
        this.salesTransactionList = salesTransactionList;
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
        hash += (memberId != null ? memberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Member1)) {
            return false;
        }
        Member1 other = (Member1) object;
        if ((this.memberId == null && other.memberId != null) || (this.memberId != null && !this.memberId.equals(other.memberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.th.kingpower.bw.entity.Member1[ memberId=" + memberId + " ]";
    }
    
}
