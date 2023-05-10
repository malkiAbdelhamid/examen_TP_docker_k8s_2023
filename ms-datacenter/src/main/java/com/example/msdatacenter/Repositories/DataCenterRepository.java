package com.example.msdatacenter.Repositories;

import com.example.msdatacenter.entities.DataCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataCenterRepository extends JpaRepository<DataCenter,Long> {
}
