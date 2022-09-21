package OO;
import java.util.Scanner;

public class mainApplication {
        
    public static void main(String[] args){
        System.out.println("digite seu tipo de conta:\n 1 - corrente \n 2 - poupanca");
        Scanner resFromUser = new Scanner(System.in);
        int choosed = resFromUser.nextInt();
        
        System.out.println("nome cliente: ");
        Scanner name = new Scanner(System.in);
        String theName = name.nextLine();
        
        if(choosed == 1){
            
           Conta minhaConta = new Conta("1234568", "corrente", theName);
           
           System.out.println("Deseja abrir conta ?: 1 - S /2 - N");
           Scanner wish = new Scanner(System.in);
           int wished = wish.nextInt();
          
           if(wished == 1){
               minhaConta.abrirConta(minhaConta.getNumeroConta(), minhaConta.getTipoConta(), minhaConta.getNomeCliente());
               
               if(minhaConta.getTipoConta() == "corrente"){
                   minhaConta.setAtivo(true);
                   minhaConta.setSaldoConta(100);
               }
               
               minhaConta.mostrarStatus();
               
           }
                      
        }else if(resFromUser.nextInt() == 2){
            Conta minhaConta = new Conta("1234568", "poupanca", name.nextLine());
            System.out.println("Deseja abrir conta ?: S/N");
            Scanner wish = new Scanner(System.in);

            if(wish.next() == "S"){
                minhaConta.abrirConta(minhaConta.getNumeroConta(), minhaConta.getTipoConta(), minhaConta.getNomeCliente());
                if(minhaConta.getTipoConta() == "corrente"){
                    minhaConta.setAtivo(true);
                    minhaConta.setSaldoConta(100);
                }
            }else{
                System.out.println("ok");
            }
        }else{
            throw new Error("insira valores válidos");
        }
       

        
    }
    
}
