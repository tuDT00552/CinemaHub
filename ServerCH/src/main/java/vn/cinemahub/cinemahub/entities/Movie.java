package vn.cinemahub.cinemahub.entities;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movie")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Movie extends BaseEntity{
    @Column(name = "maphim")
    private int maphim;

    @Column(name = "tenphim")
    private String tenphim;

    @Column(name = "loaiphim")
    private String loaiphim;

    @Column(name = "theloai")
    private String theloai;

    @Column(name = "namsx")
    private int namsx;

    @Column(name = "image")
    private String image;

    @Column(name = "trailer")
    private String trailer;

    @Column(name = "mota")
    private String mota;

    @Column(name = "status")
    private int status;

//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(name = "cinema_movie",
//            joinColumns = { @JoinColumn(name = "movie_id") },
//            inverseJoinColumns = {@JoinColumn(name = "cinema_id") })
//    private Set<Cinema> cinemas = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "cinema_id", nullable = false)
    private Cinema cinema;


    public Movie() {
    }

    public Movie(int maphim, String tenphim, String loaiphim, String theloai, int namsx, String image, String trailer, String mota, int status) {
        this.maphim = maphim;
        this.tenphim = tenphim;
        this.loaiphim = loaiphim;
        this.theloai = theloai;
        this.namsx = namsx;
        this.image = image;
        this.trailer = trailer;
        this.mota = mota;
        this.status = status;
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
