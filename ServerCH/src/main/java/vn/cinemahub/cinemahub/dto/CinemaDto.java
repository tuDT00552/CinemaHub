package vn.cinemahub.cinemahub.dto;

import lombok.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import vn.cinemahub.cinemahub.entities.Cinema;

import java.util.Date;

public class CinemaDto {
    private Long id;
    private int marap;
    private String tenrap;
    private String diachi;
    private String gioithieu;
    private int status;
    private Date createdAt;
    private Date updateAt;

    public CinemaDto(Long id, int marap, String tenrap, String diachi, String gioithieu, int status, Date createdAt, Date updateAt) {
        this.id = id;
        this.marap = marap;
        this.tenrap = tenrap;
        this.diachi = diachi;
        this.gioithieu = gioithieu;
        this.status = status;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public CinemaDto() {

    }

    public CinemaDto(Cinema cinema) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getGioithieu() {
        return gioithieu;
    }

    public void setGioithieu(String gioithieu) {
        this.gioithieu = gioithieu;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
