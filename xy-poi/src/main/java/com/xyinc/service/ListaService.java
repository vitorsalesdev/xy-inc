package com.xyinc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.xyinc.model.LocalizacaoReferencia;
import com.xyinc.model.Poi;
import com.xyinc.repository.PoiRepository;

@Service
public class ListaService {

	@Autowired
	private PoiRepository repository;

	public ResponseEntity<List<Poi>> listar() {
		return ResponseEntity.ok(repository.findAll());
	}

	public ResponseEntity<List<Poi>> localizar(@RequestBody LocalizacaoReferencia lR) {

		if (lR.getX() <= 0 || lR.getY() <= 0 || lR.getDmax() <= 0) {
			return ResponseEntity.badRequest().build();
		} else {
			List<Poi> templist = new ArrayList<Poi>();

			for (Poi p : repository.findAll()) {
				double distancia = Math.sqrt(Math.pow((lR.getX() - p.getX()), 2) + Math.pow((lR.getY() - p.getY()), 2));

				if (distancia <= lR.getDmax()) {
					templist.add(p);
				}
			}
			if (templist.isEmpty()) {
				return ResponseEntity.notFound().build();
			} else {
				return ResponseEntity.ok(templist);
			}
		}
	}
}