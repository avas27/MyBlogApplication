package blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class blog {
    public static void main(String[] args)
    {
        SpringApplication.run(blog.class,args);
    }
}
