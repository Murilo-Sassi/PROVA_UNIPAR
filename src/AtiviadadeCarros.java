import java.util.Scanner;

public class AtiviadadeCarros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
        String[] nomes  = new String[10];

        int [] valores = new int [10];

        System.out.println("Quantidade de Carros");

        for (int i = 0; i < 5; i++) {
            valores[1] = sc.nextInt();

            System.out.println ("Nome do Carro" + i );

        }

        Scanner avaliar = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Insira um numero: ");
        numeros[0] = sc.nextInt();
        System.out.println("Insira um numero: ");
        numeros[1] = sc.nextInt();
        System.out.println("Insira um numero: ");
        numeros[2] = sc.nextInt();


        System.out.println("valor 1: " + numeros[0]);
        System.out.println("valor 2: " + numeros[1]);
        System.out.println("valor 3: " + numeros[2]);

        int nota = 0;
        for (int i = 1; i <= 10; i++) {
            nota += i;
        }
        System.out.println(" Avaliado " + nota);

        if ( nota >= 6 && nota <=10 ) {
            System.out.println("Carro bom ");
        } else if (nota >6 ) {
            System.out.println("Carro ruim ");
        }
        else if (nota >11){
        System.out.println("Invalido");
        }

        double media = (numeros[0] + numeros[1] + numeros[2]) / 3.0;
        System.out.println(" Nota do carro " + media);


    }
}
