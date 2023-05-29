package com.devsuperior.desafio.services;

import com.devsuperior.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShipmentService {

    public double shipment(Order order) {
        double basic = order.getBasic();
        if (basic < 100.0) {
            basic =+ 20.00;
        } else if (basic < 200.0) {
            basic =+ 12.00;
        } else {
            return basic = 0.0;
        }
        return basic;
    }
}
