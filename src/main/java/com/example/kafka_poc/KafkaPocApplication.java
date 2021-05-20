package com.example.kafka_poc;

import com.example.kafka_poc.message.DipgoMessageProducer;
import com.example.kafka_poc.model.*;
import com.example.kafka_poc.model.mirrors.AddressMirrors;
import com.example.kafka_poc.model.mirrors.ProfileMirror;
import com.example.kafka_poc.service.KafkaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import org.apache.kafka.common.errors.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Locale;

@SpringBootApplication
public class KafkaPocApplication {

    @Autowired
    private DipgoMessageProducer dipgoMessageProducer;

    private static final Logger LOGGER= LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(KafkaPocApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup() {
        return args -> {

            Timestamp currentTime = new Timestamp(System.currentTimeMillis());

            DipgoModel dg = new DipgoModel();

            ProfileModel profile = new ProfileModel();
            profile.setProfileSeqId(157);
            profile.setTitleNameCodeTh("");
            profile.setTitleNameTh("");
            profile.setFirstNameTh("มนัญา");
            profile.setLastNameTh("เจตน์เจริญรักษ์");
            profile.setTitleNameCodeEn("");
            profile.setTitleNameEn("");
            profile.setFirstNameEn("");
            profile.setLastNameEn("");
            profile.setMiddleNameEn("");
            profile.setCardIssueDate(null);
            profile.setCardExpireDate(null);
            profile.setBirthDay("15");
            profile.setBirthMonth("02");
            profile.setBirthYear("1985");
            profile.setCitizenIdHash("20b6c1e5a48e3afae83a301326ee250b8cff6d8eba8f7fbfdb9d1facbdf53855");
            profile.setCitizenIdEncypted("1zKAq1P+LeGwX8dEpkfi\\/ZhExZEkemDE8\\/NJo0I=");
            profile.setCitizenIdMarking("110XXXXXX5388");
            profile.setMobileNoHash("cdb531b3354346553e1bc700465936984f0ceac3a29c7f475e6b57c16b22e227");
            profile.setMobileNoEncypted("1jqDrlH8KOW+XO7CEBQQjYnXqwIAhI8l3s4=");
            profile.setMobileNoMarking("0XXXXX5566");
            profile.setEmailHash("4764dc6901ac1632837748d0980d649a1a23ee24225b5b40b2be9c2d68da9cac");
            profile.setEmailEncypted("i3re+gmrcLHmH5o8+Q+x+j1j3NFv1xaYVWluaYG4iwYNmtTLTA==");
            profile.setEmailMarking("m****n@gmail.com");
            profile.setOccupationSector("1");
            profile.setOccupationCode("0705");
            profile.setOccupationSubCode("");
            profile.setIncomeCode("4");
            profile.setMaritalStatus("");
            profile.setSex("");
            profile.setEducationCode("");
            profile.setCreateDatetime(currentTime);
            profile.setUpdateDatetime(currentTime);
            dg.setProfile(profile);


            AddressModel ad = new AddressModel();
            ad.setProfileSeqId(157);
            ad.setOfficeName("office 0001");
            ad.setOfficeAddress1("44");
            ad.setOfficeAddress2(null);
            ad.setOfficeAddress3(null);
            ad.setOfficeCountryCode(null);
            ad.setOfficeProvinceCode("12");
            ad.setOfficeDistrictCode("01");
            ad.setOfficeSubDistrictCode("0400");
            ad.setOfficePostcodeCode("11000");
            ad.setOfficePhone("022290099");
            ad.setOfficeInternalPhone("123");

            ad.setLegalAddress1("44");
            ad.setLegalAddress2("44");
            ad.setLegalAddress3("44");
            ad.setLegalCountryCode(null);
            ad.setLegalProvinceCode("12");
            ad.setLegalDistrictCode("01");
            ad.setLegalSubDistrictCode("0400");
            ad.setLegalPostcodeCode("11000");

            ad.setCurrentAddress1("44");
            ad.setCurrentAddress2("44");
            ad.setCurrentAddress3("44");
            ad.setCurrentCountryCode(null);
            ad.setCurrentProvinceCode("12");
            ad.setCurrentDistrictCode("01");
            ad.setCurrentSubDistrictCode("0400");
            ad.setCurrentPostcodeCode("11000");

            ad.setCreateDatetime(currentTime);
            ad.setUpdateDatetime(currentTime);
            dg.setAddress(ad);

            CddModel cdd = new CddModel();
            cdd.setProfileSeqId(157);
            cdd.setAnswerCode1("N");
            cdd.setAnswerCode2("N");
            cdd.setOpenAcctPurpose("04");
            cdd.setOpenAcctPurposeOther("");
            cdd.setIncomeSrc("05");
            cdd.setIncomeSrcOther("");
            cdd.setIncomeSrcCountry("TH");
            cdd.setDepTxfrTxnsAmtPerMonth("0");
            cdd.setWdrlTxfrTxnsAmtPerMonth("0");
            cdd.setCreateDatetime(currentTime);
            cdd.setUpdateDatetime(currentTime);
            dg.setCdd(cdd);

            ConsentModel consent = new ConsentModel();
            consent.setProfileSeqId(157);
            consent.setAnswerCode1("Y");
            consent.setAnswerCode2("Y");
            consent.setAnswerCode3("Y");
            consent.setCreateDatetime(currentTime);
            consent.setUpdateDatetime(currentTime);
            consent.setConsentVersion("1.4");
            dg.setConsent(consent);

            FatcaModel fatca = new FatcaModel();
            fatca.setProfileSeqId(157);
            fatca.setAnswerCode1("N");
            fatca.setAnswerCode2("N");
            fatca.setCreateDatetime(currentTime);
            fatca.setUpdateDatetime(currentTime);
            dg.setFatca(fatca);

            java.sql.Date currentSqlDate = new java.sql.Date(Calendar.getInstance(Locale.US).getTime().getTime());

            OpenAccountHistoryModel openAccountHistory = new OpenAccountHistoryModel();
            openAccountHistory.setOpenaccHistId(553);
            openAccountHistory.setOpenaccRefId("202105140000000142538844871");
            openAccountHistory.setTxnDate(currentSqlDate);
            openAccountHistory.setOpenaccStatus("CREATE");
            openAccountHistory.setUpdateBy("WEB");
            openAccountHistory.setUpdateDatetime(currentTime);
            dg.setOpenAccountHistory(openAccountHistory);

            OpenAccountModel openAccount = new OpenAccountModel();
            openAccount.setOpenaccRefId("202105140000000142538844871");
            openAccount.setProfileSeqId(157);
            openAccount.setBranchCd("142");
            openAccount.setReserveVerifyDate(currentSqlDate);
            openAccount.setTxnDate(currentSqlDate);
            openAccount.setOpenaccStatus("CREATE");
            openAccount.setProductId("2001");
            openAccount.setCreateDatetime(currentTime);
            openAccount.setUpdateDatetime(currentTime);
            dg.setOpenAccount(openAccount);

            AddressMirrors ad2 = new AddressMirrors();
            BeanUtils.copyProperties(ad, ad2);

            ProfileMirror pr2 = new ProfileMirror();
            BeanUtils.copyProperties(profile, pr2);

            /*ObjectMapper mapper = new ObjectMapper();
            try {
                String json = mapper.writeValueAsString(dg);
                LOGGER.info(json);
                //System.out.println(json);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }*/

            dipgoMessageProducer.sendOpenAccount(dg);



            System.out.println("--------------- finish -------------");

        };
    }

}
