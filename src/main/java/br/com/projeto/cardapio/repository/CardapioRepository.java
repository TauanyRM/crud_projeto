package br.com.projeto.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.cardapio.domain.Cardapio;

public interface CardapioRepository extends JpaRepository<Cardapio, Integer> {
    
}
