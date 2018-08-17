package springcloud.noe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springcloud.noe.feign.ComputeClient;

@RestController
public class ConsumerController {

    @Autowired
    ComputeClient ComputeClient;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add() {
        return ComputeClient.add(10, 20);
    }

}
