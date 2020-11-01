package com.xyinc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyinc.model.LocalizacaoReferencia;
import com.xyinc.model.Poi;
import com.xyinc.service.CadastroService;
import com.xyinc.service.ListaService;

@RestController
@RequestMapping
@CrossOrigin("*")
public class AppController {

	@Autowired
	private CadastroService cadastroService;

	@Autowired
	private ListaService listaService;

	@GetMapping("/listar")
	public ResponseEntity<List<Poi>> listar() {
		return listaService.listar();
	}

	@PostMapping("/cadastro")
	public ResponseEntity<Poi> cadastrar(@RequestBody Poi poi) {
		return cadastroService.cadastrar(poi);
	}

	@PutMapping("/cadastro/{id}")
	public ResponseEntity<Poi> editar(@PathVariable long id, @RequestBody Poi poi) {
		return cadastroService.editar(id, poi);
	}

	@DeleteMapping("/cadastro/{id}")
	public void deletar(@PathVariable long id) {
		cadastroService.deletar(id);
	}

	@PostMapping("/localizar")
	public ResponseEntity<List<Poi>> localizar(@RequestBody LocalizacaoReferencia lR) {
		return listaService.localizar(lR);
	}
}