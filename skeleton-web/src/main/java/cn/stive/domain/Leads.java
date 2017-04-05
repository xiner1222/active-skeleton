package cn.stive.domain;

import java.util.Date;

/**
 * @author lixiaotian
 */
public class Leads {
    private Long id;

    /** 分配时间 */
    private Date createTime;

    /** 用户注册时间 */
    private Date registerTime;

    /** 学生ID */
    private Long studentId;

    /** 家庭ID */
    private Long familyId;

    /** 销售人员ID */
    private Long salesId;

    /** 销售人员姓名 */
    private String salesName;

    /** 销售人员接收日期 */
    private Date salesAssignTime;

    /** tmk人员ID */
    private Long tmkId;

    /** tmk人员姓名 */
    private String tmkName;

    /** tmk人员接收日期 */
    private Date tmkAssignTime;

    /** leads拥有者类型-1:默认,0:STAFF_SALES_DIRECTOR,1:STAFF_SALES,2:STAFF_TMK */
    private Byte ownerType;

    /** 渠道 */
    private String channel;

    /** lead类型，A/B/C */
    private String leadType;

    /** 锁定时间 */
    private Date lockedTime;

    /** 是否锁定 */
    private Byte locked;

    /** leads状态，-1初始化，0已分配,1已联系,2约到trial课，3已缴费 */
    private Byte status;

    /** 是否在library里,0-否,1-是 */
    private Byte isLibrary;

    /** 是否联系,0-否,1-是 */
    private Byte isContact;

    /** 最后修改时间 */
    private Date lastModifyTime;

    /** library_level */
    private Byte libraryLevel;

    /** from_library_level */
    private Byte fromLibraryLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public Long getSalesId() {
        return salesId;
    }

    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public Date getSalesAssignTime() {
        return salesAssignTime;
    }

    public void setSalesAssignTime(Date salesAssignTime) {
        this.salesAssignTime = salesAssignTime;
    }

    public Long getTmkId() {
        return tmkId;
    }

    public void setTmkId(Long tmkId) {
        this.tmkId = tmkId;
    }

    public String getTmkName() {
        return tmkName;
    }

    public void setTmkName(String tmkName) {
        this.tmkName = tmkName;
    }

    public Date getTmkAssignTime() {
        return tmkAssignTime;
    }

    public void setTmkAssignTime(Date tmkAssignTime) {
        this.tmkAssignTime = tmkAssignTime;
    }

    public Byte getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Byte ownerType) {
        this.ownerType = ownerType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getLeadType() {
        return leadType;
    }

    public void setLeadType(String leadType) {
        this.leadType = leadType;
    }

    public Date getLockedTime() {
        return lockedTime;
    }

    public void setLockedTime(Date lockedTime) {
        this.lockedTime = lockedTime;
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getIsLibrary() {
        return isLibrary;
    }

    public void setIsLibrary(Byte isLibrary) {
        this.isLibrary = isLibrary;
    }

    public Byte getIsContact() {
        return isContact;
    }

    public void setIsContact(Byte isContact) {
        this.isContact = isContact;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Byte getLibraryLevel() {
        return libraryLevel;
    }

    public void setLibraryLevel(Byte libraryLevel) {
        this.libraryLevel = libraryLevel;
    }

    public Byte getFromLibraryLevel() {
        return fromLibraryLevel;
    }

    public void setFromLibraryLevel(Byte fromLibraryLevel) {
        this.fromLibraryLevel = fromLibraryLevel;
    }
}
