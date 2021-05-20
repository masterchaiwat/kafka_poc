package com.example.kafka_poc.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
import java.sql.Timestamp;

public class OpenAccountModel {
    private String openaccRefId;
    private long profileSeqId;
    private String branchCd;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date reserveVerifyDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date txnDate;

    private String openaccStatus;
    private String productId;
    private String accountNoHash;
    private String accountNoEncypted;
    private String accountNoMarking;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Timestamp createDatetime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Timestamp updateDatetime;

    public String getOpenaccRefId() {
        return openaccRefId;
    }

    public void setOpenaccRefId(String openaccRefId) {
        this.openaccRefId = openaccRefId;
    }

    public long getProfileSeqId() {
        return profileSeqId;
    }

    public void setProfileSeqId(long profileSeqId) {
        this.profileSeqId = profileSeqId;
    }

    public String getBranchCd() {
        return branchCd;
    }

    public void setBranchCd(String branchCd) {
        this.branchCd = branchCd;
    }

    public Date getReserveVerifyDate() {
        return reserveVerifyDate;
    }

    public void setReserveVerifyDate(Date reserveVerifyDate) {
        this.reserveVerifyDate = reserveVerifyDate;
    }

    public Date getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(Date txnDate) {
        this.txnDate = txnDate;
    }

    public String getOpenaccStatus() {
        return openaccStatus;
    }

    public void setOpenaccStatus(String openaccStatus) {
        this.openaccStatus = openaccStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getAccountNoHash() {
        return accountNoHash;
    }

    public void setAccountNoHash(String accountNoHash) {
        this.accountNoHash = accountNoHash;
    }

    public String getAccountNoEncypted() {
        return accountNoEncypted;
    }

    public void setAccountNoEncypted(String accountNoEncypted) {
        this.accountNoEncypted = accountNoEncypted;
    }

    public String getAccountNoMarking() {
        return accountNoMarking;
    }

    public void setAccountNoMarking(String accountNoMarking) {
        this.accountNoMarking = accountNoMarking;
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
