package com.trayapi.vendedores;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.trayapi.vendedores.Models.VendedorModel;

@SpringBootTest
class TrayApiApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;
		
	private MockMvc mockMvc;
	@Test
	void contextLoads() {
	}
	@BeforeEach
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void criarVendedor() throws Exception {
		VendedorModel v = new VendedorModel();
		v.setEmail("pierhett@gmail.com");
		v.setNome("Piercarlo Soares");
		ObjectMapper mapper = new ObjectMapper();
	    ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
	    String requestJson=ow.writeValueAsString(v);
	    mockMvc.perform(post("http://localhost:8080/criar").contentType("application/json")
	            .content(requestJson))
	            .andExpect(status().isOk());
	    
	    mockMvc.perform(get("http://localhost:8080/listavendedores").contentType("application/json")
	    		.content(requestJson))
	    		.andExpect(status().isOk());
	    
	    
	}
}
