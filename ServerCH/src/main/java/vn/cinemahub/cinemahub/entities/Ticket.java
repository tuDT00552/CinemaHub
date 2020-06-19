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
    private String tenphim;
    private long idGhe;
    private long marap;
    private long giave;
    private String timeStart;
    private String timeEnd;

//    @Id
//    @Column(name = "ID_DATVE")
//    public long getIdDatve() {
//        return idDatve;
//    }
//
//    public void setIdDatve(long idDatve) {
//        this.idDatve = idDatve;
//    }
//
//    @Basic
//    @Column(name = "DATE")
//    public long getDate() {
//        return date;
//    }
//
//    public void setDate(long date) {
//        this.date = date;
//    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket that = (Ticket) o;
        return
                idGhe == that.idGhe &&
                marap == that.marap &&
                giave == that.giave &&
                Objects.equals(tenphim, that.tenphim) &&
                Objects.equals(timeStart, that.timeStart) &&
                Objects.equals(timeEnd, that.timeEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenphim, idGhe, marap, giave, timeStart, timeEnd);
    }
}
