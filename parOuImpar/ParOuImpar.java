package parOuImpar;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero");
        numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero impar");
        }
        
        sc.close();
    }
}
