package com.example.kafka_poc.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class AddressModel {
    private long profileSeqId;
    private String officeName;
    private String officeAddress1;
    private String officeAddress2;
    private String officeAddress3;
    private String officeCountryCode;
    private String officeProvinceCode;
    private String officeDistrictCode;
    private String officeSubDistrictCode;
    private String officePostcodeCode;
    private String officePhone;
    private String officeInternalPhone;
    private String legalAddress1;
    private String legalAddress2;
    private String legalAddress3;
    private String legalCountryCode;
    private String legalProvinceCode;
    private String legalDistrictCode;
    private String legalSubDistrictCode;
    private String legalPostcodeCode;
    private String currentAddress1;
    private String currentAddress2;
    private String currentAddress3;
    private String currentCountryCode;
    private String currentProvinceCode;
    private String currentDistrictCode;
    private String currentSubDistrictCode;
    private String currentPostcodeCode;
    private String currentPhone;

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

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeAddress1() {
        return officeAddress1;
    }

    public void setOfficeAddress1(String officeAddress1) {
        this.officeAddress1 = officeAddress1;
    }

    public String getOfficeAddress2() {
        return officeAddress2;
    }

    public void setOfficeAddress2(String officeAddress2) {
        this.officeAddress2 = officeAddress2;
    }

    public String getOfficeAddress3() {
        return officeAddress3;
    }

    public void setOfficeAddress3(String officeAddress3) {
        this.officeAddress3 = officeAddress3;
    }

    public String getOfficeCountryCode() {
        return officeCountryCode;
    }

    public void setOfficeCountryCode(String officeCountryCode) {
        this.officeCountryCode = officeCountryCode;
    }

    public String getOfficeProvinceCode() {
        return officeProvinceCode;
    }

    public void setOfficeProvinceCode(String officeProvinceCode) {
        this.officeProvinceCode = officeProvinceCode;
    }

    public String getOfficeDistrictCode() {
        return officeDistrictCode;
    }

    public void setOfficeDistrictCode(String officeDistrictCode) {
        this.officeDistrictCode = officeDistrictCode;
    }

    public String getOfficeSubDistrictCode() {
        return officeSubDistrictCode;
    }

    public void setOfficeSubDistrictCode(String officeSubDistrictCode) {
        this.officeSubDistrictCode = officeSubDistrictCode;
    }

    public String getOfficePostcodeCode() {
        return officePostcodeCode;
    }

    public void setOfficePostcodeCode(String officePostcodeCode) {
        this.officePostcodeCode = officePostcodeCode;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getOfficeInternalPhone() {
        return officeInternalPhone;
    }

    public void setOfficeInternalPhone(String officeInternalPhone) {
        this.officeInternalPhone = officeInternalPhone;
    }

    public String getLegalAddress1() {
        return legalAddress1;
    }

    public void setLegalAddress1(String legalAddress1) {
        this.legalAddress1 = legalAddress1;
    }

    public String getLegalAddress2() {
        return legalAddress2;
    }

    public void setLegalAddress2(String legalAddress2) {
        this.legalAddress2 = legalAddress2;
    }

    public String getLegalAddress3() {
        return legalAddress3;
    }

    public void setLegalAddress3(String legalAddress3) {
        this.legalAddress3 = legalAddress3;
    }

    public String getLegalCountryCode() {
        return legalCountryCode;
    }

    public void setLegalCountryCode(String legalCountryCode) {
        this.legalCountryCode = legalCountryCode;
    }

    public String getLegalProvinceCode() {
        return legalProvinceCode;
    }

    public void setLegalProvinceCode(String legalProvinceCode) {
        this.legalProvinceCode = legalProvinceCode;
    }

    public String getLegalDistrictCode() {
        return legalDistrictCode;
    }

    public void setLegalDistrictCode(String legalDistrictCode) {
        this.legalDistrictCode = legalDistrictCode;
    }

    public String getLegalSubDistrictCode() {
        return legalSubDistrictCode;
    }

    public void setLegalSubDistrictCode(String legalSubDistrictCode) {
        this.legalSubDistrictCode = legalSubDistrictCode;
    }

    public String getLegalPostcodeCode() {
        return legalPostcodeCode;
    }

    public void setLegalPostcodeCode(String legalPostcodeCode) {
        this.legalPostcodeCode = legalPostcodeCode;
    }

    public String getCurrentAddress1() {
        return currentAddress1;
    }

    public void setCurrentAddress1(String currentAddress1) {
        this.currentAddress1 = currentAddress1;
    }

    public String getCurrentAddress2() {
        return currentAddress2;
    }

    public void setCurrentAddress2(String currentAddress2) {
        this.currentAddress2 = currentAddress2;
    }

    public String getCurrentAddress3() {
        return currentAddress3;
    }

    public void setCurrentAddress3(String currentAddress3) {
        this.currentAddress3 = currentAddress3;
    }

    public String getCurrentCountryCode() {
        return currentCountryCode;
    }

    public void setCurrentCountryCode(String currentCountryCode) {
        this.currentCountryCode = currentCountryCode;
    }

    public String getCurrentProvinceCode() {
        return currentProvinceCode;
    }

    public void setCurrentProvinceCode(String currentProvinceCode) {
        this.currentProvinceCode = currentProvinceCode;
    }

    public String getCurrentDistrictCode() {
        return currentDistrictCode;
    }

    public void setCurrentDistrictCode(String currentDistrictCode) {
        this.currentDistrictCode = currentDistrictCode;
    }

    public String getCurrentSubDistrictCode() {
        return currentSubDistrictCode;
    }

    public void setCurrentSubDistrictCode(String currentSubDistrictCode) {
        this.currentSubDistrictCode = currentSubDistrictCode;
    }

    public String getCurrentPostcodeCode() {
        return currentPostcodeCode;
    }

    public void setCurrentPostcodeCode(String currentPostcodeCode) {
        this.currentPostcodeCode = currentPostcodeCode;
    }

    public String getCurrentPhone() {
        return currentPhone;
    }

    public void setCurrentPhone(String currentPhone) {
        this.currentPhone = currentPhone;
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
