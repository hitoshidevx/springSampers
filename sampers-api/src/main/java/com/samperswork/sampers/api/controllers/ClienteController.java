package com.samperswork.sampers.api.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samperswork.sampers.domain.models.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> BuscarClientes() {
		Cliente c1 = new Cliente();
		c1.setId(1L);
		c1.setNome("Hitoshi");
		c1.setEmail("hitoshi@gmail");
		c1.setTelefone("11989877709");
		
		Cliente c2 = new Cliente();
		c2.setId(2L);
		c2.setNome("Elaine");
		c2.setEmail("elaine@email");
		c2.setTelefone("11957937616");
		
		
		return Arrays.asList(c1, c2);
	}
	
}
