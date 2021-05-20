package com.example.kafka_poc.model;

public class DipgoModel {

    private ProfileModel profile;
    private AddressModel address;
    private CddModel cdd;
    private ConsentModel consent;
    private FatcaModel fatca;
    private OpenAccountModel openAccount;
    private OpenAccountHistoryModel openAccountHistory;

    public ProfileModel getProfile() {
        return profile;
    }

    public void setProfile(ProfileModel profile) {
        this.profile = profile;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public CddModel getCdd() {
        return cdd;
    }

    public void setCdd(CddModel cdd) {
        this.cdd = cdd;
    }

    public ConsentModel getConsent() {
        return consent;
    }

    public void setConsent(ConsentModel consent) {
        this.consent = consent;
    }

    public FatcaModel getFatca() {
        return fatca;
    }

    public void setFatca(FatcaModel fatca) {
        this.fatca = fatca;
    }

    public OpenAccountModel getOpenAccount() {
        return openAccount;
    }

    public void setOpenAccount(OpenAccountModel openAccount) {
        this.openAccount = openAccount;
    }

    public OpenAccountHistoryModel getOpenAccountHistory() {
        return openAccountHistory;
    }

    public void setOpenAccountHistory(OpenAccountHistoryModel openAccountHistory) {
        this.openAccountHistory = openAccountHistory;
    }
}
