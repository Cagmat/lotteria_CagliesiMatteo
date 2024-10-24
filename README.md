# Lotteria Multithread

## Descrizione

Questo progetto simula una lotteria multithread utilizzando tre classi principali: `Estrazione`, `Giocatore` e `Lotteria`. Ogni giocatore sceglie un numero casuale e verifica se il numero corrisponde a uno dei numeri estratti casualmente da un'istanza della classe `Estrazione`.

Il programma utilizza il concetto di multithreading per simulare l'estrazione simultanea e la partecipazione di più giocatori.

## Struttura del Progetto

### Classi Principali

1. **Estrazione**: Rappresenta l'estrazione casuale dei numeri della lotteria. Contiene una matrice di numeri casuali e metodi per visualizzare i numeri estratti e per verificare se un giocatore ha vinto.

   - Costruttore: Inizializza una matrice di numeri casuali.
   - Metodi principali:
     - `stampaMatrice()`: Stampa la matrice dei numeri estratti.
     - `verifica(int numero, int idGiocatore)`: Verifica se il numero scelto da un giocatore è presente nella matrice.
     - `stampaVincitori()`: Stampa i vincitori dell'estrazione.
     - `run()`: Esegue il thread associato all'estrazione dei numeri.

2. **Giocatore**: Ogni istanza di questa classe rappresenta un giocatore che sceglie un numero casuale e lo confronta con i numeri estratti dall'oggetto `Estrazione`.

   - Costruttore: Inizializza un giocatore con un ID, un nome e un riferimento all'oggetto `Estrazione`.
   - Metodi principali:
     - `run()`: Esegue il thread del giocatore, sceglie un numero casuale e lo verifica con l'estrazione.

3. **Lotteria**: È la classe principale che avvia il gioco, creando il thread dell'estrazione e i thread dei giocatori. Gestisce anche la sincronizzazione dei thread tramite l'uso del metodo `join()`.

   - `main()`: Avvia l'estrazione e la partecipazione di più giocatori alla lotteria.

## Esecuzione del Progetto

Per eseguire il progetto, è necessario un ambiente Java con supporto multithreading. Ecco i passi principali:

1. **Compilare il progetto**: Compila tutte e tre le classi (`Estrazione`, `Giocatore`, `Lotteria`).
2. **Avvio del gioco**: Esegui la classe `Lotteria` che farà partire l'estrazione e i giocatori.
3. **Osservare i risultati**: La classe `Lotteria` gestirà l'interazione tra i thread, e i giocatori verranno avvisati se hanno vinto o perso.

### Requisiti

- **Java 8 o superiore**: È necessario per supportare le funzionalità di multithreading.
- **Ambiente di sviluppo Java**: Consigliato l'uso di IntelliJ IDEA, Eclipse o NetBeans.

## Funzionamento del Programma

- L'oggetto `Estrazione` genera una matrice casuale di numeri (valori compresi tra 0 e 99).
- Ogni oggetto `Giocatore` sceglie un numero casuale e lo verifica nella matrice.
- La classe `Lotteria` coordina tutto il flusso del gioco, creando thread per ciascun giocatore e per l'estrazione.

## Esempio di Output