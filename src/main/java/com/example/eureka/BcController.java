package com.example.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yuanping Zhang
 * @date
 */
@RestController
@RequestMapping("/consumer")
public class BcController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/bob")
    public String bc() {
        return restTemplate.getForObject("http://nacos-server/client/hello?name=Bob", String.class);
    }

}
