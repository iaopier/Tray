package com.trayapi.vendedores.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.trayapi.vendedores.Models.VendaModel;

@Repository
public interface VendaRepository extends JpaRepository<VendaModel, Long>{
	@Query(value = "SELECT * FROM tb_venda WHERE id_vendedor = :id", nativeQuery=true)
	List<VendaModel> findByIdVendedor(@Param("id") long id);
}
