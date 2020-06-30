package vn.cinemahub.cinemahub.entities;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Ticket")
@EntityListeners(AuditingEntityListener.class)
public class Ticket extends BaseEntity{
//    private long idDatve;
//    private long date;
    private long maVe;
    private String tenphim;
    private long idGhe;
    private long marap;
    private long giave;
    private int status;
    private String timeStart;
    private String timeEnd;

    @Basic
    @Column(name = "MAVE")
    public long getMaVe() {
        return maVe;
    }

    public void setMaVe(long maVe) {
        this.maVe = maVe;
    }

    @Basic
    @Column(name = "STATUS")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "TENPHIM")
    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    @Basic
    @Column(name = "ID_GHE")
    public long getIdGhe() {
        return idGhe;
    }

    public void setIdGhe(long idGhe) {
        this.idGhe = idGhe;
    }

    @Basic
    @Column(name = "MARAP")
    public long getMarap() {
        return marap;
    }

    public void setMarap(long marap) {
        this.marap = marap;
    }

    @Basic
    @Column(name = "GIAVE")
    public long getGiave() {
        return giave;
    }

    public void setGiave(long giave) {
        this.giave = giave;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }


}
