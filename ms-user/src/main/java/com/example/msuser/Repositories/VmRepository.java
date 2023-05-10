package com.example.msuser.Repositories;

import com.example.msuser.entities.Vm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VmRepository extends JpaRepository<Vm,Long> {

   List<Vm> findVmsByIdServeur(Long idServeur);
}
