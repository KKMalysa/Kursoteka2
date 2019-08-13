package pl.karolmalysa.kursoteka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.karolmalysa.kursoteka.model.CourseDTO;
import pl.karolmalysa.kursoteka.exceptions.WrongIdException;
import pl.karolmalysa.kursoteka.persistance.model.Course;
import pl.karolmalysa.kursoteka.persistance.repository.CourseRepo;
import pl.karolmalysa.kursoteka.service.CourseService;
import pl.karolmalysa.kursoteka.service.Mapper;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    private List<CourseDTO> cours = new ArrayList<>();

    @Autowired              //umożliwia wstrzyknięcie klasy, w której została zastosowana, do miejsca, w którym chce się jej użyć
    CourseService courseService;  //w tym wypadku strzykuję tu courseService

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO courseDTO) {
        if (courseDTO.getId() != null)
            throw new WrongIdException("Tworzony kurs nie powinien posiadać ID.");
        System.out.println("/course/create" + courseDTO.getName());
        CourseDTO dto = courseService.createCourse(courseDTO);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/available", method = RequestMethod.GET)
    public ResponseEntity<List<CourseDTO>>getAvailableCourses(){
        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
    }

    @RequestMapping(value = "buy/{id}", method = RequestMethod.GET)
    public CourseDTO buyCourse(@PathVariable(value = "id") Long id){
        System.out.println("buyCourse");
//        Course c= courseRepo.getOne(id);
        return null;
    }

    @RequestMapping(value = "/buy2", method = RequestMethod.POST)
    public CourseDTO buyCourse2(@RequestParam(value = "id")Long id){
        System.out.println("buyCourse2");
        return getCourse(id);
    }

    private CourseDTO getCourse(Long id) {
        CourseDTO courseDTO = null;
        for (CourseDTO c : cours){
            if(c.getId()!=null&&c.getId().equals(id)){
                courseDTO =c;
                break;
            }
        }
        if (courseDTO ==null) {
            // TODO
        }
        return courseDTO;
    }


}
