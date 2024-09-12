package com.spring_docker_kubernetes.sprindockkube.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/javakube")
@RestController
public class maincontroller {
	
	
	
	
	
	@GetMapping("/verify")
	public String newmessage()
	{
		
		return "This is a ECR-based dockerized spring-boot java application deployed on multi-node AWS Elastic kubernetes cluster";
	}

}
