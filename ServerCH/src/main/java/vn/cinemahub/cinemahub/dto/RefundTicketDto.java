package vn.cinemahub.cinemahub.dto;

import lombok.*;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RefundTicketDto {
    private int id;
    private String tenphim;
    private long maphong;
    private int loaighe;
    private long giave;
    private Date ngaychieu;
    private Time khunggio;
}
