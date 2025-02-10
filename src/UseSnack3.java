import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UseSnack3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        RegistroStudenti studenti = new RegistroStudenti(); 
        ArrayList<String> registroStudenti = new ArrayList<String>();
        System.out.println("Inserisci il nome dello studente");
        while(scan.hasNextLine()){      
            String nome = scan.next();
        
            System.out.println("Inserisci il cognome dello studente");
            String cognome = scan.next();
        
            System.out.println("Inserisci l'età dello studente");
            int eta = scan.nextInt();

            Studente studente = new Studente(nome, cognome, eta);
            String datiStudente = studente.getStringaConcat(nome, cognome, eta);
            studenti.setStudente(datiStudente);
            studenti.addStudent(studenti.getStudente(), registroStudenti);
            System.out.println(Arrays.asList(studenti.getArrStudent()));
            System.out.println("Inserisci il nome di un nuovo studente");
        }
    }
}
