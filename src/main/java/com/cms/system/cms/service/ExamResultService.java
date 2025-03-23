package com.cms.system.cms.service;

import com.cms.system.cms.entity.ExamResult;
import java.util.List;

public interface ExamResultService {
    List<ExamResult> getAllExamResults();
    ExamResult getExamResultById(Long id);
    ExamResult createExamResult(ExamResult examResult);
    ExamResult updateExamResult(Long id, ExamResult examResult);
    void deleteExamResult(Long id);
}
