package edu.fernanda.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Fernanda";
        String segundoNome = "Brum";

        System.out.println(incluirNomeCompleto(primeiroNome, segundoNome));

    }

    public static String incluirNomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
