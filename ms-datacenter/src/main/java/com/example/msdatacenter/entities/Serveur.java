package com.example.msdatacenter.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor  @NoArgsConstructor
public class Serveur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServeur;
    @Embedded
    private Configuration configuration;
    @ManyToOne
    private DataCenter dataCenter;
}
