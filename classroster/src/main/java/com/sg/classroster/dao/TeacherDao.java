/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.classroster.dao;

import com.sg.classroster.dto.Teacher;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

/**
 *
 * @author Jeonghoon
 */
public interface TeacherDao {

    Teacher getTeacherById(int id);

    List<Teacher> getAllTeachers();

    Teacher addTeacher(Teacher teacher);

    void updateTeacher(Teacher teacher);

    void deleteTeacherById(int id);
}
