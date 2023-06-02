//Esercizio 2: FizzBuzz
//        Consegna: Scrivi un programma che stampi i numeri da 1 a 100, ma per i multipli di 3 stampi “Fizz”
//        al posto del numero e per i multipli di 5 stampi “Buzz”. Per i numeri che sono sia multipli di 3 che di
//        5 stampi “FizzBuzz”.
//        Esempio: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz……
//        Bonus: invece che 100, chiedere all’utente quanti numeri vuole stampare (il valore
//        inserito dall’utente deve essere maggiore di 0 e minore di 1000)

package org.lessons.java;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {

//        chiedo un numero di caselle all'utente

        Scanner Scanner = new Scanner(System.in);
        System.out.println("quante caselle vuoi?");
        int numeroCaselleUtente = Scanner.nextInt();

//    aggiunto il bonus creo una condizione per la quale se il numero e' minore di 0 o maggiore di 1000 non entra nel ciclo
//    ciclo mettendo come limite il numero scelto dall'utente' creo una serie di condizioni per le quali se i resto numero(3-5-multiplo di entrambi) == 0 stampo cio' che e' richiesto dalla traccia
try{
    if (numeroCaselleUtente > 0 && numeroCaselleUtente < 1000){
        for (int i = 1; i < numeroCaselleUtente; i++) {
            if (i % 5 == 0 && i % 3 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }}else{
        System.out.println("Il numero scelto non e' valido");
    }
}catch(Exception e){
    System.out.println("Ti ho chiesto un numero da 1 a 999 non penso sia difficile!");
}finally{
    System.out.println("e' stato eseguito tutto il codice");
}}


//    ponderare refactoring con il ciclo for partente da (int i = 1) tanto non sto ciclando un array mannaggia a me

}

