/**
 * 
 */
package com.yue.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 流星紫蝶雨
 *	2019年2月16日
 */
@SpringBootApplication
@MapperScan("com.yue.user.mapper")
public class UnicomUserServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(UnicomUserServiceApplication.class, args);
	}
}
