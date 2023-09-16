package com.lerson.application;

import com.lerson.exceptions.ParametrosInvalidosException;

import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        scan.nextLine();
        int num2 = scan.nextInt();
        scan.nextLine();

        if (num1 > num2)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int count = num2 - num1 + 1;
        for (int i = 1; i < count; i++) {
            System.out.println(String.format(
                    "Imprimindo o número %d",
                    i
            ));
        }
        scan.close();
    }
}
