package GSONDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

import DAO.Student;

public class GSONDemo {

//	public void createJson() throws JsonIOException, IOException {
//	Gson gson = new Gson();
//	Student student = new Student();
//	ArrayList<String> subjects = new ArrayList<>();
//	Map<String, Object> contactNo = new LinkedHashMap<String, Object>();
//	contactNo.put("personalNo", 654654);
//	contactNo.put("phoneNo", 46548);
//	contactNo.put("telephoneNo", 216548);
//	contactNo.put("mobileNo", 8798745);
//	subjects.add("Physics");
//	subjects.add("Chemistry");
//	subjects.add("Maths");
//	subjects.add("Biology");
//	student.setName("Mayank Mishra");
//	student.setAge(20);
//	student.setSubjects(subjects);
//	student.setContactNo(contactNo);
//	String json = gson.toJson(student);
//	System.out.println(json);
//	gson.toJson(student ,new FileWriter("C:\\Users\\Mishra Ji\\Desktop\\NewJson.json"));
//	}
	
	public static void main( String []args) throws JsonIOException, IOException {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Student student = new Student();
		
		ArrayList<String> subjects = new ArrayList<>();
		Map<String, Object> contactNo = new LinkedHashMap<String, Object>();
		
		contactNo.put("personalNo", 654654);
		contactNo.put("phoneNo", 46548);
		contactNo.put("telephoneNo", 216548);
		contactNo.put("mobileNo", 8798745);
		
		subjects.add("Physics");
		subjects.add("Chemistry");
		subjects.add("Maths");
		subjects.add("Biology");
		
		student.setName("Aniket Jha");
		student.setAge(40);
		student.setSubjects(subjects);
		student.setContactNo(contactNo);
		
		File file = new File("D:\\Java-WorkSpace\\NewJson.json");
		
		FileWriter writer = new FileWriter(file,true);
		gson.toJson(student , writer);
		
		String json = gson.toJson(student);
//		writer.write(json);
		writer.close();
		System.out.println(json);
	}
	
}
