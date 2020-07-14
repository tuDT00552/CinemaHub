package vn.cinemahub.cinemahub.entities;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "REFUNDTICKET")
@EntityListeners(AuditingEntityListener.class)
public class RefundTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "RT_SEQ")
    @SequenceGenerator(sequenceName = "REFUND_SEQ", allocationSize = 1, name = "RT_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "MAVE")
    private long mave;

    @Column(name ="MARAP")
    private long marap;

    @Column(name = "TENPHIM")
    private String tenphim;

    @Column(name = "MAGHE")
    private long maghe;

    @Column(name = "MAPHONG")
    private long maphong;

    @Column(name = "GIAVE")
    private long giave;

    @Column(name = "NGAYCHIEU")
    private Date ngaychieu;

    @Column(name = "KHUNGGIO")
    private String khunggio;

    @Column(name = "GIOTRA")
    private Date giotra;

    public long getMarap() {
        return marap;
    }

    public Date getGiotra() {
        return giotra;
    }

    public void setGiotra(Date giotra) {
        this.giotra = giotra;
    }

    public void setMarap(long marap) {
        this.marap = marap;
    }



    @Column(name = "TIENPHAT")
    private long tienphat;

    public String getKhunggio() {
        return khunggio;
    }

    public void setKhunggio(String khunggio) {
        this.khunggio = khunggio;
    }

    public long getTienphat() {
        return tienphat;
    }

    public void setTienphat(long tienphat) {
        this.tienphat = tienphat;
    }

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @LastModifiedDate
    @Column(name = "update_at")
    private Date updateAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getMave() {
        return mave;
    }

    public void setMave(long mave) {
        this.mave = mave;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public long getMaghe() {
        return maghe;
    }

    public void setMaghe(long maghe) {
        this.maghe = maghe;
    }

    public long getMaphong() {
        return maphong;
    }

    public void setMaphong(long maphong) {
        this.maphong = maphong;
    }

    public long getGiave() {
        return giave;
    }

    public void setGiave(long giave) {
        this.giave = giave;
    }

    public Date getNgaychieu() {
        return ngaychieu;
    }

    public void setNgaychieu(Date ngaychieu) {
        this.ngaychieu = ngaychieu;
    }


    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }



}
