package com.aspiresys.boot.service;

import java.util.List;

import com.aspiresys.boot.entity.Topic;

public interface TopicService {

	List<Topic> getAllTopics();

	Topic getTopicById(String id);

	Topic addTopic(Topic topic);

	Topic updatTopic(Topic topic, String id);

	void deleteTopic(String id);
}
