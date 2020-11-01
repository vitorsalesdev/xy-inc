package com.xyinc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.xyinc.model.Poi;
import com.xyinc.repository.PoiRepository;

@Service
public class CadastroService {

	@Autowired
	private PoiRepository repository;

	public ResponseEntity<Poi> cadastrar(@RequestBody Poi poi) {
		if (poi.getNome().isBlank() || poi.getNome().length() > 70 || poi.getX() <= 0 || poi.getY() <= 0) {
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(poi));
		}
	}
	
	public ResponseEntity<Poi> editar(@PathVariable long id, @RequestBody Poi poi) {
		poi.setId(id);
		if (poi.getNome().isBlank() || poi.getNome().length() > 70 || poi.getX() <= 0 || poi.getY() <= 0) {
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(poi)); 
		}
	}

	public void deletar(@PathVariable long id) {
		repository.deleteById(id);
	}
}