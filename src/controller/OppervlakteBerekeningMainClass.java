package controller;

import java.util.Scanner;

/* Dit is een applicatie die van een cirkel, een rechthoek, een vierkant en een driehoek de oppervlakte kan uitrekenen.
 * De applicatie vraagt aan de gebruiker van welke figuur de oppervlakte moet worden berekend en vraagt afhankelijk
 * van de keuze de juiste informatie op aan de gebruiker om dit te kunnen berekenen. De gebruiker kan daarna nog
 * kiezen om iets anders te berekenen of om te stoppen.
 * Mvg,
 * Danny Kwant */
public class OppervlakteBerekeningMainClass {

    // public variabelen
    public static Scanner userInput = new Scanner(System.in);
    public static double oppervlakteFiguur = 0;


    // public methods
    public static double berekenOppervlakteCirkel(int mpStraal) {
        oppervlakteFiguur = Math.PI * mpStraal * mpStraal;
        return oppervlakteFiguur;
    }

    public static double berekenOppervlakteRechthoek(int mpHoogte, int mpBreedte) {
        oppervlakteFiguur = mpHoogte * mpBreedte;
        return oppervlakteFiguur;
    }

    public static double berekenOppervlakteVierkant(int mpZijde) {
        oppervlakteFiguur = mpZijde * mpZijde;
        return oppervlakteFiguur;
    }

    public static double berekenOppervlakteDriehoek(int mpBasis, int mpHoogte) {
        oppervlakteFiguur = mpBasis * ((double) mpHoogte / 2);
        return oppervlakteFiguur;
    }

    public static void main(String[] args) {

        // variabelen
        int programmaKeuze;
        int ingevoerdeStraal;
        int ingevoerdeHoogteRechthoek;
        int ingevoerdeBreedteRechthoek;
        int ingevoerdeZijdeVierkant;
        int ingevoerdeBasisDriehoek;
        int ingevoerdeHoogteDriehoek;
        boolean wilDoorgaan = true;

        while (wilDoorgaan) {

            System.out.println("Van welke figuur wil je de oppervlakte uit laten rekenen? ");
            System.out.print("(cirkel = 1; rechthoek = 2; vierkant = 3; driehoek = 4; stoppen = 0): ");
            programmaKeuze = userInput.nextInt();
            if (programmaKeuze > 4) {

                do {

                    System.out.println("Incorrecte programmakeuze. Probeer het opnieuw.");
                    System.out.println("Van welke figuur wil je de oppervlakte uit laten rekenen? ");
                    System.out.print("(cirkel = 1; rechthoek = 2; vierkant = 3; driehoek = 4; stoppen = 0): ");
                    programmaKeuze = userInput.nextInt();

                } while (programmaKeuze > 4);
            }

            switch (programmaKeuze) {
                case 1 -> {
                    System.out.print("Wat is de straal van de cirkel in cm? ");
                    ingevoerdeStraal = userInput.nextInt();
                    berekenOppervlakteCirkel(ingevoerdeStraal);
                    System.out.println();
                    System.out.printf("De oppervlakte van jouw cirkel is: %.2f %n%n", oppervlakteFiguur);
                }
                case 2 -> {
                    System.out.print("Wat is de hoogte van je rechthoek in cm? ");
                    ingevoerdeHoogteRechthoek = userInput.nextInt();
                    System.out.print("Wat is de breedte van je rechthoek in cm? ");
                    ingevoerdeBreedteRechthoek = userInput.nextInt();
                    berekenOppervlakteRechthoek(ingevoerdeHoogteRechthoek, ingevoerdeBreedteRechthoek);
                    System.out.println();
                    System.out.printf("De oppervlakte van jouw rechthoek is: %.0f vierkante cm. %n%n", oppervlakteFiguur);
                }
                case 3 -> {
                    System.out.print("Wat is de zijde van de vierkant in cm? ");
                    ingevoerdeZijdeVierkant = userInput.nextInt();
                    berekenOppervlakteVierkant(ingevoerdeZijdeVierkant);
                    System.out.println();
                    System.out.printf("De oppervlakte van jouw vierkant is: %.0f vierkante cm. %n%n", oppervlakteFiguur);
                }
                case 4 -> {
                    System.out.print("Wat is de basis van je driehoek in cm? ");
                    ingevoerdeBasisDriehoek = userInput.nextInt();
                    System.out.print("Wat is de hoogte van je driehoek in cm? ");
                    ingevoerdeHoogteDriehoek = userInput.nextInt();
                    berekenOppervlakteDriehoek(ingevoerdeBasisDriehoek, ingevoerdeHoogteDriehoek);
                    System.out.println();
                    System.out.printf("De oppervlakte van jouw driehoek is: %.2f vierkante cm. %n%n", oppervlakteFiguur);
                }
                default -> {
                    System.out.println("Het programma wordt beëindigd.");
                    wilDoorgaan = false;
                }
            }
        }
    }
}
