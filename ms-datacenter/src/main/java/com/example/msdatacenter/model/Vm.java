package com.example.msdatacenter.model;

import com.example.msdatacenter.entities.Configuration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;

@Data @AllArgsConstructor @NoArgsConstructor
public class Vm {
    @Embedded
    private Configuration configuration;
}
