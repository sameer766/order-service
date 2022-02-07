package com.sameer.cicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
@RequestMapping
public class CicdApplication {
    @Autowired
    private OrderDao orderDao;

    @GetMapping
    public List<Order> fetchOrder() {
        System.out.println("hi");
        return orderDao.orderList().stream().sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdApplication.class, args);


    }


}
