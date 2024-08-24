package com.github.gregoryced.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.gregoryced.ecommerce.model.Produto;

public interface ProdutoRepository 
	extends JpaRepository<Produto, Long>{

}
