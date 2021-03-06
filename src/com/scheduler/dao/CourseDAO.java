package com.scheduler.dao;

import com.scheduler.dbmodel.CourseModel;
import com.scheduler.dbmodel.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ubuntu
 *
 */
public interface CourseDAO {
    public boolean setPriorityForUser(User u, CourseModel c);
    public List<CourseModel> getCourseListForUser(String[] courses);
    public List<CourseModel> getAllCourses();
}
