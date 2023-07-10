package springboot.javabrains.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	/*Don't have to define, just declaring the method with the findBy'Property' name format is enough.
	Spring Data JPA will implement the method for you.*/
//  public List<Course> findByName(String name);
	
	//find by  id property of Topic property
	public List<Course> findByTopicId(String topicId);

}
