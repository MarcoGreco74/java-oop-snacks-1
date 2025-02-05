/*
Snack 2: Gestione di un Conto*
Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un costruttore che accetta il numero di conto 
e inizializza il saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.
*/

public class ContoBancario {
    
    private String conto;
    private float saldo;

    public ContoBancario(String conto, float saldo){
        this.conto = conto;
        conto = generaConto();
        this.saldo = saldo;
    }

    public String generaConto(){
        int numConto = (int)(Math.random()*1000000);
        String nuovoconto = "IT"+numConto;
        return nuovoconto;
    }

    public float deposito(float deposito){ 
        saldo = saldo+deposito;
        return deposito;
    }

    public float prelievo(float prelievo){
        saldo = saldo-prelievo;
        return prelievo;
    }

    public float getSaldo(){
        return saldo;
    }
}
