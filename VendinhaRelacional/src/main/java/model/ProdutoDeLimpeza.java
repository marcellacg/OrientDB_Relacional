/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Marcela
 */
@Entity
@Table(name = "ProdutoDeLimpeza")
public class ProdutoDeLimpeza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column (name = "nomeProd")
    private String nomeProd;
    
    @Column(name = "volume")
    private String volume;
    
    @Column(name = "marca")
    private String marca;

    @Column(name = "tipo")
    private String tipo;

    public ProdutoDeLimpeza() {
    }

    public ProdutoDeLimpeza(Integer id, String nomeProd, String volume, String marca, String tipo) {
        this.id = id;
        this.nomeProd = nomeProd;
        this.volume = volume;
        this.marca = marca;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ProdutoDeLimpeza{" + "id=" + id + ", nomeProd=" + nomeProd + ", volume=" + volume + ", marca=" + marca + ", tipo=" + tipo + '}';
    }

    
}
