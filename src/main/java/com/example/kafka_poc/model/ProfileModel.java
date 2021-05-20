package com.example.kafka_poc.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
import java.sql.Timestamp;

public class ProfileModel {

    private long profileSeqId;
    private String titleNameCodeTh;
    private String titleNameTh;
    private String firstNameTh;
    private String middleNameTh;
    private String lastNameTh;
    private String titleNameCodeEn;
    private String titleNameEn;
    private String firstNameEn;
    private String middleNameEn;
    private String lastNameEn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date cardIssueDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date cardExpireDate;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    private String citizenIdHash;
    private String citizenIdEncypted;
    private String citizenIdMarking;
    private String mobileNoHash;
    private String mobileNoEncypted;
    private String mobileNoMarking;
    private String emailHash;
    private String emailEncypted;
    private String emailMarking;
    private String occupationSector;
    private String occupationCode;
    private String occupationSubCode;
    private String incomeCode;
    private String maritalStatus;
    private String sex;
    private String educationCode;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Timestamp createDatetime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Timestamp updateDatetime;

    public long getProfileSeqId() {
        return profileSeqId;
    }

    public void setProfileSeqId(long profileSeqId) {
        this.profileSeqId = profileSeqId;
    }

    public String getTitleNameCodeTh() {
        return titleNameCodeTh;
    }

    public void setTitleNameCodeTh(String titleNameCodeTh) {
        this.titleNameCodeTh = titleNameCodeTh;
    }

    public String getTitleNameTh() {
        return titleNameTh;
    }

    public void setTitleNameTh(String titleNameTh) {
        this.titleNameTh = titleNameTh;
    }

    public String getFirstNameTh() {
        return firstNameTh;
    }

    public void setFirstNameTh(String firstNameTh) {
        this.firstNameTh = firstNameTh;
    }

    public String getMiddleNameTh() {
        return middleNameTh;
    }

    public void setMiddleNameTh(String middleNameTh) {
        this.middleNameTh = middleNameTh;
    }

    public String getLastNameTh() {
        return lastNameTh;
    }

    public void setLastNameTh(String lastNameTh) {
        this.lastNameTh = lastNameTh;
    }

    public String getTitleNameCodeEn() {
        return titleNameCodeEn;
    }

    public void setTitleNameCodeEn(String titleNameCodeEn) {
        this.titleNameCodeEn = titleNameCodeEn;
    }

    public String getTitleNameEn() {
        return titleNameEn;
    }

    public void setTitleNameEn(String titleNameEn) {
        this.titleNameEn = titleNameEn;
    }

    public String getFirstNameEn() {
        return firstNameEn;
    }

    public void setFirstNameEn(String firstNameEn) {
        this.firstNameEn = firstNameEn;
    }

    public String getMiddleNameEn() {
        return middleNameEn;
    }

    public void setMiddleNameEn(String middleNameEn) {
        this.middleNameEn = middleNameEn;
    }

    public String getLastNameEn() {
        return lastNameEn;
    }

    public void setLastNameEn(String lastNameEn) {
        this.lastNameEn = lastNameEn;
    }

    public Date getCardIssueDate() {
        return cardIssueDate;
    }

    public void setCardIssueDate(Date cardIssueDate) {
        this.cardIssueDate = cardIssueDate;
    }

    public Date getCardExpireDate() {
        return cardExpireDate;
    }

    public void setCardExpireDate(Date cardExpireDate) {
        this.cardExpireDate = cardExpireDate;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getCitizenIdHash() {
        return citizenIdHash;
    }

    public void setCitizenIdHash(String citizenIdHash) {
        this.citizenIdHash = citizenIdHash;
    }

    public String getCitizenIdEncypted() {
        return citizenIdEncypted;
    }

    public void setCitizenIdEncypted(String citizenIdEncypted) {
        this.citizenIdEncypted = citizenIdEncypted;
    }

    public String getCitizenIdMarking() {
        return citizenIdMarking;
    }

    public void setCitizenIdMarking(String citizenIdMarking) {
        this.citizenIdMarking = citizenIdMarking;
    }

    public String getMobileNoHash() {
        return mobileNoHash;
    }

    public void setMobileNoHash(String mobileNoHash) {
        this.mobileNoHash = mobileNoHash;
    }

    public String getMobileNoEncypted() {
        return mobileNoEncypted;
    }

    public void setMobileNoEncypted(String mobileNoEncypted) {
        this.mobileNoEncypted = mobileNoEncypted;
    }

    public String getMobileNoMarking() {
        return mobileNoMarking;
    }

    public void setMobileNoMarking(String mobileNoMarking) {
        this.mobileNoMarking = mobileNoMarking;
    }

    public String getEmailHash() {
        return emailHash;
    }

    public void setEmailHash(String emailHash) {
        this.emailHash = emailHash;
    }

    public String getEmailEncypted() {
        return emailEncypted;
    }

    public void setEmailEncypted(String emailEncypted) {
        this.emailEncypted = emailEncypted;
    }

    public String getEmailMarking() {
        return emailMarking;
    }

    public void setEmailMarking(String emailMarking) {
        this.emailMarking = emailMarking;
    }

    public String getOccupationSector() {
        return occupationSector;
    }

    public void setOccupationSector(String occupationSector) {
        this.occupationSector = occupationSector;
    }

    public String getOccupationCode() {
        return occupationCode;
    }

    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode;
    }

    public String getOccupationSubCode() {
        return occupationSubCode;
    }

    public void setOccupationSubCode(String occupationSubCode) {
        this.occupationSubCode = occupationSubCode;
    }

    public String getIncomeCode() {
        return incomeCode;
    }

    public void setIncomeCode(String incomeCode) {
        this.incomeCode = incomeCode;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducationCode() {
        return educationCode;
    }

    public void setEducationCode(String educationCode) {
        this.educationCode = educationCode;
    }

    public Timestamp getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Timestamp createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Timestamp getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Timestamp updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}
