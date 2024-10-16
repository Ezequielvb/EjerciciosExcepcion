package aleatorio;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Random {
    
    public static void opcion()throws NumberFormatException, 
    IOException, 
    FileNotFoundException, 
    IndexOutOfBoundsException, 
    ArithmeticException {
        int numAl = (int) (Math.random()*5+1);
        switch (numAl) {
            case 1:
                throw new NumberFormatException();
            case 2:
                throw new IOException();
            case 3:
                throw new FileNotFoundException();
            case 4:
                throw new IndexOutOfBoundsException ();
            case 5:
                throw new ArithmeticException();
        }
    }
}
