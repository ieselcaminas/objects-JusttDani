package Proyectonetwork;

import java.util.ArrayList;

public class Publicacion {
    private static int contador = 0;
    private int idPublicacion;
    private int likes = 0;
    private ArrayList<String> likeadores = new ArrayList<String>();

    public Publicacion() {
        this.idPublicacion = ++contador;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public void darlike(Usuario usuario) {
        likes++;
        likeadores.add(usuario.getNick());
    }

    public int getLikes() {
        return likes;
    }

    public ArrayList<String> getLikeadores() {
        return likeadores;
    }
}


