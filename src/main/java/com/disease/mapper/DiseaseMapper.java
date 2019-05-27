package com.disease.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.disease.entity.Disease;

public interface DiseaseMapper {
    int deleteByPrimaryKey(Integer diseaseId);

    int insert(Disease record);

    int insertSelective(Disease record);

    Disease selectByPrimaryKey(Integer diseaseId);

    int updateByPrimaryKeySelective(Disease record);

    int updateByPrimaryKey(Disease record);

    List<Disease> findBySymptom(@Param("symptom")String symptom);


}