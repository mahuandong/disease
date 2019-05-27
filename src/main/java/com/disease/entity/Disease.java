package com.disease.entity;

import java.io.Serializable;

/**
 * 病症
 */
public class Disease implements Serializable {
    private Integer diseaseId;

    /**
    * 疾病名称
    */
    private String diseaseName;

    /**
    * 症状
    */
    private String symptom;

    private static final long serialVersionUID = 1L;

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
}