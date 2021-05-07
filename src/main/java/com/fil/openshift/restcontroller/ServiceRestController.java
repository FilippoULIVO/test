package com.fil.openshift.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fil.openshift.model.Contatto;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario","Rossi","mario"));
		lista.add(new Contatto("Maria","Verdi","maria"));
		lista.add(new Contatto("Peppe","Gialli","peppe"));
		lista.add(new Contatto("Tino","Fossi","tino"));
		return lista;
	}

}
