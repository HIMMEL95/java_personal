package java_personal.Crawling;

import java.net.URL;
import java.sql.Connection;

public class crawling {

    final static String address = "http://localhost:8080/rest/member";

    Connection conn = Jsoup.connect(address);
    
}
