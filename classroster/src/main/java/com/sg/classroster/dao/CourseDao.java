package com.sg.classroster.dao;
import java.util.List;
import com.sg.classroster.dto.Course;
import com.sg.classroster.dto.Student;
import com.sg.classroster.dto.Teacher;

/**
 * @author Ronald Gedeon; email: gedemarcel0002@hotmail.com;  
 * gitRepo: https://github.com/gedegithub/C223-JavaDev.git 
 * Design of an interface defining ... on month day, year
 */
public interface CourseDao {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);
    
    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}
