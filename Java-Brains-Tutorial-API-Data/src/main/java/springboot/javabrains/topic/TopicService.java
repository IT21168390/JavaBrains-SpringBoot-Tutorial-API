package springboot.javabrains.topic;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service						//Business Service | A Singleton
public class TopicService {
	
	//@Autowired 	If Repository is an interface, do not need to add the @Autowired Annotation.
	//private TopicRepository topicRepository;
	
	
	//Got another error: java.lang.NullPointerException: Cannot invoke "springboot.javabrains.topic.TopicRepository.save(Object)" because "this.topicRepository" is null
	private final TopicRepository topicRepository;

    @Autowired
    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }
    //Error Fixed by the above code section.
    
    
	

	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
	
}
