import java.io.FileNotFoundException;
import java.io.IOException;
import aleatorio.Random;

public class App {
    
    public static void main(String[] args) {
        try{
            Random.opcion();
        }
        catch (NumberFormatException e){
            System.out.println("Excepcion NumberFormatException");
        }
        catch (FileNotFoundException e){
            System.out.println("Excepcion FileNotFoundException");
        }
        catch (IOException e){
            System.out.println("Excepcion IOException");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Excepcion IndexOutOfBoundsException");
        }
        catch (ArithmeticException e){
            System.out.println("Excepcion ArithmeticException");
        }
        }
        
        
}