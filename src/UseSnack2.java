import java.util.Scanner;

public class UseSnack2 {
    public static void main(String[] args) throws Exception {             
        System.out.println("Che operazione vuoi fare?");
        ContoBancario movimenti = new ContoBancario("", 0);
        String conto = movimenti.generaConto(); 
        Scanner scan = new Scanner(System.in);       
        try {
            while(scan.hasNextLine()){
            String operazione = scan.next();
            if(operazione.equals("Prelievo")){              
                float prel = scan.nextFloat();
                if(movimenti.getSaldo() >= prel){
                    movimenti.prelievo(prel);
                    System.out.println("Il saldo è "+movimenti.getSaldo()+", sul conto numero "+conto);
                    System.out.println("Che operazione vuoi fare?");
                }else{
                    System.out.println("Prelievo non consentito");
                }
            }
            else if( operazione.equals("Deposito") ){              
                float dep = scan.nextFloat();
                movimenti.deposito(dep);
                System.out.println("Il saldo è "+movimenti.getSaldo()+", sul conto numero "+conto);
                System.out.println("Che operazione vuoi fare?");
            }
            else if (operazione.equals("Chiudi")){
                scan.close();
            }else{
                System.out.println("Operazione non riconosciuta");
            }
        }
        }catch(Exception e){
            System.out.println("I dati inseriti non sono corretti "+e);          
        }
        System.out.println("Che operazione vuoi fare?");                    
    }
}
