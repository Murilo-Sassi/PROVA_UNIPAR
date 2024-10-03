import java.util.Scanner;

public class AtiviadeVotacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
        int votar = 0;
        int num = 0;
        int opcao = 0;
        int votosTaffe = 0;
        int votosRodrigo = 0;
        int votosLucas = 0;
        int votosAlessandro = 0;

        System.out.println("informe quantos votos");
        num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            votar = 0;
            do {


                System.out.println("80 taffe");
                System.out.println("70 rodrigo");
                System.out.println("60 lucas");
                System.out.println("50 alessandro");
                votar = scanner.nextInt();


            } while (votar != 80 && votar != 70 && votar != 60 && votar != 50);

            if (votar == 80) {
                votosTaffe++;
            } else if (votar == 70) {
                votosRodrigo++;
            } else if (votar == 60) {
                votosLucas++;
            } else if (votar == 50) {
                votosAlessandro++;
            }


        }


        if (votosTaffe > votosRodrigo && votosTaffe > votosAlessandro && votosTaffe > votosLucas) {
            System.out.println("Taffe");
        }

        if (votosRodrigo > votosTaffe && votosRodrigo > votosAlessandro && votosRodrigo > votosLucas ) {
            System.out.println("Rodrigo");
        }

        if (votosLucas > votosRodrigo && votosLucas > votosAlessandro && votosLucas > votosTaffe) {
            System.out.println("Lucas");
        }

        if (votosAlessandro > votosRodrigo && votosAlessandro > votosTaffe && votosAlessandro > votosLucas) {
            System.out.println("Alessandro");
        }
    }
}


