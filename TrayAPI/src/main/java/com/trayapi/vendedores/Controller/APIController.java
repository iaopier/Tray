package com.trayapi.vendedores.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.trayapi.vendedores.Models.VendedorModel;
import com.trayapi.vendedores.Service.VendaService;
import com.trayapi.vendedores.Service.VendedorService;

@RestController
public class APIController {
	
	@Autowired
	VendedorService vendedorService;
	
	@Autowired
	VendaService vendaService;
	
	
	@RequestMapping(value = "/criar", method = RequestMethod.POST)
	public ResponseEntity<?> vendedorPost(@RequestBody VendedorModel vendedor) {
		return new ResponseEntity<>(vendedorService.save(vendedor), HttpStatus.OK);
	}
	@RequestMapping(value = "/listavendedores", method = RequestMethod.GET)
	public ResponseEntity<?> vendedorGetAll(){
		return new ResponseEntity<>(vendedorService.findAll(), HttpStatus.OK);
	}
}
