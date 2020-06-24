package vn.cinemahub.cinemahub.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SEAT")
@EntityListeners(AuditingEntityListener.class)
public class GheEntity extends BaseEntity {
    //private String idGhe;
    // 1: ghe vip, 2: ghe thuong
    private String tenghe;
    private int loaighe;
    private int status;


    public GheEntity(String tenghe, int loaighe, RoomEntity roomEntity) {
        this.tenghe = tenghe;
        this.loaighe = loaighe;
        this.roomEntity = roomEntity;
    }

    @Basic
    @Column(name = "tenghe")
    public String getTenghe() {
        return tenghe;
    }

    public void setTenghe(String tenghe) {
        this.tenghe = tenghe;
    }

    @Basic
    @Column(name = "LOAIGHE")
    public int getLoaighe() {
        return loaighe;
    }

    public void setLoaighe(int loaighe) {
        this.loaighe = loaighe;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public GheEntity() {
    }

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maphong", referencedColumnName = "maphong")
    private RoomEntity roomEntity;

    public RoomEntity getRoomEntity() {
        return roomEntity;
    }

    public void setRoomEntity(RoomEntity roomEntity) {
        this.roomEntity = roomEntity;
    }
}
