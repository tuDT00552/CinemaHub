package vn.cinemahub.cinemahub.entities;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "REFUNDTICKET")
@EntityListeners(AuditingEntityListener.class)
public class RefundTicket extends BaseEntity{

    private long idDatve;
    private String userName;
    private long tong;
    private long tienphat;
    private long hoantien;


    @Basic
    @Column(name = "ID_DATVE")
    public long getIdDatve() {
        return idDatve;
    }

    public void setIdDatve(long idDatve) {
        this.idDatve = idDatve;
    }


    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "TONG")
    public long getTong() {
        return tong;
    }

    public void setTong(long tong) {
        this.tong = tong;
    }

    @Basic
    @Column(name = "TIENPHAT")
    public long getTienphat() {
        return tienphat;
    }

    public void setTienphat(long tienphat) {
        this.tienphat = tienphat;
    }

    @Basic
    @Column(name = "HOANTIEN")
    public long getHoantien() {
        return hoantien;
    }

    public void setHoantien(long hoantien) {
        this.hoantien = hoantien;
    }



}
