package compararExpressoes;

import java.util.ArrayList;
import java.util.List;

public class CompararExpressoes {

    public static void main(String[] args) {

        int a = 3, b = 7, c = 4;
        List<Boolean> booleanos = new ArrayList<>(5);

        booleanos.add((a + c) > b);
        booleanos.add(b >= (a + 2));
        booleanos.add(c == (b-a));
        booleanos.add((b+a) <=c);
        booleanos.add((c+a) > b);

        System.out.println(booleanos);

    }
}

