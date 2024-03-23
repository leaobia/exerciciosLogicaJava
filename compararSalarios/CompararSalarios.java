import java.util.ArrayList;
import java.util.List;

public class CompararSalarios{
    public static void main(String[] args){

        double salario = 0.0;
        double ir = -10.0;
        double salliq = 10.0;
        double contadorAuxiliarDoIr = 10.0;
        double contadorAuxiliarDoSalliq = 90.0;
        int contador = 0;
        List<Boolean> booleanos = new ArrayList<>(3);
        

        while (contador < 3) {

            if (contador >= 2) {
                contadorAuxiliarDoIr = contadorAuxiliarDoIr / 2; 
                contadorAuxiliarDoSalliq = contadorAuxiliarDoSalliq + 5;
            }

            salario = salario + 100;
            ir = ir + contadorAuxiliarDoIr;
            salliq = salliq + contadorAuxiliarDoSalliq;
        
            if(contador == 0){
                booleanos.add(salliq >= 100.0);
            }else if(contador == 1){
                booleanos.add(salliq < 190.0);
            }else{
                booleanos.add(salliq == salario - ir);
            }

            contador++;
        }

        System.out.println(booleanos);
    }
}