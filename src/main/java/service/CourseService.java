package service;

import model.Course;
import java.util.*;

public class CourseService {
    private static List<Course> courses = new ArrayList<>();

    static {
        courses.add(new Course("CS101", "Intro to CS", "Basics of computing"));
        courses.add(new Course("MATH201", "Calculus II", "Integration and series"));
        courses.add(new Course("ENG202", "English Lit", "British Literature"));
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course getById(String id) {
        return courses.stream()
            .filter(c -> c.getCourseId().equalsIgnoreCase(id))
            .findFirst()
            .orElse(null);
    }

    public List<Course> getByTitle(String title) {
        List<Course> result = new ArrayList<>();
        for (Course c : courses) {
            if (c.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }

    // For REST naming
    public List<Course> searchByTitle(String title) {
        return getByTitle(title);
    }
}
