package com.paschal.cicdgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CicdGithubApplication {

	@GetMapping("/welcome")
	public String welcome () {
		return "Welcome to CICD Git hub";
	}

//	echo "# github-actions" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Deparsk/github-actions.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(CicdGithubApplication.class, args);
	}

}
