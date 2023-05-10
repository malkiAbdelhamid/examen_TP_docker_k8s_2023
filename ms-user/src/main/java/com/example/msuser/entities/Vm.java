package com.example.msuser.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor  @NoArgsConstructor
public class Vm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVm;
    @Embedded
    private  Configuration configuration;
    @ManyToOne
    private Utilisateur utilisateur;
   private Long idServeur;
}
