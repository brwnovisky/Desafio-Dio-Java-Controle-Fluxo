package control;

import java.util.Scanner;
import exceptions.InvalidParamsException;

public class Counter {
    int first;
    int second;
    
    public void getParameters(){
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro");
        first = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        second = terminal.nextInt();
    }
    
    public void toCount() throws InvalidParamsException {
        
        if (first > second){
            throw new InvalidParamsException();
        }
        
        int difference = second - first;
        
        for(int i = 1; i <= difference; i++){
            System.out.println("Imprimindo o número " + i);    
        }
    }
}
