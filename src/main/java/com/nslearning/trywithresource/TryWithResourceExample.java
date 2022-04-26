package com.nslearning.trywithresource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class TryWithResourceExample {
	
	public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
		FileInputStream fileStream = new FileInputStream(new File(TryWithResourceExample.class.getResource("/examplefile.txt").toURI()));
		// try with resource, a finally block is not needed given that java will use the default connection closing mechanism in this case
		try (fileStream) {
			String fileData = new String(fileStream.readAllBytes());
			System.out.println("File content : " + fileData);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
