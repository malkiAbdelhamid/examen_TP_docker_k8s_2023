package com.example.msuser;

import com.example.msuser.Repositories.UtilisateurRepository;
import com.example.msuser.Repositories.VmRepository;
import com.example.msuser.entities.Configuration;
import com.example.msuser.entities.Utilisateur;
import com.example.msuser.entities.Vm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsUserApplication implements CommandLineRunner {

    @Autowired
    UtilisateurRepository userRepository;
    @Autowired
    VmRepository vmRepository;
    public static void main(String[] args) {
        SpringApplication.run(MsUserApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Utilisateur user1= userRepository.save(new Utilisateur(null, "malki","a.malki@esi.dz", null));
        Utilisateur user2= userRepository.save(new Utilisateur(null, "amine","a.amine@esi.dz", null));

        vmRepository.save(new Vm(null,new Configuration(2,16,20),user1,1L));
        vmRepository.save(new Vm(null,new Configuration(1,8,20),user1,2L));
        vmRepository.save(new Vm(null,new Configuration(4,32,100),user2,1L));

    }
}
