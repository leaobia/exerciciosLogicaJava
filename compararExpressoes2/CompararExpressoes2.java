package compararExpressoes2;

import java.util.ArrayList;
import java.util.List;

public class CompararExpressoes2 {
     public static void main(String[] args) {

        int a = 5, b = 4, c = 3, d=6;
        List<Boolean> booleanos = new ArrayList<>(3);

        booleanos.add((a>c) && (c<=d));
        booleanos.add(((a+b) > 10 )|| (a + b) == (c+d));
        booleanos.add((a>=c) && (d>=c));

        System.out.println(booleanos);

    }
}
