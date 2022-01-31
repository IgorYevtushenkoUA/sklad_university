package com.example.sklad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GroupShortDto {
    private String name;
    private String description;
}
