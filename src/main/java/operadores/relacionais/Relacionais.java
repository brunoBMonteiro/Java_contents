package operadores.relacionais;

public class Relacionais {
    public static void main(String[] args) {
        // resto da divisão
        int resto = 10 % 2;
        System.out.println(resto);
        // saber se é par ou impar
        // se o resto da divisão for 0 é par
        // se o resto da divisão for 1 é impar
        System.out.println(10 % 2 == 0);
        System.out.println(11 % 2 == 0);
        // < menor que, > maior que, <= menor ou igual, >= maior ou igual, == igual, != diferente
        System.out.println(10 < 2);
        System.out.println(10 > 2);
        System.out.println(10 <= 2);
        System.out.println(10 >= 2);
        System.out.println(10 == 2);
        System.out.println(10 != 2);
        // booleanos são comparados com == e !=
        boolean a = true;
        boolean b = false;
        System.out.println(a == b);
        System.out.println(a != b);
    }
}
