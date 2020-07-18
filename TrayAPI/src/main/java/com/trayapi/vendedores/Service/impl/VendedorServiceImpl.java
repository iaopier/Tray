package com.trayapi.vendedores.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trayapi.vendedores.Models.VendedorModel;
import com.trayapi.vendedores.Repository.VendedorRepository;
import com.trayapi.vendedores.Service.VendedorService;

@Service
public class VendedorServiceImpl implements VendedorService {

	@Autowired
	VendedorRepository vendedorRepository;
	
	@Override
	public VendedorModel save(VendedorModel vendedor) {
		vendedorRepository.save(vendedor);
		return vendedor;
	}

}
