package vn.cinemahub.cinemahub.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NaturalId;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "CINEMA")
@EntityListeners(AuditingEntityListener.class)
public class Cinema extends BaseEntity implements Serializable {
    @NaturalId
    @Column(name = "marap")
    private int marap;

    @Column(name = "tenrap")
    private String tenrap;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "gioithieu")
    private String gioithieurap;

    @Column(name = "status")
    private int status;

//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(name = "cinema_movie",
//            joinColumns = { @JoinColumn(name = "cinema_id") },
//            inverseJoinColumns = {@JoinColumn(name = "movie_id") })
//    private Set<Movie> movies = new HashSet<>();

    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cinema",cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SELECT)
        private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Cinema() {
    }

    public Cinema(int marap, String tenrap, String diachi, String gioithieurap, int status) {
        this.marap = marap;
        this.tenrap = tenrap;
        this.diachi = diachi;
        this.gioithieurap = gioithieurap;
        this.status = status;
    }

    public int getMarap() {
        return marap;
    }

    public void setMarap(int marap) {
        this.marap = marap;
    }

    public String getTenrap() {
        return tenrap;
    }

    public void setTenrap(String tenrap) {
        this.tenrap = tenrap;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioithieurap() {
        return gioithieurap;
    }

    public void setGioithieurap(String gioithieurap) {
        this.gioithieurap = gioithieurap;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
