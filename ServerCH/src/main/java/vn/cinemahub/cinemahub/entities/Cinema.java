package vn.cinemahub.cinemahub.entities;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CINEMA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Cinema {
    //Mã rạp
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "CIA_SEQ")
    @SequenceGenerator(sequenceName = "CINEMA_SEQ", allocationSize = 1, name = "CIA_SEQ")
    @Column(name = "CINEMA_CODE")
    private Long cinemaCode;

    @NotNull
    @Column(name = "CINEMA_NAME")
    private String cinemaName;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DESCRIPTION")
    private Double description;

    @NotNull
    @Column(name = "STATUS")
    private Double status;
}
