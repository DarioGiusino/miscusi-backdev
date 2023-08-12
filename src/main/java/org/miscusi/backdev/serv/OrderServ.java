package org.miscusi.backdev.serv;

import java.util.List;
import java.util.Optional;

import org.miscusi.backdev.pojo.OrderEntity;
import org.miscusi.backdev.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServ {

    @Autowired
    private OrderRepo orderRepo;

    public List<OrderEntity> findAll() {
        return orderRepo.findAll();
    }

    public OrderEntity save(OrderEntity order) {
        return orderRepo.save(order);
    }

    public Optional<OrderEntity> findById(int id) {
        return orderRepo.findById(id);
    }

    public void delete(OrderEntity order) {
        orderRepo.delete(order);
    }
}
