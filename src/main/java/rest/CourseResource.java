package main.java.rest;

import model.Course;
import service.CourseService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/courses")
@Produces(MediaType.APPLICATION_JSON)
public class CourseResource {

    private CourseService courseService = new CourseService();

    @GET
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GET
    @Path("/id/{courseId}")
    public Course getCourseById(@PathParam("courseId") String courseId) {
        return courseService.getById(courseId);
    }

    @GET
    @Path("/title/{title}")
    public List<Course> searchByTitle(@PathParam("title") String title) {
        return courseService.searchByTitle(title);
    }
}
