import java.util.Scanner;

public class UseSnack1 {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Inserisci il nome dello studente");
            String nome = scan.next();
        
            System.out.println("Inserisci il cognome dello studente");
            String cognome = scan.next();
        
            System.out.println("Inserisci l'età dello studente");
            int eta = scan.nextInt();
            Studente studente = new Studente(nome, cognome, eta);

            if(studente.getError(nome, cognome, eta) == true){
                System.out.println(studente.getStringaConcat(nome, cognome, eta));
            }
            scan.close();
           }catch(Exception e){
            System.out.println("I dati inseriti non sono corretti "+e);
            }
        }
}
