package OO;

public class Conta {
    private String numeroConta;
    private String tipoConta;
    private String nomeCliente;
    private double saldoConta = 0;
    private boolean ativo = false;
    
    // construtores
    public Conta(String numeroConta, String tipoConta, String nomeCliente){
        this.setNumeroConta(numeroConta);
        this.setTipoConta(tipoConta);
        this.setNomeCliente(nomeCliente);
    }
    
    // getters and setters
    public String getNumeroConta(){
        return this.numeroConta;
    }
    
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    
    public String getTipoConta(){
        return this.tipoConta;
    }
    
    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
    
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    public double getSaldoConta(){
        return this.saldoConta;
    }
    
    public void setSaldoConta(double saldoConta){
        this.saldoConta = saldoConta;
    }
    
    public boolean getAtivo(){
        return this.ativo;
    }
    
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
    
    // métodos
    public void abrirConta(String numeroConta, String tipoConta, String nomeCliente){
        //Scanner resFromUser = new Scanner(System.in);
        if(tipoConta == "corrente"){
            
           this.setSaldoConta(100);
           this.setNumeroConta(numeroConta);
           this.setTipoConta("corrente");
           this.setNomeCliente(nomeCliente);
           this.setAtivo(true);
           
        }else if(tipoConta == "poupanca"){
            
           this.setSaldoConta(150);
           this.setNumeroConta(numeroConta);
           this.setTipoConta("poupanca");
           this.setNomeCliente(nomeCliente);
           this.setAtivo(true);
           
        }else{
            
            throw new Error("precisa informar um valor válido");
            
        }
    }
    
    public void fecharConta(){
        if(this.getSaldoConta() > 0 ){
            this.setAtivo(false);
        }
    }
    
    public void depositarDinheiro(double value){
        // soma oq ja tem com o value
        this.setSaldoConta(this.getSaldoConta() + value);
    }
    
    public void sacarDinheiro(double value){
        if(value > 0 && value < this.saldoConta){
            
           this.setSaldoConta(this.getSaldoConta() - value);
           
        }else{
            
            throw new Error("insira valores válidos por favor");
            
        }
    }
    
    public void pagarManutencaoConta(){
        if(this.tipoConta == "corrente"){
            this.setSaldoConta(this.getSaldoConta() - 13);
        }else{
            this.setSaldoConta(this.getSaldoConta() - 22);
        }
    }
    
    public void mostrarStatus(){
        System.out.print((this.ativo == true) ? "A conta "+this.getNumeroConta()+" pertencente ao cliente "+
        this.nomeCliente+". seu saldo é de: "+this.getSaldoConta()+" sua tipificação de conta é: "
        +this.getTipoConta()+", sua conta está ativa: sim" : "A conta "+this.getNumeroConta()+" pertencente ao cliente "+
        this.nomeCliente+". seu saldo é de: "+this.getSaldoConta()+" sua tipificação de conta é: "
        +this.getTipoConta()+", sua conta está ativa: nao");
        
    }
}
