package vn.cinemahub.cinemahub.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class SeachSeatDto {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
