package com.example.firstProject.configuration;

import com.example.firstProject.ProdDB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// There will be multiple beans in this file ( @Configuration ).
// As we're creating new ProdDB .. i.e. it is still tightly-coupled
// Instead we'll make a bean, which will itself supply all objects.

@Configuration
public class AppConfig {

//    Bean  -->  supply objects
    @Bean
    public ProdDB getDBBean() {
        return new ProdDB();
    }
}
