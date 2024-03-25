package pesoIdeal;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String genero, altura;
        Double pesoIdeal;

        System.out.println("Digite seu genero. Masculino ou Feminino");
        genero = sc.nextLine();

        System.out.println("Digite sua altura");
        altura = sc.nextLine().replace(',','.');


        switch (genero.toLowerCase().charAt(0)) {
            case 'm':
                pesoIdeal = (72.7 * Double.parseDouble(altura) - 58);
                System.out.println("Seu peso ideal e " + String.format("%.3f", pesoIdeal));
                break;
            case 'f':
                pesoIdeal = (62.1 * Double.parseDouble(altura) - 44.7);
                System.out.println("Seu peso ideal e " + String.format("%.1f", pesoIdeal));
                break;
            default:
                System.out.println("Opção inválida. Apenas masculino e feminino.");
                break;
        }

        sc.close();
    }
}
