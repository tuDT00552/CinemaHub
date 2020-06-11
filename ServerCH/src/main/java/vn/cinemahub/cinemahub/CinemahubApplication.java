package vn.cinemahub.cinemahub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//import vn.cinemahub.cinemahub.entities.Cinema;
//import vn.cinemahub.cinemahub.entities.Movie;
import vn.cinemahub.cinemahub.repository.CinemaRepository;
import vn.cinemahub.cinemahub.rest.CinemaResource;
import vn.cinemahub.cinemahub.service.CinemaService;
import vn.cinemahub.cinemahub.service.CinemaServiceImpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class CinemahubApplication {
    @Autowired
    CinemaService cinemaService;
    public static void main(String[] args){
        SpringApplication.run(CinemahubApplication.class, args);
//        CinemahubApplication cinemahubApplication = new CinemahubApplication();
//        cinemahubApplication.insert();


    }
//    public void insert() {
//        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
//        Date dateobj = new Date();
//        Cinema c = new Cinema(1, "OK nHé", "Ha Noi", "rat hay", 1);
//        c.setId((long) 9);
//        c.setCreatedAt(dateobj);
//        c.setUpdateAt(dateobj);
//        cinemaService.save(c);
//    }
}
