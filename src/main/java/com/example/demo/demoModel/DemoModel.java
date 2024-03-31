package com.example.demo.demoModel;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class DemoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@JsonRawValue
	@JsonProperty("projectName")
    private String projectName;
    
	@JsonRawValue
	@JsonProperty("packageName")
    private String packageName;
    
	@JsonRawValue
	@JsonProperty("groupId")
    private String groupId;
    
	@JsonRawValue
	@JsonProperty("artifactId")
    private String artifactId;
    
	@JsonRawValue
	@JsonProperty("serviceType")
    private String serviceType;
	
//	@JsonRawValue
//	@JsonProperty("file")
//	@OneToOne
//	private FileEntity file;
	
	@Lob
	private byte[] file;
}
