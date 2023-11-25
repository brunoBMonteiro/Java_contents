package operadores.logicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + !a);
        System.out.println("!b = " + !b);
        // AND (&&) - retorna true se as duas condições forem verdadeiras
        // exemplo: true && true = true
        //          true && false = false
        //          false && true = false
        //          false && false = false
        // OR (||) - retorna true se uma das condições for verdadeira
        // exemplo: true || true = true
        //          true || false = true
        //          false || true = true
        //          false || false = false
        // NOT (!) - inverte o valor booleano
        // exemplo: !true = false
        //          !false = true
    }
}
