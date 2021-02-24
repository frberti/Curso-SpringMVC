package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido") //todas as requisições para pedido irão bater nesse Controller aqui
public class PedidoController {
	
	@GetMapping("formulario")
	public String formulario() { //pagina que deve ser aberta
		return "pedido/formulario";
	}

}
