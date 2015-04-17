# Notes

* interfaccia con metodo di default di differenzia con una classe astratta perché:
  * la classe astratta può avere un costruttore implementato e potrebbe lanciare un'eccezione 
  * un'interfaccia ha NON uno stato mentre una classe atratta può. 
  
  
## Domanda: 

anche nell'OOP la Classe Cat dovrebbe mantenere uno stato. Forse nel caso OO occorrerebbe ritornare da eat la classe FullCat


## Diamond problem: 
* il metodo della classe concreta vince sempre
* altrimenti vince quello più vicino
* se sono tutti equidistanti sono costretto dal compilatore e ridefinire il metodo.
 
# Pattern Funzionali

Guardare le API per vedere quali sono i nuovi metodi a disposizione ed imparare da questi. 

## Loan Pattern
## Conditional Deferred Execution
    invece di passare un messaggio generato da qualche cosa di pesante 
    compuzionalmente passo una funzione che viene lanciata solo se necessario
    attenzione che comunque esiste l'allocazione dell'oggetto funzione cpome costo
    quando passo i parametri 
    
# Monadi:
- validation
- transaction
- stream 
- optional

# CompletableFuture 
Vengono reati come negli streams tanti thread quanti sono i processori (come forkjoin). 
Ma attenzione che posso passargli un executor al completablefuture con più thread di 
quanti ne ho nel processore. 