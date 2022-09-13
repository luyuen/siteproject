package com.tw.videoinagingplatform.Opus.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class OpusService {

	@Autowired
	private OpusRepository opusRepository;
	
	public Opus insert(Opus opus) {
		return opusRepository.save(opus);
	}
	public boolean delete(int opus_id) {
		Optional<Opus> id = opusRepository.findById(opus_id);
		if(id.isPresent()) {
			opusRepository.deleteById(opus_id);
			return true;
		}
		return false;
	}
	public boolean update(int opus_id, Opus opus) {
		Optional<Opus> id = opusRepository.findById(opus_id);
		if(id.isPresent()) {
			opusRepository.save(opus);
			return true;
		}
		return false;
	}
	public List<Opus> queryAll(){
		return opusRepository.findAll();
	}
	
	public Opus queryById(int opus_id) {
		Optional<Opus> id = opusRepository.findById(null);
		if(id.isPresent()) {
			return id.get();
		}
		return null;
	}
}
