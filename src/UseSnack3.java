import java.util.Arrays;
import java.util.Scanner;

public class UseSnack3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        RegistroStudenti studenti = new RegistroStudenti(); 
        
        System.out.println("Inserisci il nome dello studente");
        while(scan.hasNextLine()){      
            String nome = scan.next();
        
            System.out.println("Inserisci il cognome dello studente");
            String cognome = scan.next();
        
            System.out.println("Inserisci l'età dello studente");
            int eta = scan.nextInt();

            Studente studente = new Studente(nome, cognome, eta);
            String datiStudente = studente.getStringaConcat(nome, cognome, eta);
            String[] stud = studenti.addStudent(datiStudente);
            System.out.println(Arrays.toString(stud));
            System.out.println("Inserisci il nome di un nuovo studente");
        }
    }
}
