package br.com.projeto.cardapio.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cardapio {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String fone;
    private String num_mesa;
    private String pedidos;
    
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
    public String getNum_mesa() {
        return num_mesa;
    }
    public void setNum_mesa(String num_mesa) {
        this.num_mesa = num_mesa;
    }
    public String getPedidos() {
        return pedidos;
    }
    public void setPedidos(String pedidos) {
        this.pedidos = pedidos;
    }
    
}
