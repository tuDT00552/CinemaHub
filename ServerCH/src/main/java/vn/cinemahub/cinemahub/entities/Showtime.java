package vn.cinemahub.cinemahub.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SHOWTIME")
@EntityListeners(AuditingEntityListener.class)
public class Showtime extends BaseEntity {
    private Date dateStart;
    private Date dateEnd;
    private String timeStart;
    private int status;
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

//    @JsonBackReference(value="phim")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "phimid")
    private Movie movie;

//    @JsonBackReference(value="phong")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roomid")
    private RoomEntity roomEntity;

    public RoomEntity getRoomEntity() {
        return roomEntity;
    }

    public void setRoomEntity(RoomEntity roomEntity) {
        this.roomEntity = roomEntity;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }
}
