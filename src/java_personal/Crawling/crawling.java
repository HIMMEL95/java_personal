package java_personal.Crawling;

import java.net.MalformedURLException;
import java.net.URL;

public class crawling {
	
	public static void main(String[] args) {
		URL url = null;

		try {
			url = new URL("http://localhost:8080/rest/member");
			
			
		} catch (MalformedURLException e) {
			System.out.println("잘못된 URL입니다.");
		}
	}
    
}
