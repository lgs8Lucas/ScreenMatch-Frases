package br.com.alura.screenmatchfrases.repository;

import br.com.alura.screenmatchfrases.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Optional<Frase> obterFraseAlteatoria();

}
