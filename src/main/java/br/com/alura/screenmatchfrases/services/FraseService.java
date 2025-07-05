package br.com.alura.screenmatchfrases.services;

import br.com.alura.screenmatchfrases.dto.FraseDTO;
import br.com.alura.screenmatchfrases.models.Frase;
import br.com.alura.screenmatchfrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO getRandomSeries(){
        var frase = repository.obterFraseAlteatoria();
        return frase.map(FraseDTO::new).orElse(null);
    }

}
