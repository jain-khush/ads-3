package com.example.ads.Dto;

import com.example.ads.Entity.Categories;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class AdDto {
    private String description;
    private String externalLink;
    @Enumerated(EnumType.STRING)
    private Categories category;
    private String imageLink;
    private String companyId;
    private String companyName;

}
