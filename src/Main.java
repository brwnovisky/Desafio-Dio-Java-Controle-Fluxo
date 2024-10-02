import control.Counter;
import exceptions.InvalidParamsException;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        
        counter.getParameters();
        try {
            counter.toCount();
        } catch (InvalidParamsException e) {
            throw new RuntimeException(e);
        }
    }
}