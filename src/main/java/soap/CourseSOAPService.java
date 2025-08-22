package soap;

import model.Course;
import service.CourseService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public class CourseSOAPService {

    CourseService courseService = new CourseService();

    @WebMethod
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @WebMethod
    public Course getCourseById(@WebParam(name = "id") String id) {
        return courseService.getById(id);
    }

    @WebMethod
    public List<Course> getCoursesByTitle(@WebParam(name = "title") String title) {
        return courseService.getByTitle(title);
    }
}
