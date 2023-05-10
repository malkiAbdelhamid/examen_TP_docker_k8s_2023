package com.example.msdatacenter.Controller;

import com.example.msdatacenter.Repositories.ServeurRepository;
import com.example.msdatacenter.entities.Serveur;
import com.example.msdatacenter.model.Vm;
import com.example.msdatacenter.proxy.UserProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api")
public class DataCenterAPI {
    @Autowired
    ServeurRepository serveurRepository;
    @Autowired
    UserProxy userProxy;
    @GetMapping("serveur/{id}/remaining-ram")
    public int remaining_ram(@PathVariable Long id){
        Serveur serveur=serveurRepository.findById(id).get();
        ArrayList<Vm> vms=new ArrayList<>(userProxy.getVmsConfig(serveur.getIdServeur()).getContent());
        int remaining_ram=serveur.getConfiguration().getRam();
        for(Vm vm:vms)
            remaining_ram=remaining_ram-vm.getConfiguration().getRam();
        return remaining_ram;
    }

}
