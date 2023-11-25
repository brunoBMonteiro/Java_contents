package tiposprimitivos;

public class Aula01TiposPrimitivos {
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
    }
}
