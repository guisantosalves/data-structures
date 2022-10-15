package stackAlgorithm;

public class mainApplication {
    Stack myFirstStack = new Stack(6);
        
//        String texto = "{[()]}";
//
//        for(int i=0;i {
//        String letra = texto.charAt(i)+"";
//
//        # if abrir
//        myFirstStack.push(letra);
//
//        # if fechar
//        verifica o pop
//
//        System.out.println(letra);
//        }
        
        String text = "{[()]}";
        
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == '{' || text.charAt(i) == '(' || text.charAt(i) == '['){
                
                myFirstStack.push(text.charAt(i)+"");
                
            }else{
                
               if(text.charAt(i) == '}' || text.charAt(i) == ')' || text.charAt(i) == ']'){

                     String removedToVerify = myFirstStack.pop();
                     if(text.charAt(i)+"" == removedToVerify){
                         System.out.println("ok");
                     }else{
                         continue;
                     }
                   
               }
               
            }
        }
        
        if(myFirstStack.isEmpty()){
            System.out.println("Está correto");
        }else {
            System.out.println("Não está correto");
        }
        System.out.println();
        // System.out.println(Arrays.toString(myFirstStack.arr));
}
