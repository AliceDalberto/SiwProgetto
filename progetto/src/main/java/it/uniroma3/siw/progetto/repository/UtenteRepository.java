package it.uniroma3.siw.progetto.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.progetto.model.Progetto;
import it.uniroma3.siw.progetto.model.Utente;


public interface UtenteRepository extends CrudRepository<Utente, Long> {

	 public List<Utente> findByProgettiVisibili(Progetto progetto);
	 public Optional<Utente> findByNome(String nome);
	
}
