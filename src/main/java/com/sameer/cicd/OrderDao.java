package com.sameer.cicd;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class OrderDao {

public List<Order> orderList() {
    return Stream.of(new Order(1,"a",2,3000),
            new Order(2,"b",3,4000)
            ).collect(Collectors.toList());

}
}
