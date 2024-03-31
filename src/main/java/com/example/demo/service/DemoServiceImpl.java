package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.demoModel.DemoModel;
import com.example.demo.demoModel.FileEntity;
import com.example.demo.repo.DemoRepository;
import com.example.demo.repo.FileRepository;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	DemoRepository repo;
	
	@Autowired
	FileRepository fileRepository;
	
	@Override
	public DemoModel save(DemoModel model) {
		System.out.println("inside serviceimpl");
//		FileEntity fileEntity = new FileEntity();
//        fileEntity.setFileName(model.getFile().getFileName());
//        fileEntity.setFile(model.getFile().getFile());
//        fileRepository.save(fileEntity);
		return repo.save(model);
	}

}
