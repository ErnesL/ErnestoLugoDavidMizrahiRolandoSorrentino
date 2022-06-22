/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2edd;

/**
 *
 * @author davidmizrahi
 */
public class Articulo<T> {
    
    private String titulo;
    private Lista<String> autores;
    private String cuerpo;
    private Lista<String> palabrasClave;
    
    
       public Articulo(){
    
        this.titulo = "";
        this.cuerpo = "";
        this.palabrasClave = new Lista<>();
        this.autores = new Lista<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Lista<String> getAutores() {
        return autores;
    }

    public void setAutores(Lista<String> autores) {
        this.autores = autores;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Lista<String> getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(Lista<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }
    
}
