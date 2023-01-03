package com.raphaelf9.f9commerce.repositories;

import com.raphaelf9.f9commerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
