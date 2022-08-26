
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
@Table(name = "ProdutoBebidas")
public class ProdutoBebidas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column (name = "nomeBebida")
    private String nomeBebida;
    
    @Column(name = "sabor")
    private String sabor;
    
    @Column(name = "volume")
    private String volume;
    
    @Column(name = "marca")
    private String marca;

    @Column(name = "tipo")
    private String tipo;   

    public ProdutoBebidas() {
    }

    public ProdutoBebidas(Integer id, String nomeBebida, String sabor, String volume, String marca, String tipo) {
        this.id = id;
        this.nomeBebida = nomeBebida;
        this.sabor = sabor;
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

    public String getNomeBebida() {
        return nomeBebida;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
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
        return "ProdutoBebidas{" + "id=" + id + ", nomeBebida=" + nomeBebida + ", sabor=" + sabor + ", volume=" + volume + ", marca=" + marca + ", tipo=" + tipo + '}';
    }
    
    
    
    

    
}
