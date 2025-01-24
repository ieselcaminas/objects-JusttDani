package Proyectonetwork;

public class Main {
    public static void main(String[] args) {
        Mensaje n1 = new Mensaje();
        Mensaje n2 = new Mensaje();

        Usuario Dani = new Usuario("Dani", "eldani");
        Usuario Danis = new Usuario("Dani", "eldani");

        Usuario Daniser = new Usuario("Dani", "eldani");

        n1.darlike(Dani);
        n1.darlike(Danis);
        n1.darlike(Daniser);

        System.out.println(n1.getLikeadores());
    }
}
