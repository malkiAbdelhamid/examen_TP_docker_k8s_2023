package com.example.msdatacenter.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class DataCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDataCenter;
    private String ville;
    private int capacité;
    @JsonIgnore
    @OneToMany(mappedBy = "dataCenter")
    private List<Serveur> serveurs;
}
