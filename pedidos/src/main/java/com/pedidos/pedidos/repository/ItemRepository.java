package com.pedidos.pedidos.repository;

import com.pedidos.pedidos.entity.Item_pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item_pedido, Integer> {
}
