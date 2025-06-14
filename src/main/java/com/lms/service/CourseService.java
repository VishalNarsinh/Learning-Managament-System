package com.lms.service;

import com.lms.dto.CourseDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CourseService {


    CourseDto saveCourse(CourseDto courseDto,MultipartFile file,String email) throws IOException;

    void deleteCourse(long courseId);

    CourseDto updateCourse(CourseDto courseDto,long courseId, MultipartFile file);

    List<CourseDto> findCourseBySubCategoryId(Long subCategoryId);

    CourseDto findCourseByCourseId(long courseId);

    List<CourseDto> findAll();
}
