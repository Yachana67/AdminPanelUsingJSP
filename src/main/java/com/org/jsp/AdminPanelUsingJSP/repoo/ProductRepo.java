package com.org.jsp.AdminPanelUsingJSP.repoo;

import java.util.Optional;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.jsp.AdminPanelUsingJSP.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {



}
