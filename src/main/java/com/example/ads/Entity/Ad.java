package com.example.ads.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name= "Ad")
public class Ad {


    @Id
    private String adId = UUID.randomUUID().toString();
    private String description;
    private String externalLink;
    @Enumerated(EnumType.STRING)
    private List<Categories> category;
    private String imageLink;

//    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "companyId")
    private Company company;

}
