package com.raphaelf9.f9commerce.services;

import com.raphaelf9.f9commerce.dto.ProductDTO;
import com.raphaelf9.f9commerce.entities.Product;
import com.raphaelf9.f9commerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product product = repository.findById(id).get();
        return new ProductDTO(product);

    }
}
