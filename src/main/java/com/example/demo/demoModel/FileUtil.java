package com.example.demo.demoModel;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	
	    public static void saveFile(byte[] data, String filename) throws IOException {
	    	filename = "mehek_profile.jpg";
	        try (FileOutputStream fos = new FileOutputStream(filename)) {
	            fos.write(data);
	        }
	    }
	
}
