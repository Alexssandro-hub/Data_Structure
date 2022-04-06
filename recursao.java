package javaapplication1;

public class JavaApplication1 {
    
    public static void main(String[] args) {
      //System.out.println(binaryConvert(7));
      //System.out.println(countNumber(10));
      System.out.println(countFibonnaciTerm(9));
    }
    
    public static int binaryConvert(int num){
        //tratamento de caso base.
        if(num == 0){
            return 0;
        }
        else if (num == 1){ 
            return 1;
        }
        //Regra de conversao de base(10) para base(2).
        else{
            return (num % 2 + 10 * binaryConvert(num/2));
        }
    } 
    
    public static int countNumber(int num){
        //tratamento de caso base.
        if(num == 0){
            return 1;
        }
        //Regra de contagem de numeros pares
        else{
            return 1 + countNumber(num / 2);
        }
    }
    
    public static int countFibonnaciTerm(int num){
        //Tratamento de caso base.
        if(num <= 1){ 
            return 1;
        }
        //Regra de contagem de termos da sequencia de fibonnaci 
        else{
            return countFibonnaciTerm(num-1) + countFibonnaciTerm(num-2);
        }
    }    
}
