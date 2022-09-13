package com.tw.videoinagingplatform.Forum.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ForumService {

	@Autowired
	private ForumRepository forumRepository;
	
	public Forum insert(Forum forum) {
		return forumRepository.save(forum);
	}
	
	public boolean delete(int forum_id) {
		Optional<Forum> id = forumRepository.findById(forum_id);
		
		if(id.isPresent()) {
			forumRepository.deleteById(forum_id);
			return true;
		}
		return false;
	}
	
	public boolean update(int forum_id, Forum forum) {
		Optional<Forum> id = forumRepository.findById(forum_id);
		if(id.isPresent()) {
			forumRepository.save(forum);
			return true;
		}
		return false;
	}
	public List<Forum> queryAll(){
		return forumRepository.findAll();
	}
	public Forum queryById(int forum_id, Forum forum){
		Optional<Forum> id = forumRepository.findById(forum_id);
		if(id.isPresent()) {
			forumRepository.save(forum);
			return id.get();
		}
		return null;
	}
	
}
