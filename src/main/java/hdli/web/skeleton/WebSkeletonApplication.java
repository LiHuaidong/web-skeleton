package hdli.web.skeleton;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("hdli.web.skeleton.mapper")
public class WebSkeletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSkeletonApplication.class, args);
    }

}
