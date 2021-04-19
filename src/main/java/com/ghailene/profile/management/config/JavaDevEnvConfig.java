package com.ghailene.profile.management.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;
/** if not dev profile will not charge this **/
//@Profile("!dev")
/** if not dev profile will  charge this **/
/*
@Profile("production")
@Configuration
public class JavaDevEnvConfig {
    @PostConstruct
    public void test(){
        System.out.println("loaded prod environnement");
    }
}
*/