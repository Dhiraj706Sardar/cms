package com.cms.system.cms.service.impl;

import com.cms.system.cms.entity.ExamResult;
import com.cms.system.cms.repository.ExamResultRepository;
import com.cms.system.cms.service.ExamResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamResultServiceImpl implements ExamResultService {

    @Autowired
    private ExamResultRepository examResultRepository;

    @Override
    public List<ExamResult> getAllExamResults() {
        return examResultRepository.findAll();
    }

    @Override
    public ExamResult getExamResultById(Long id) {
        return examResultRepository.findById(id).orElse(null);
    }

    @Override
    public ExamResult createExamResult(ExamResult examResult) {
        return examResultRepository.save(examResult);
    }

    @Override
    public ExamResult updateExamResult(Long id, ExamResult examResult) {
        if (examResultRepository.existsById(id)) {
            examResult.setResultId(id);
            return examResultRepository.save(examResult);
        }
        return null;
    }

    @Override
    public void deleteExamResult(Long id) {
        examResultRepository.deleteById(id);
    }
}