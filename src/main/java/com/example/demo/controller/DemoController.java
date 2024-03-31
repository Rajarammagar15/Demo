package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.demoModel.DemoModel;
import com.example.demo.demoModel.FileUtil;
import com.example.demo.service.DemoService;

@Controller
@RequestMapping("/v1")
public class DemoController {
	
	@Autowired
	DemoService service;
	
	@Autowired
	FileUtil util;
	
	
//	@PostMapping("/submit")
//	public String submitForm(@RequestBody DemoModel model) {
//		System.out.println(model.toString());
//		service.save(model);
//		return "redirect:/success.html";
//	}
	
	@PostMapping("/submit")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             @RequestParam("projectName") String projectName,
                             @RequestParam("packageName") String packageName,
                             @RequestParam("groupId") String groupId,
                             @RequestParam("artifactId") String artifactId,
                             @RequestParam("serviceType") String serviceType) {
        // Create DemoModel object and set its properties
        DemoModel model = new DemoModel();
        model.setProjectName(projectName);
        model.setPackageName(packageName);
        model.setGroupId(groupId);
        model.setArtifactId(artifactId);
        model.setServiceType(serviceType);
        
        // Handle file upload
        if (!file.isEmpty()) {
            try {
                // Set file data to the model
            	
                model.setFile(file.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
                // Handle file upload error
            }
        }
        System.out.println(model.toString());
        // Save the model
        service.save(model);
        
        return "redirect:/success.html";
    }
	
	@GetMapping("/test")
	public String testEndpoint() {
		System.out.println("hey whatsup");
	    return "redirect:/test.html";
	}
}
