package br.com.alura.screenmatchfrases.controllers;

import br.com.alura.screenmatchfrases.dto.FraseDTO;
import br.com.alura.screenmatchfrases.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrasesController {
    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO getFrases(){
      return service.getRandomSeries();
    };
}
