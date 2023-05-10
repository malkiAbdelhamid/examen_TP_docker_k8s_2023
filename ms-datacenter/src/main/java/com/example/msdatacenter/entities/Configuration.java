package com.example.msdatacenter.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data @AllArgsConstructor @NoArgsConstructor
public class Configuration implements Serializable {
    public int cpu;
    public int ram;
    public int disk;
}
