package by.holikov.array.servise;
import java.util.Arrays;
import by.holikov.array.entity.ArrayEntity;

public class ArrayService {

    /*  private int[] array;
                public ArrayService(int... array) { //метод с переменным числом параметров
                this.array=array;
                System.out.println(Arrays.toString(this.array));
                }*/
public ArrayService(){
    }

    public void findMaxArray(ArrayEntity array) {
   int[] array = array.getArray();
        int maxArray = array[0];
        for (int i = 0; i != array.length; i++) {
            if (array[i] > maxArray) {
                maxArray = array[i];
            }
            System.out.println("maxArrayElement = " + maxArray);
    }
}


