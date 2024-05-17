package br.com.projeto.cardapio.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.cardapio.domain.Cardapio;
import br.com.projeto.cardapio.service.CardapioService;

@RestController
@RequestMapping("/projeto/cardapio/cardapio")
public class CardapioResource {
    @Autowired
    private CardapioService cardapioService; 
    
    @PostMapping("/")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void save(@RequestBody Cardapio cardapio) {
        cardapioService.salvar(cardapio);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Cardapio> getById(@PathVariable("id") Integer id) {
        Cardapio cardapio = cardapioService.obterPorId(id);   
    
        return ResponseEntity.ok().body(cardapio);
    }
    
    @GetMapping("/")
    public ResponseEntity<List<Cardapio>> getAll() {
        List<Cardapio> cardapio = cardapioService.getAll();
        return ResponseEntity.ok().body(cardapio);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") Integer id, @RequestBody Cardapio cardapio) {
        Cardapio existingCardapio = cardapioService.obterPorId(id);
        if (existingCardapio == null) {
            return ResponseEntity.notFound().build();
        }
    
        cardapio.setId(id);
        cardapioService.atualizar(cardapio);
        return ResponseEntity.noContent().build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        Cardapio existingCardapio = cardapioService.obterPorId(id);
        if (existingCardapio == null) {
            return ResponseEntity.notFound().build();
        }
    
        cardapioService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}