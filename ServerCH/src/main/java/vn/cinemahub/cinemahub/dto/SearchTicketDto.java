package vn.cinemahub.cinemahub.dto;

public class SearchTicketDto {
    private String tenphim;
    private Long idghe;
    private Long status;

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public Long getIdghe() {
        return idghe;
    }

    public void setIdghe(Long idghe) {
        this.idghe = idghe;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
