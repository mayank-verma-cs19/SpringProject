package com.example.demo.service;

import com.example.demo.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
    StudentDto updateStudent(StudentDto studentDto);
    StudentDto deleteStudent(StudentDto studentDto);
    StudentDto getStudentById(Long id);
    List<StudentDto> getAllStudents();
}
