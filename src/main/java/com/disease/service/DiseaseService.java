package com.disease.service;

import com.disease.entity.Disease;
public interface DiseaseService{


    int deleteByPrimaryKey(Integer diseaseId);

    int insert(Disease record);

    int insertSelective(Disease record);

    Disease selectByPrimaryKey(Integer diseaseId);

    int updateByPrimaryKeySelective(Disease record);

    int updateByPrimaryKey(Disease record);

}
