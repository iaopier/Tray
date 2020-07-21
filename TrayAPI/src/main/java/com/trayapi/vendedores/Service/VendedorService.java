package com.trayapi.vendedores.Service;

import java.util.List;
import java.util.Optional;

import com.trayapi.vendedores.Models.VendedorModel;

public interface VendedorService {
	VendedorModel save(VendedorModel vendedor);
	List<VendedorModel> findAll();
	Optional<VendedorModel> findById(long id);
}
