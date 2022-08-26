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
@Table(name = "ProdutoDeHigiene")
public class ProdutoDeHigiene {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column (name = "nomeProdHigiene")
    private String nomeProdHigiene;
    
    @Column(name = "volume")
    private String volume;
    
    @Column(name = "marca")
    private String marca;
    
    @Column(name = "fabricante")
    private String fabricante;

    @Column(name = "tipo")
    private String tipo;    

    public ProdutoDeHigiene() {
    }

    public ProdutoDeHigiene(Integer id, String nomeProdHigiene, String volume, String marca, String fabricante, String tipo) {
        this.id = id;
        this.nomeProdHigiene = nomeProdHigiene;
        this.volume = volume;
        this.marca = marca;
        this.fabricante = fabricante;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeProdHigiene() {
        return nomeProdHigiene;
    }

    public void setNomeProdHigiene(String nomeProdHigiene) {
        this.nomeProdHigiene = nomeProdHigiene;
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ProdutoDeHigiene{" + "id=" + id + ", nomeProdHigiene=" + nomeProdHigiene + ", volume=" + volume + ", marca=" + marca + ", fabricante=" + fabricante + ", tipo=" + tipo + '}';
    }

    
    
}
