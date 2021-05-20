package com.example.kafka_poc.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class CddModel {
    private long profileSeqId;
    private String answerCode1;
    private String answerCode2;
    private String openAcctPurpose;
    private String openAcctPurposeOther;
    private String incomeSrc;
    private String incomeSrcOther;
    private String incomeSrcCountry;
    private String depTxfrTxnsAmt;
    private String depTxfrTxnsAmtPerMonth;
    private String wdrlTxfrTxnsAmt;
    private String wdrlTxfrTxnsAmtPerMonth;

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

    public String getAnswerCode1() {
        return answerCode1;
    }

    public void setAnswerCode1(String answerCode1) {
        this.answerCode1 = answerCode1;
    }

    public String getAnswerCode2() {
        return answerCode2;
    }

    public void setAnswerCode2(String answerCode2) {
        this.answerCode2 = answerCode2;
    }

    public String getOpenAcctPurpose() {
        return openAcctPurpose;
    }

    public void setOpenAcctPurpose(String openAcctPurpose) {
        this.openAcctPurpose = openAcctPurpose;
    }

    public String getOpenAcctPurposeOther() {
        return openAcctPurposeOther;
    }

    public void setOpenAcctPurposeOther(String openAcctPurposeOther) {
        this.openAcctPurposeOther = openAcctPurposeOther;
    }

    public String getIncomeSrc() {
        return incomeSrc;
    }

    public void setIncomeSrc(String incomeSrc) {
        this.incomeSrc = incomeSrc;
    }

    public String getIncomeSrcOther() {
        return incomeSrcOther;
    }

    public void setIncomeSrcOther(String incomeSrcOther) {
        this.incomeSrcOther = incomeSrcOther;
    }

    public String getIncomeSrcCountry() {
        return incomeSrcCountry;
    }

    public void setIncomeSrcCountry(String incomeSrcCountry) {
        this.incomeSrcCountry = incomeSrcCountry;
    }

    public String getDepTxfrTxnsAmt() {
        return depTxfrTxnsAmt;
    }

    public void setDepTxfrTxnsAmt(String depTxfrTxnsAmt) {
        this.depTxfrTxnsAmt = depTxfrTxnsAmt;
    }

    public String getDepTxfrTxnsAmtPerMonth() {
        return depTxfrTxnsAmtPerMonth;
    }

    public void setDepTxfrTxnsAmtPerMonth(String depTxfrTxnsAmtPerMonth) {
        this.depTxfrTxnsAmtPerMonth = depTxfrTxnsAmtPerMonth;
    }

    public String getWdrlTxfrTxnsAmt() {
        return wdrlTxfrTxnsAmt;
    }

    public void setWdrlTxfrTxnsAmt(String wdrlTxfrTxnsAmt) {
        this.wdrlTxfrTxnsAmt = wdrlTxfrTxnsAmt;
    }

    public String getWdrlTxfrTxnsAmtPerMonth() {
        return wdrlTxfrTxnsAmtPerMonth;
    }

    public void setWdrlTxfrTxnsAmtPerMonth(String wdrlTxfrTxnsAmtPerMonth) {
        this.wdrlTxfrTxnsAmtPerMonth = wdrlTxfrTxnsAmtPerMonth;
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
