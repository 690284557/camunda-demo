package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.event.EventListener;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@EnableProcessApplication
@ServletComponentScan
@EnableSwagger2
public class WebappExampleProcessApplication {
	

	public static void main(String... args) {
		SpringApplication.run(WebappExampleProcessApplication.class, args);
	}
}