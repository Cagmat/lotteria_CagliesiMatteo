/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;

/**
 *
 * @author monica ciuchetti
 */
public class Estrazione extends Thread {
    // attributi
    private int[][] numeri = new int[10][10];
    private int numero;
    int[] vincitori = new int[3];
    private int numeroVincitori;
    private Random random = new Random();
    /**
     * 
     * Metodo costruttore
     */
    public Estrazione() {    
        
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                numeri[i][j] = random.nextInt(0,1000);
                
            }
        }
        // stampa matrice dei numeri estratti
    }

    /**
     *
     * Metodo per visualizzare la matrice dei numeri estratti
     */
    public void stampaMatrice() {
        // stampa matrice dei numeri estratti
    }
    
    /**
    * 
    * Metodo per visualizzare i vincitori dell'estrazione
    */
    public void stampaVincitori() {
        // stampa array dei vincitori
        }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    */
    public void verifica(int numero, int idGiocatore) {
       for(int i = 0; i<10; i++){
           for(int j=0; j<10; j++){
               if(numero==numeri[i][j]){
                    System.out.println("Giocatore " + idGiocatore + " hai scelto il numero " + numero + " e hai vinto!");
                    return;
               }
            }
        }
        System.out.println("Giocatore " + idGiocatore + " hai perso!");

    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        // stampa iniziale
        System.out.println("INIZIO ESTRAZIONE!");
        
        // estrazione dei numeri
        // stampa matrice
        // stampa finale    
        System.out.println("FINE ESTRAZIONE!");
    }
}


