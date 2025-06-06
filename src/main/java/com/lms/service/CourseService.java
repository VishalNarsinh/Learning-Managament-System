package com.lms.service;

import com.lms.dto.CourseDto;
import com.lms.dto.SubCategoryDto;
import com.lms.model.Course;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CourseService {

    CourseDto courseToDto(Course course);

    Course dtoToCourse(CourseDto courseDto);

    CourseDto saveCourse(CourseDto courseDto,MultipartFile file) throws IOException;

    void deleteCourse(long courseId);

    CourseDto updateCourse(CourseDto courseDto,long courseId, MultipartFile file);

    List<CourseDto> findCourseBySubCategoryId(SubCategoryDto subCategoryDto);

    CourseDto findCourseByCourseId(long courseId);

    List<CourseDto> findAll();
}
