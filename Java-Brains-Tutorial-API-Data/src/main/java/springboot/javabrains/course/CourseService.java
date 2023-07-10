package springboot.javabrains.course;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service						//Business Service | A Singleton
public class CourseService {
	
	//@Autowired 	If Repository is an interface, do not need to add the @Autowired Annotation.
	//private TopicRepository topicRepository;
	
	
	//Got another error: java.lang.NullPointerException: Cannot invoke "springboot.javabrains.topic.TopicRepository.save(Object)" because "this.topicRepository" is null
	private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    //Error Fixed by the above code section.
    
    
	

	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		
		return courses;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course topic) {
		courseRepository.save(topic);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
	
}
