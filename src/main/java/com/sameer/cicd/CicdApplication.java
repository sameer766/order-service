package com.sameer.cicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping
public class CicdApplication {
    @Autowired
    private OrderDao orderDao;

    @GetMapping
    public List<Order> fetchOrder() {
        return orderDao.orderList();
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdApplication.class, args);


    }


}
