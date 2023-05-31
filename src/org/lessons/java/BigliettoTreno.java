//Esercizio 1: Calcolo biglietto del treno
//        Consegna: Il programma dovrà chiedere all’utente il numero (intero) di chilometri che vuole percorrere
//        e l’età del passeggero (numero intero). Sulla base di queste informazioni dovrà calcolare il prezzo
//        totale del viaggio, secondo queste regole:
//        il prezzo del biglietto è definito in base ai km (0.21 € al km)
//        va applicato uno sconto del 20% per i minorenni
//        va applicato uno sconto del 40% per gli over 65
//        Per chiedere informazioni all’utente sarà necessario usare la classe java.util.Scanner, come visto in
//        classe stamattina.
//        Bonus: formattare il risultato con un numero limitato di decimali utilizzando la classe DecimalFormat

        package org.lessons.java;
        import java.util.Scanner;
        import java.text.DecimalFormat;

public class BigliettoTreno {
        public static void main(String[] args) {

//               stabilisco le variabili di prezzo/km e scontistiche
                double prezzoAlChilometro = 0.21;
                double scontoSenior = 0.60;
                double scontoJunior = 0.80;

                //chiedo eta' e chilometri da percorrere dopo aver importato scanner

                Scanner Scanner = new Scanner(System.in);

                System.out.println("Quanti chilometri devi percorrere?");
                int kmPasseggero = Scanner.nextInt();

                System.out.println("Quanti anni hai?");
                int anniPasseggero = Scanner.nextInt();

//                se ho piu di 65 applico al prezzo base lo sconto e idem se ne ho meno di 18

                double prezzo = kmPasseggero * prezzoAlChilometro;
                if (anniPasseggero > 65) {
                        prezzo = prezzo * scontoSenior;
                } else if(anniPasseggero < 18) {
                        prezzo = prezzo * scontoJunior;
                }

                String prezzoFinale = new DecimalFormat("######.##").format(prezzo);
                System.out.println("Il prezzo sara' di " + prezzoFinale + "€ per la tua  tratta " );









        }









}
