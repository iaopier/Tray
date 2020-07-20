package com.trayapi.vendedores.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trayapi.vendedores.Models.VendaModel;
import com.trayapi.vendedores.Models.VendedorModel;

@Repository
public interface VendaRepository extends JpaRepository<VendaModel, Long>{

}
