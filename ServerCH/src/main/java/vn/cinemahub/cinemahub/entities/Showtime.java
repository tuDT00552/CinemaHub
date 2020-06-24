package vn.cinemahub.cinemahub.entities;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "SHOWTIME")
@EntityListeners(AuditingEntityListener.class)
public class Showtime extends BaseEntity {
    private long maphong;
    private long marap;
    private long maphim;
    private String ngaychieu;
    private String timeStart;
    private String timeEnd;

    public long getMaphong() {
        return maphong;
    }

    public void setMaphong(long maphong) {
        this.maphong = maphong;
    }

    public long getMarap() {
        return marap;
    }

    public void setMarap(long marap) {
        this.marap = marap;
    }

    public long getMaphim() {
        return maphim;
    }

    public void setMaphim(long maphim) {
        this.maphim = maphim;
    }

    public String getNgaychieu() {
        return ngaychieu;
    }

    public void setNgaychieu(String ngaychieu) {
        this.ngaychieu = ngaychieu;
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
