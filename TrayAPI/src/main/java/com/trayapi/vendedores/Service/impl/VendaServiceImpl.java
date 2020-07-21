package com.trayapi.vendedores.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trayapi.vendedores.Models.VendaModel;
import com.trayapi.vendedores.Models.VendedorModel;
import com.trayapi.vendedores.Repository.VendaRepository;
import com.trayapi.vendedores.Repository.VendedorRepository;
import com.trayapi.vendedores.Service.VendaService;

@Service
public class VendaServiceImpl implements VendaService {

	@Autowired
	VendaRepository vendaRepository;
	
	@Autowired 
	VendedorRepository vendedorRepository;
	
	@Override
	public VendaModel save(VendaModel venda) {
		Optional<VendedorModel> v = vendedorRepository.findById((long) venda.getIdVendedor());
		venda.setComissao(venda.getValorVenda()*0.085);
		venda.setEmail(v.get().getEmail());
		venda.setNome(v.get().getNome());
		return vendaRepository.save(venda);
	}

	@Override
	public List<VendaModel> findByIdVendedor(long id) {
		return vendaRepository.findByIdVendedor(id);
	}

	
	

}
