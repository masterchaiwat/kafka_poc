package com.example.kafka_poc.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
import java.sql.Timestamp;

public class OpenAccountHistoryModel {
    private long openaccHistId;
    private String openaccRefId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date txnDate;
    private String openaccStatus;
    private String updateBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Timestamp updateDatetime;
    private String remark;

    public long getOpenaccHistId() {
        return openaccHistId;
    }

    public void setOpenaccHistId(long openaccHistId) {
        this.openaccHistId = openaccHistId;
    }

    public String getOpenaccRefId() {
        return openaccRefId;
    }

    public void setOpenaccRefId(String openaccRefId) {
        this.openaccRefId = openaccRefId;
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

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Timestamp getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Timestamp updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
