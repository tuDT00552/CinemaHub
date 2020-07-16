package vn.cinemahub.cinemahub.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ThKeDto {
    private String timeStart;
    private String timeEnd;
    private Long doanhthu;
    private String tenphim;
    private Long sove;

    public ThKeDto(Long doanhthu, String tenphim, Long sove) {
        this.doanhthu = doanhthu;
        this.tenphim = tenphim;
        this.sove = sove;
    }


}
