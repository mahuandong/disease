package com.disease.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.disease.mapper.DiseaseMapper;
import com.disease.entity.Disease;
import com.disease.service.DiseaseService;
@Service
public class DiseaseServiceImpl implements DiseaseService{

    @Resource
    private DiseaseMapper diseaseMapper;

    @Override
    public int deleteByPrimaryKey(Integer diseaseId) {
        return diseaseMapper.deleteByPrimaryKey(diseaseId);
    }

    @Override
    public int insert(Disease record) {
        return diseaseMapper.insert(record);
    }

    @Override
    public int insertSelective(Disease record) {
        return diseaseMapper.insertSelective(record);
    }

    @Override
    public Disease selectByPrimaryKey(Integer diseaseId) {
        return diseaseMapper.selectByPrimaryKey(diseaseId);
    }

    @Override
    public int updateByPrimaryKeySelective(Disease record) {
        return diseaseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Disease record) {
        return diseaseMapper.updateByPrimaryKey(record);
    }

}
