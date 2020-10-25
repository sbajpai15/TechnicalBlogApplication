package technicalBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import upgrad.HelloWorld;

@SpringBootApplication
@ServletComponentScan
public class TechnicalBlogApplication {
    public static void main (String [] args){
        SpringApplication.run(TechnicalBlogApplication.class, args);

    }
}
