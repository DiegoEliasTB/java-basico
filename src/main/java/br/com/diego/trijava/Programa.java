package br.com.diego.trijava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Programa {
    // [[ijij][rdrdrdr]]
    public static void main(String[] args) {

        //String[] args = { "add", "20", "1", "8" };
        System.out.println("Iniciado");
        if (Objects.nonNull(args) && args.length > 0) {
            
            if ("soma".equals(args[0])) {
                soma(args);
            } else if ("add".equals(args[0])) {
                adicionaLista(args);
            } else if ("explicação".equals(args[0])) {
                explicacao(args);
            } else {
                printaValores(args);
            }
        } else {
            System.out.println("Em args tem menos que 1");
        }
    }

    private static void soma(String[] args) {
        Integer soma = 0;
        for (int i = 1; i < args.length; i++) { // i = i + 1
            soma += Integer.valueOf(args[i]);
        }
        System.out.println("O resultado da soma e: " + soma);
    }

    private static void printaValores(String[] args) {
        for (String item : args) { // trasforme para metodo
            System.out.println("voce informou: " + item);
        } 
    }

    private static void adicionaLista(String[] args) {
        List<String> compras = new ArrayList<>();
        Integer i = 1;
        while (i < args.length) {
            compras.add(args[i]);
            ++i; // explicar 
        }
        System.out.println(Arrays.toString(compras.toArray()));
    }

    private static void explicacao(String[] args) {
        Integer i = 0;
        //Operação com i++ acrescenta o valor posterior ao comando
        //Operação com ++i acrescenta o valor na mesma linha de comando
        
        System.out.println("i = 0 ");
        System.out.println("i++ = " + i++);
        System.out.println("i = " + i);

        i = 0;
        System.out.println("\ni = 0 ");
        System.out.println("++i = " + ++i);
        System.out.println("i = " + i);
    }
}