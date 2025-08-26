package Ch04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class C08PropertiesMain {

	public static void main(String[] args) throws IOException {
		
		// application.properties 위치 찾으려고 하는 작업
		String classPath = System.getProperty("java.class.path");
		System.out.println("classPath : " + classPath); 
		String dirPath = System.getProperty("user.dir");
		System.out.println("dirPath : " + dirPath);
		String packagePath = C08PropertiesMain.class.getPackageName();
		System.out.println("packagePath : " + packagePath); 	// Ch04
		
		// File.separator : 구분자(운영체제가 다를 수 있음을 고려)
		String filePath = dirPath + File.separator + "src" + File.separator + packagePath + File.separator + "application.properties";
		System.out.println("filePath : " + filePath);
		// FileInputStream : 파일안에 있는 내용을 자바안로 가져오기 위해 사용한 inputstream  (중요*********)
		FileInputStream fin = new FileInputStream(filePath);
		
		// properties 객체 생성하면 fileinput에서 꺼내 온 내용을 get으로 사용할 수 있음
		Properties properties = new Properties();
		properties.load(fin);
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.printf("%s %s %s \n", url,username,password);
	}

}
