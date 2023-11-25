package tiposprimitivos;

public class Aula01TiposPrimitivosECasting {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // tipos primitivos: int, double, float, char, boolean, byte, short, long
        int idade = 20;
        double salarioDouble = 3000.0; // O double geralmente é representado por 64 bits, então consegue bem mais
        // precisão, mas ainda não a exatidão já que a forma de representação também é binária,
        // ele é chamado de dupla precisão.
        float salarioFloat = 3000.0f; // O float normalmente possui 32 bits para representar o expoente e a mantissa,
        // além do sinal. Dá pra representar muitos números, mas por sua natureza binária não consegue representar
        // todos os números, então ele representa o que está mais próximo do que se deseja, e é chamado de simples precisão.
        byte idadeByte = 20;
        short idadeShort = 20;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caractere = '\u0041'; // 2 bytes
        System.out.println("Conteúdo da variável: " + idade);
        // Acima exemplos de declaração de variáveis com tipos primitivos.
        // Abaixo CASTING, conversão de tipos.
        salarioDouble = 3000.0f; // double -> float
        // salarioFloat = 3000.0; // float -> double NÃO aceita, incompatibilidade de tipos.
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        // Forçar o casting de tipos precisa de atenção, pois pode haver perda de dados.
        // Exemplo:
        // salarioFloat = salarioDouble; // double -> float NÃO aceita, incompatibilidade de tipos.
        salarioFloat = (float) salarioDouble; // double -> float aceita, mas pode haver perda de dados.
        // Mais exemplos de casting
        idade = (int) salarioDouble; // double -> int aceita, mas pode haver perda de dados.
        System.out.println(idade);
        // Exemplo de casting de char para int
        System.out.println(caractere);
        int valor = 'A'; // char -> int aceita, mas pode haver perda de dados.
        System.out.println(valor);
        // Exemplo de casting de int para char
        valor = 65; // int -> char aceita, mas pode haver perda de dados.
        System.out.println(valor);
        caractere = (char) valor;
        System.out.println(caractere);
        // Exemplo de casting de int para byte
        valor = 65; // int -> byte aceita, mas pode haver perda de dados.
        System.out.println(valor);
        byte b = (byte) valor;
        System.out.println(b);
        // Exemplo de casting de int para short
        valor = 65; // int -> short aceita, mas pode haver perda de dados.
        System.out.println(valor);
        short s = (short) valor;
        System.out.println(s);
        // Exemplo de casting de int para long
        valor = 65; // int -> long aceita, mas pode haver perda de dados.
        System.out.println(valor);
        long l = (long) valor;
        System.out.println(l);
        // Exemplo de casting de long para int
        l = 65; // long -> int aceita, mas pode haver perda de dados.
        System.out.println(l);
    }
}
