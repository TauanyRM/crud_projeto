package br.com.projeto.cardapio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.cardapio.domain.Cardapio;
import br.com.projeto.cardapio.repository.CardapioRepository;

@Service
public class CardapioService {

    @Autowired
    private CardapioRepository cardapioRepository;

    public void salvar(Cardapio cardapio) {
        cardapioRepository.save(cardapio);
    }

    public Cardapio obterPorId(Integer id) {
        return cardapioRepository.findById(id).get();
    }

    public java.util.List<Cardapio> getAll() {
        return cardapioRepository.findAll();
    }
    
    public void atualizar(Cardapio cardapio) {
        cardapioRepository.save(cardapio);
    }
    
    public void excluir(Integer id) {
        cardapioRepository.deleteById(id);
    }
}