package com.itcompiler.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itcompiler.apirest.apirest.Entities.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

} 
