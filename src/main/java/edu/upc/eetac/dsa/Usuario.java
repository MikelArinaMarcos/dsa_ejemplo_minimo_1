package edu.upc.eetac.dsa;

import edu.upc.eetac.dsa.Comanda;
import edu.upc.eetac.dsa.util.idGenerator;

import java.util.HashMap;

public class Usuario {
    /*
        Definimos los atributos que presentará cada uno de los usuarios:
        - id --> código que lo identificará.
        - mail --> correo electrónico del usuario.
        - nombre --> nombre del usuario.
        - contraseña --> contraseña que utilizará para identificarse.
        - comandas --> historial de comandas realizadas por el usuario.
     */
    String id;
    String mail;
    String nombre;
    String contra;
    HashMap<String, Comanda> comandas;

    public Usuario(String mail, String nombre, String contra){
        this.setID(idGenerator.getId());
        this.setMail(mail);
        this.setContra(contra);
        this.setNombre(nombre);
        this.setComandas();
    }

    private String getId() {
        return id;
    }
    private void setID(String id) {
        this.id = id;
    }

    private String getMail() {
        return mail;
    }
    private void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getContra() {
        return contra;
    }
    private void setContra(String contra) {
        this.contra = contra;
    }

    public HashMap<String, Comanda> getComandas() {
        return comandas;
    }
    private void setComandas() {
        this.comandas = new HashMap<>();
    }
    public void addComanda(String id, Comanda comanda) {
        this.comandas.put(id,comanda);
    }
}
