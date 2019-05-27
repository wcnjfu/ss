package com.wc.wcnj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wc.wcnj.Dao")
public class WcnjApplication {

	public static void main(String[] args) {
		SpringApplication.run(WcnjApplication.class, args);
	}

}
