package com.illia;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BmwAssemblerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(BmwAssemblerApplication.class).run(args);
    }

}
