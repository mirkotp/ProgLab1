﻿Questo repository contiene gli esercizi svolti in laboratorio.   
Gli esercizi fanno largo uso della libreria Prog, illustrata nel libro:

__Dai fondamenti agli oggetti. Corso di programmazione Java__ (Quarta Edizione)   
_G. Pizzighini, M.Ferrari_   
Pearson

## [Es01 - Somma](./src/Es01)

Scrivete un'applicazione che letti due numeri interi ne calcoli la somma e la visualizzi.

## [Es02 - ConvertiStringa](./src/Es02)

Scrivete un'applicazione che, letta una stringa alfanumerica, converta i caratteri alfabetici in posizione pari in stampatello minuscolo e quelli in posizione dispari in stampatello maiuscolo.

## [Es03 - SoluzioniParabola](./src/Es03)

Scrivete un'applicazione per la soluzione delle equazioni di secondo grado.

Il programma deve prendere in ingresso il valore dei coefficienti a, b e c e risolvere l'equazione derivando i valori di x.

## [Es04 - Prime](./src/Es04)

Scrivete un'applicazione che preso in ingresso un numero intero positivo indichi se tale numero è primo.

## [Es05 - Frazioni](./src/Es05)

Scrivete un'applicazione che, letta una sequenza di frazioni, determini la somma della sequenza e la frazione minore e la frazione maggiore che compaiono nella sequenza, e le stampi sul monitor.

## [Es06 - FrazioneEsponente](./src/Es06)

Scrivete un'applicazione che legga una frazione e un esponente (numero intero) e calcoli la frazione ottenuta elevando la frazione data all'esponente.
Ad esempio, se viene letta la frazione 2/3 e l'esponente è 3, il risultato dovrà essere la frazione 8/27, se invece viene letta la frazione 2/3 e l'esponente è -3, il risultato dovrà essere la frazione 27/8.

## [Es07 - NumeroArmonico](./src/Es07)

Il numero armonico di ordine n, indicato con H(n), è la somma parziale n-esima della serie armonica.

Scrivete un'applicazione che letto un intero n >= 1 calcoli e visualizzi il valore di H(n) come frazione e come double.

## [Es08 - EstraiCifre](./src/Es08)

Scrivete un'applicazione che preso in ingresso un numero intero positivo indichi se tale numero è primo.

## [Es09 - EstraiCifre2](./src/Es09)

Estendete l'applicazione dell'esercizio precedente in modo che comunichi anche il nome della cifra in lettere.

## [Es10 - EstraiCifreInvertito](./src/Es10)

Scrivete un'applicazione che, letto un numero intero comunichi se il numero è negativo o positivo e visualizzi su linee separate le cifre che lo compongono dalla PIU' significativa alla MENO significativa.

(Insomma, come l'8 ma con l'output invertito.)

## [Es11 - String2Int](./src/Es11)

Scrivete un'applicazione che letta una stringa che rappresenta un numero intero, lo converta nell'int corrispondente e ne visualizzi il valore.

__Formato input:__
* sequenza di cifre
* eventualmente preceduta da + o -
* eventualmente con spazi all'inizio e alla fine

## [Es12 - String2Int2](./src/Es12)

Per scrivere una versione compatta e più elegante, sfruttate i seguenti metodi della classe Character:

* __public static boolean isDigit(char ch)__   
Restituisce true se e solo se il char specificato come argomento è un digit.

* __public static int getNumericValue(char ch)__   
Restituisce il valore int corrispondente al carattere Unicode fornito come
argomento. Se ch è un digit restituisce il valore del digit.

## [Es13 - Occorrenze](./src/Es13)

Scrivere un'applicazione che letta una stringa s derivi il numero di occorrenze di ciascuna lettera in s.   
Utilizzare un array di lunghezza pari all'alfabeto occidentale.

## [Es14 - ArrayRandomPositivi](./src/Es14)

Scrivete un'applicazione che generi un array di interi pseudocasuali e lo visualizzi a video. La dimensione dell'array e il valore massimo dei valori da generare devono essere forniti come input dall'utente.

## [Es15 - ArrayRandom](./src/Es15)

Modiﬁcate l'applicazione precedente in modo che le posizioni dell'array siano riempite con valori interi pseudo-casuali positivi e negativi con valore assoluto minore di un valore speciﬁcato dall'utente.

## [Es16 - SommaVettori](./src/Es16)

Scrivete un'applicazione che, generati due array contenenti valori pseudocasuali interi compresi tra -100 e 100 con dimensione stabilita dall'utente, stampi tali array e la loro somma.

La dimensione dell'array deve esser fornita come argomento sulla linea di comando.

