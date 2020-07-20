package com.trayapi.vendedores.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trayapi.vendedores.Models.VendaModel;
import com.trayapi.vendedores.Repository.VendaRepository;
import com.trayapi.vendedores.Service.VendaService;

@Service
public class VendaServiceImpl implements VendaService {

	@Autowired
	VendaRepository vendaRepository;
	
	@Override
	public VendaModel save(VendaModel venda) {
		vendaRepository.save(venda);
		return null;
	}

	
	

}
