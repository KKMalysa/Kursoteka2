package pl.karolmalysa.kursoteka.service;

//import org.springframework.stereotype.Service;
import pl.karolmalysa.kursoteka.model.CourseDTO;
import pl.karolmalysa.kursoteka.persistance.model.Course;
import pl.karolmalysa.kursoteka.persistance.repository.CourseRepo;

import java.util.List;
//@Service
public interface CourseService extends BaseService<Course, Long, CourseRepo> {

    CourseDTO getCourseDtoById(Long id);

    CourseDTO createCourse(CourseDTO courseDTO);

    List<CourseDTO> getAllCourses();
}
