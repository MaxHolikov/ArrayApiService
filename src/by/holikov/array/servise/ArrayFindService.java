package by.holikov.array.servise;
import java.util.Arrays;
import by.holikov.array.entity.ArrayEntity;

public class ArrayFindService {
    public ArrayFindService() {
    }

    public int findMaxElement(ArrayEntity array) {
        int[] newArray = array.getArray();
        int maxElement = newArray[0];
        for (int i = 0; i != newArray.length; i++) {
            if (newArray[i] > maxElement) {
                maxElement = newArray[i];
            }
        }
        System.out.println("maxArrayElement = " + maxElement);
        return maxElement;
    }

    public void findMinArray(ArrayEntity array) {
        int[] newArray = array.getArray();
        int minArray = newArray[0];
        for (int i = 0; i != newArray.length; i++) {
            if (newArray[i] < minArray) {
                minArray = newArray[i];
            }
        }
        System.out.println("minArrayElement = " + minArray);
    }

    public void findNegativeNumber(ArrayEntity array) {
        int[] newArray = array.getArray();
        int NegativeNumberArray = 0;
        for (int i = 0; i != newArray.length; i++) {
            if (newArray[i] < 0) {
                NegativeNumberArray++;
            }
        }
        System.out.println("NegativeNumberArray = " + NegativeNumberArray);
    }

    public void findPositiveNumber(ArrayEntity array) {
        int[] newArray = array.getArray();
        int PositiveNumberArray = 0;
        for (int i = 0; i != newArray.length; i++) {
            if (newArray[i] > 0) {
                PositiveNumberArray++;
            }
        }
        System.out.println("PositiveNumberArray = " + PositiveNumberArray);
    }


}