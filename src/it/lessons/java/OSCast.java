package it.lessons.java;

import java.util.Scanner;

public class OSCast {
    public static void main(String[] args) {
        int linuxUsers;
        int macUsers;
        int winUsers;
        
        Scanner input = new Scanner(System.in); // !!!!
        
        System.out.println("Inserisci il numero di studenti che usano linux e premi invio...");
        linuxUsers = Integer.parseInt(input.nextLine());
        System.out.println("Inserisci il numero di studenti che usano macOs e premi invio...");
        macUsers = Integer.parseInt(input.nextLine());
        System.out.println("Inserisci il numero di studenti che usano Windows e premi invio...");
        winUsers = Integer.parseInt(input.nextLine());

        int usersNumber = linuxUsers + macUsers + winUsers;

        // System.out.println(usersNumber);
        // " macUsers * 100.0 / usersNumber
    
        double macPercentage = macUsers * 100.0 / usersNumber;
        System.out.println("La percentuale di studenti che seguono la lezione BEPT4 che usa MacOs e': " + macPercentage + "%");

        double winPercentage = winUsers * 100.0 / usersNumber;
        System.out.println("La percentuale di studenti che seguono la lezione BEPT4 che usa Windows e': " + winPercentage + "%");

        double linuxPercentage = linuxUsers * 100.0 / usersNumber;
        System.out.println("La percentuale di studenti che seguono la lezione BEPT4 che usa Linux e': " + linuxPercentage + "%");

        input.close();
    }
}
