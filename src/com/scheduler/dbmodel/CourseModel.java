package com.scheduler.dbmodel;

import com.scheduler.model.Course;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author ubuntu
 *
 */
@Entity
@Table(name = "courses")
@XmlRootElement(name="courses")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
@org.hibernate.annotations.DynamicUpdate(value = true)
@org.hibernate.annotations.DynamicInsert(value = true)
public class CourseModel implements Serializable{

    @Id
    @Column(name="CourseID",columnDefinition = "INT", updatable=false, nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String courseID;

    @Column(name="CourseName",columnDefinition = "VARCHAR(50)")
    private String name;

    @Column(name="Major",columnDefinition = "VARCHAR(10)")
    private String program;

    @Column(name= "Availibility",columnDefinition = "CHAR(11)")
    private String availability;

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
