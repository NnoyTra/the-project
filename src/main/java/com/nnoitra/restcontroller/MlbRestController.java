package com.nnoitra.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.nnoitra.util.Constants;

@RestController
@RequestMapping("mlb")
public class MlbRestController {

	@Autowired private RestTemplate restTemplate;
	
	@GetMapping("get-teams")
	public ResponseEntity<?> getData() {
		ResponseEntity<Object> forEntity = restTemplate.getForEntity(Constants.MLB_TEAM_API, Object.class);
		return new ResponseEntity<Object>(forEntity.getBody(), HttpStatus.OK);
	}
}
