package it.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class InputTest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Random rand = new Random();
        // int randomNumber = rand.nextInt(10);

        // System.out.println("Inserisci un numero intero e premi invio...");

        // String userNumber = input.nextLine();
        // System.out.println("Hai inserito il numero intero: " + userNumber );
        // // System.out.println("E' stato generato il numero " + randomNumber );
        
        // String word = input.nextLine();
        // System.out.println("Hai scritto: " + word);

        // int sum = randomNumber + userNumber;
        // System.out.println("La somma tra i due numeri e': " + sum );

        System.out.println("Scrivi la prima parola e premi invio...");
        String firstWord = input.nextLine();

        System.out.println("Scrivi la seconda parola e premi invio...");
        String secondWord = input.nextLine();

        System.out.println(firstWord.toUpperCase() + " " + secondWord.toUpperCase());

        input.close();
    }
}
