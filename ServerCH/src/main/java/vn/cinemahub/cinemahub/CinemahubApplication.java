package vn.cinemahub.cinemahub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import vn.cinemahub.cinemahub.service.CinemaService;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class CinemahubApplication {
    @Autowired
    CinemaService cinemaService;
    public static void main(String[] args){
        SpringApplication.run(CinemahubApplication.class, args);
    }
}
