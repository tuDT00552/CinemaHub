package vn.cinemahub.cinemahub.dto;

import java.util.Date;

public class ThongkeDto {
    private String timeStart;
    private String timeEnd;
    private Long doanhthu;
    private String tenphim;
    private Long sove;

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

    public Long getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(Long doanhthu) {
        this.doanhthu = doanhthu;
    }
}
