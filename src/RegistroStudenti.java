/*
Snack 3: Registro Studenti*
Crea una classe RegistroStudenti che rappresenti un registro di studenti. Utilizza un array privato per memorizzare oggetti Studente. 
Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro. 
Aggiungi un metodo che stampi la lista degli studenti.
*/

import java.util.ArrayList;

public class RegistroStudenti {

    private ArrayList<String> arrStudent;

    private String studente;

    private int counter = 1;

    public RegistroStudenti(){

    }

    public ArrayList<String> getArrStudent() {
        return arrStudent;
    }

    public void setArrStudent(ArrayList<String> arrStudent) {
        this.arrStudent = arrStudent;
    }

    public String getStudente() {
        return studente;
    }

    public void setStudente(String studente) {
        this.studente = studente;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void addStudent(String studente, ArrayList<String> arrStudent){
        this.studente = studente;
        this.arrStudent = arrStudent;
        arrStudent.add(studente);
    }

}
