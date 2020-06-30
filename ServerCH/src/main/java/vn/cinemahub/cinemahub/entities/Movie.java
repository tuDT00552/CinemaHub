package vn.cinemahub.cinemahub.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "movie")
@EntityListeners(AuditingEntityListener.class)
public class Movie extends BaseEntity {

    @Column(name = "maphim")
    private int maphim;

    @Column(name = "tenphim")
    private String tenphim;

    @Column(name = "loaiphim")
    private String loaiphim;

    @Column(name = "theloai")
    private String theloai;

    @Column(name = "minutes")
    private int minutes;

    @Column(name = "namsx")
    private int namsx;

    @Column(name = "image")
    private String image;

    @Column(name = "trailer")
    private String trailer;

    @Column(name = "mota", length = 500)
    private String mota;

    @Column(name = "status")
    private int status;

    //    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(name = "cinema_movie",
//            joinColumns = { @JoinColumn(name = "movie_id") },
//            inverseJoinColumns = {@JoinColumn(name = "cinema_id") })
//    private Set<Cinema> cinemas = new HashSet<>();

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "marap", referencedColumnName = "MARAP")
    private Cinema cinema;

//    @JsonManagedReference(value="phim")
    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "movie",cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SELECT)
    private List<Showtime> showtimes = new ArrayList<>();

    public Movie() {
    }

    public Movie(int maphim, String tenphim, String loaiphim, String theloai, int minutes, int namsx, String image, String trailer, String mota, int status, Cinema cinema) {
        this.maphim = maphim;
        this.tenphim = tenphim;
        this.loaiphim = loaiphim;
        this.theloai = theloai;
        this.minutes = minutes;
        this.namsx = namsx;
        this.image = image;
        this.trailer = trailer;
        this.mota = mota;
        this.status = status;
        this.cinema = cinema;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMaphim() {
        return maphim;
    }

    public void setMaphim(int maphim) {
        this.maphim = maphim;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public String getLoaiphim() {
        return loaiphim;
    }

    public void setLoaiphim(String loaiphim) {
        this.loaiphim = loaiphim;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
}
