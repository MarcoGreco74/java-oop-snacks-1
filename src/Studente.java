/*
*Snack 1: Studente*
Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. Implementa un costruttore che accetta tre parametri 
per inizializzare questi attributi. Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni).
*/

public class Studente {
    private String nome;
    private String cognome;
    private int eta;

    public Studente(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        getError(nome, cognome, eta);
    }

    public String getStringaConcat(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        String strConcat = nome+" "+cognome+", "+eta+" anni";
        return strConcat;
    }

    public boolean getError(String nome, String cognome, int eta){
        if(nome != null && cognome != null && eta != 0){
            this.nome = nome;
            this.cognome = cognome;
            this.eta = eta;
            return true;
        }else{
            System.out.println("Dati non corretti");
            return false;
        }
    }
}
