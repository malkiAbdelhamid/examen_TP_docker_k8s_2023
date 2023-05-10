package com.example.msdatacenter;

import com.example.msdatacenter.Repositories.DataCenterRepository;
import com.example.msdatacenter.Repositories.ServeurRepository;
import com.example.msdatacenter.entities.Configuration;
import com.example.msdatacenter.entities.DataCenter;
import com.example.msdatacenter.entities.Serveur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsDatacenterApplication implements CommandLineRunner {

    @Autowired
    DataCenterRepository dataCenterRepository;
    @Autowired
    ServeurRepository serveurRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsDatacenterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        DataCenter d1=dataCenterRepository.save(new DataCenter(null,"sba",100,null));
        DataCenter d2=dataCenterRepository.save(new DataCenter(null,"oran",200,null));

        serveurRepository.save(new Serveur(null,new Configuration(16,64,200),d1 ));
        serveurRepository.save(new Serveur(null,new Configuration(32,256,1000),d1 ));
        serveurRepository.save(new Serveur(null,new Configuration(16,64,400),d2 ));
    }
}
