package org.miscusi.backdev.repo;

import org.miscusi.backdev.pojo.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {

}
