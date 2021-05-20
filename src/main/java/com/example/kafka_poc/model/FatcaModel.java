package com.example.kafka_poc.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class FatcaModel {
    private long profileSeqId;
    private String answerCode1;
    private String answerCode2;

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
