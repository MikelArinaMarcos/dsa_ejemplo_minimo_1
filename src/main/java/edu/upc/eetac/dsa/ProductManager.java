package edu.upc.eetac.dsa;

import edu.upc.eetac.dsa.Exceptions.exampleNoExisteException;
import edu.upc.eetac.dsa.Exceptions.usuarioNoExisteException;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public interface ProductManager {

    public void addProducto(String nombre, int precio);
    public List<Producto> getAllProducts();
    public Producto getProducto(String prod) throws exampleNoExisteException;
    public int sizeProductos();
    public void sortList();
    public void addUser(String mail, String name, String contra) throws usuarioNoExisteException;
    public List<Usuario> getAllUsers();
    public int sizeUsers();
    public Usuario getUser(String mail) throws usuarioNoExisteException;
    public void addComanda(LinkedList<Producto> productos, Usuario u) throws usuarioNoExisteException;
    public int sizeComanda();
    public void servirComanda();
    public void sortBestSellers();
    public LinkedList<Comanda> comandaCompletadaUser(Usuario u)throws usuarioNoExisteException;


}