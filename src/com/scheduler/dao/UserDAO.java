package com.scheduler.dao;

import com.scheduler.dbmodel.StudentInfoView;
import com.scheduler.dbmodel.User;
import java.util.List;

/**
 * @author ubuntu
 *
 */
public interface UserDAO {

    public User getUserByCredentials(User user);

    public List<StudentInfoView> getAllStudents();

    User getUser(String studentID);

    public StudentInfoView getUserDetails(String id);

    public void setCoursePreferences(String user, String courses);
}
