/*
Snack 3: Registro Studenti*
Crea una classe RegistroStudenti che rappresenti un registro di studenti. Utilizza un array privato per memorizzare oggetti Studente. 
Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro. 
Aggiungi un metodo che stampi la lista degli studenti.
*/

public class RegistroStudenti {

    private String[] arrStudent;

    private String studente;

    private int counter = 1;

    public RegistroStudenti(){
        getArrstudent();
    }
    
    public String[] getArrstudent(){
        this.arrStudent = new String[counter];
        return this.arrStudent;
    }

    public String getStudente(){
        return this.studente;
    }

    public String[] addStudent(String studente){
        getStudente();
        this.counter++;
        for(int i = 0; i < arrStudent.length; i++){
            this.arrStudent[i] = studente;
        }
        return arrStudent;
    }

}
