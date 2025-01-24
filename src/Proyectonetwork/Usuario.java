package Proyectonetwork;

public class Usuario {
    private String nombre;
    private String nick;
    private int idPersona;
    private static int contadorP = 0;

    Usuario(String nombre, String nick) {
        this.nombre = nombre;
        this.nick = nick;
        this.idPersona = contadorP++;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContadorP() {
        return contadorP;
    }
}
