package com.cms.system.cms.controller;

import com.cms.system.cms.entity.ExamResult;
import com.cms.system.cms.service.ExamResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exam-results")
public class ExamResultController {

    @Autowired
    private ExamResultService examResultService;

    @GetMapping
    public List<ExamResult> getAllExamResults() {
        return examResultService.getAllExamResults();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExamResult> getExamResultById(@PathVariable Long id) {
        ExamResult examResult = examResultService.getExamResultById(id);
        if (examResult != null) {
            return ResponseEntity.ok(examResult);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ExamResult createExamResult(@RequestBody ExamResult examResult) {
        return examResultService.createExamResult(examResult);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExamResult> updateExamResult(@PathVariable Long id, @RequestBody ExamResult examResult) {
        ExamResult updatedExamResult = examResultService.updateExamResult(id, examResult);
        if (updatedExamResult != null) {
            return ResponseEntity.ok(updatedExamResult);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExamResult(@PathVariable Long id) {
        examResultService.deleteExamResult(id);
        return ResponseEntity.noContent().build();
    }
}
