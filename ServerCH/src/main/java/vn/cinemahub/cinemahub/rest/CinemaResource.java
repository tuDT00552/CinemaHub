package vn.cinemahub.cinemahub.rest;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import vn.cinemahub.cinemahub.config.CinemaEntity;
//import vn.cinemahub.cinemahub.entities.Cinema;
//import vn.cinemahub.cinemahub.entities.Movie;
import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.service.CinemaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/cinema")
public class CinemaResource {
    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    public List<Cinema> findAll() {
        return cinemaService.findAll();
    }

    @PostMapping
    public Cinema save(@RequestBody Cinema cinema) {
        Date date = new Date();
        cinema.setCreatedAt(date);
        cinema.setUpdateAt(date);
        cinema.setStatus(1);
        return cinemaService.save(cinema);
    }


    @GetMapping("/insert")
    public List<Cinema> Insert() {
        List<Cinema> cinemas = new ArrayList<>();
        Cinema c1 = new Cinema(001,"CGV Vincom Center Bà Triệu",
                "Tầng 6, Toà nhà VinCom Center Hà Nội 191 đường Bà Triệu Quận Hai Bà Trưng Hà Nội","Rạp phim chất lượng cao",1);
        Cinema c2 = new Cinema(002,"CGV Hồ Gươm Plaza",
                "Tầng 3, TTTM Hồ Gươm Plaza, 110 Trần Phú, Phường Mỗ Lao, Quận Hà Đông, Hà Nội","Rạp phim chất lượng cao",1);
        Cinema c3 = new Cinema(003,"CGV Vincom Trần Duy Hưng",
                "Tầng 5 - TTTM VINCOM CENTER TRẦN DUY HUNG, Đường Trần Duy Hưng, P. Trung Hòa, Q. Cầu Giấy, Hà Nội.","Rạp phim chất lượng cao",1);
        Cinema c4 = new Cinema(004,"CGV Aeon Hà Đông",
                "Tầng 3 & 4 – TTTM AEON MALL HÀ ĐÔNG, P. Dương Nội, Q. Hà Đông, Hà Nội","Rạp phim chất lượng cao",1);
        Cinema c5 = new Cinema(005,"CGV Vincom Long Biên",
                "Tầng 5, TTTM Vincom Plaza Long Biên, khu đô thị Vinhomes Riverside, Phường Phúc Lợi, Quận Long Biên, Hà Nội", "Rạp phim chất lượng cao",1);
        cinemas.addAll(Arrays.asList(c1,c2,c3,c4,c5));
        Date date = new Date();
        for (int i = 0; i < cinemas.size(); i++) {
            cinemas.get(i).setCreatedAt(date);
            cinemas.get(i).setUpdateAt(date);
            cinemaService.save(cinemas.get(i));
        }
        return cinemas;
    }
}
