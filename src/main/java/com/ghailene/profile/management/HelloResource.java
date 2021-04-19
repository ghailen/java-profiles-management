package com.ghailene.profile.management;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/hello")
@RestController
public class HelloResource {

    @Value("${spring.message}")
    private String message;

/** this is to show with api mode **/
    @GetMapping
    public String hello(){
        return message;
    }

    /** this is to show result when we run the project **/
    @Bean
    /**this will run when production profile is activated **/
    @Profile("production")
    /**this will run when production profile is not activated
     * if we are not running in the production **/

    //@Profile("!production")
    CommandLineRunner run(){
        return (args)->{
            System.out.println(message);
        };
    }

  /*   @Bean
     @Profile("dev")
    CommandLineRunner runDev(){
        return (args)->{
            System.out.println("this will be printed in dev mode");
        };
    }*/
}
