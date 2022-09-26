package com.tw.videoinagingplatform.Opus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tw.videoinagingplatform.Opus.model.Opus;
import com.tw.videoinagingplatform.Opus.model.OpusService;

@Controller
public class AdminOpusController {
	
	@Autowired 
	
	private OpusService opusService;
	
	@PostMapping(path = "createopus.controller")
	@ResponseBody
	public String createOpus(@RequestParam("o_audiofile") String o_audiofile, @RequestParam("o_image") String o_image,
			@RequestParam("o_permissions") String o_permissions) {
		Opus opus = new Opus();
		opus.setOpus_audiofile(o_audiofile);
		opus.setOpus_image(o_image);
		opus.setOpus_permissions(o_permissions);
		
		opusService.insert(opus);
		
		return "Insert ok";
		
	}
		
};
