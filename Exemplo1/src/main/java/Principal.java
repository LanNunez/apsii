public class Principal {
    public static void main (String[] args) {
        Banco b1 = new Banco ("Arllan", "000", 15);
        Banco b2 = new Banco ();
        Banco b3 = new Banco ("Arllan", "000000", 70);

        System.out.println(b3.getNome());
        b3.setNome("Joaquin");
        System.out.println(b3.getNome());
    }
}

