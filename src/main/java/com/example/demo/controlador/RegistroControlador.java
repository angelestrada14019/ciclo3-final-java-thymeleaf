package com.example.demo.controlador;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entidades.Registro;
import com.example.demo.entidades.Registro2;
import com.example.demo.servicios.RegistroService;
import com.example.demo.servicios.RegistroService2;




@Controller
public class RegistroControlador {
	@Autowired
	private RegistroService registroService;
	
	@Autowired
	private RegistroService2 registroService2;
	
	
	@GetMapping("/")
	public String index() {
		return "/index";
	}
	@GetMapping("/agregar")
	public String agregar() {
		return "/html/agregar";
	}
	
	@GetMapping("/ver")
	public String ver() {
		return "/html/ver";
	}
	@GetMapping("/votar")
	public String votar() {
		return "/html/votar";
	}
	@GetMapping("/registrarCedula")
	public String registrarCedula(Model model) {
		model.addAttribute("registro",new Registro());
		return "/html/registrarCedula";
	}
	@PostMapping("/saveRegistro")
	public String registrarCedula(@Validated Registro registro) {
		registroService.save(registro);
		return "redirect:/";
	}
	
	
	
	@GetMapping("/search")
	public String search(@Param("identificacion") Long identificacion, Model model) {
			
			List<Registro2> searchRegistro=search(identificacion);
			model.addAttribute("searchRegistro",searchRegistro);
		
		
		return "/html/consultarCedula";
	}
	
	public List<Registro2> search(Long identificacion){		
		if(identificacion!=null) {	
			System.out.println("entre");
			return registroService2.search(identificacion);
			
		}
		System.out.println("no entre");
		return new ArrayList<Registro2>();
	}
	
}
