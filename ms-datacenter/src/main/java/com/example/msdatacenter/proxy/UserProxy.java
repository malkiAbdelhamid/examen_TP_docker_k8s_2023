package com.example.msdatacenter.proxy;

import com.example.msdatacenter.model.Vm;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ms-user")
@LoadBalancerClient(name = "ms-user")
public interface UserProxy {
    @GetMapping("/vms/search/findVmsByIdServeur")
    public CollectionModel<Vm> getVmsConfig(@RequestParam Long idServeur);
}
