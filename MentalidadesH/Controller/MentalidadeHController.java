package com.HabilidadesM.MentalidadesH.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/MentalidadeH")
public class MentalidadeHController {
@GetMapping
public String MentalidadeH() {
	return "Orientação ao Futuro e Persitência ";
}
@GetMapping
public String Habilidades() {
	return "Trabalho em Equipe e Comunicação ";
}
}