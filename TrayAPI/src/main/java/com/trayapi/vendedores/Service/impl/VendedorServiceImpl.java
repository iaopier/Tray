package com.trayapi.vendedores.Service.impl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<VendedorModel> findAll() {
		return vendedorRepository.findAll();
	}

	@Override
	public Optional<VendedorModel> findById(long id) {
		return vendedorRepository.findById(id);
	}
	
	

}
