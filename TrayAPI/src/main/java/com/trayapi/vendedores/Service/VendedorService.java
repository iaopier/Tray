package com.trayapi.vendedores.Service;

import java.util.List;

import com.trayapi.vendedores.Models.VendedorModel;

public interface VendedorService {
	VendedorModel save(VendedorModel vendedor);
	List<VendedorModel> findAll();
}