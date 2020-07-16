package vn.cinemahub.cinemahub.dto;

import vn.cinemahub.cinemahub.entities.RefundTicket;

import java.util.Date;

public class ReTicketDto {
    private Long id;
    private long mave;
    private long marap;
    private String tenphim;
    private long maghe;
    private long maphong;
    private long giave;
    private Date ngaychieu;
    private String khunggio;
    private Date giotra;
    private long tienphat;

    public Date getNgaychieu() {
        return ngaychieu;
    }

    public void setNgaychieu(Date ngaychieu) {
        this.ngaychieu = ngaychieu;
    }

    public Date getGiotra() {
        return giotra;
    }

    public void setGiotra(Date giotra) {
        this.giotra = giotra;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getMave() {
        return mave;
    }

    public Long getId() {
        return id;
    }

    public void setMave(long mave) {
        this.mave = mave;
    }

    public long getMarap() {
        return marap;
    }

    public void setMarap(long marap) {
        this.marap = marap;
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
}
