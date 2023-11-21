import java.lang.reflect.Array;
import java.util.Arrays;

public class exception101 {
    public static void main(String[] args) {
        int[] myArray = new int[6];
        populateArray(myArray);
        printArray(myArray);
    }
    public static void populateArray(int[] myArray) throws IndexOutOfBoundsException{
        try {
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = i + 1;
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Out of bounds in populating");
        }
    }
    public static void printArray(int[] myArray) throws  IndexOutOfBoundsException{
        try{
            for (int i=0; i< myArray.length; i++) {
                System.out.print(myArray[i]+ " ");
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Out of bounds in printing");
        }
    }
    public static void getQuotient(int num1, int num2) throws ArithmeticException{
        double quotient;
        try{
            quotient = num1/num2;
        }catch (ArithmeticException e){
            System.out.println("Illegal operation");
        }

    }


}
