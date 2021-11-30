package com.edwin.web.project;

import com.edwin.library.springboot.web.mvc.extend.annotations.EnableWebMvcExtend;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zyc
 * @date 2021/11/30 14:17
 */
@EnableWebMvcExtend
@SpringBootApplication
public class WebProjectApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(WebProjectApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
    }

}