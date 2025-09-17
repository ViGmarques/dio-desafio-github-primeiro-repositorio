public class MinhaClasse {
    public static void main (String [] args) {
        // String nome = "Vitor Gabriel";
        // System.out.print("Olá " + nome + ", seja bem-vindo!");

        String primeiroNome = "Vitor";
        String segundoNome = "Gabriel";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
