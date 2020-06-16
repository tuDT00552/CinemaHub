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
    private String loaighe;
    private String trangthai;
    private long maphong;


//    @Basic
//    @Column(name = "ID_GHE")
//    public String getIdGhe() {
//        return idGhe;
//    }
//
//    public void setIdGhe(String idGhe) {
//        this.idGhe = idGhe;
//    }

    @Basic
    @Column(name = "LOAIGHE")
    public String getLoaighe() {
        return loaighe;
    }

    public void setLoaighe(String loaighe) {
        this.loaighe = loaighe;
    }

    @Basic
    @Column(name = "TRANGTHAI")
    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Basic
    @Column(name = "MAPHONG")
    public long getMaphong() {
        return maphong;
    }

    public void setMaphong(long maphong) {
        this.maphong = maphong;
    }


//    @Basic
//    @Column(name = "status")
//    private int status;
//
//
//
//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }

    public GheEntity() {
    }
}
