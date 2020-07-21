package com.trayapi.vendedores.Service;

import java.util.List;

import com.trayapi.vendedores.Models.VendaModel;

public interface VendaService {
	VendaModel save(VendaModel venda);
	List<VendaModel> findByIdVendedor(long id);
}
