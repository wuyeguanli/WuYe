package webadv.s99201105.p3;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("webadv.Face.repository")
public class FaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaceApplication.class, args);
	}
}
