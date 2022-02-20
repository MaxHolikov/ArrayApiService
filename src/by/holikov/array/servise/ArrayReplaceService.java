package by.holikov.array.servise;

import by.holikov.array.entity.ArrayEntity;

import java.util.Arrays;

public class ArrayReplaceService {

    public ArrayReplaceService() {
    }

    public void replaceNegativeNumber(ArrayEntity array) {
        int[] newArray = array.getArray();
        for (int i = 0; i != newArray.length; i++) {
            if (newArray[i] < 0) {
                newArray[i] = 0;
            }
            array.setArray(newArray);

        }
    }

    public  void replaceMaxNumber(ArrayEntity array, int maxElement) {
        int[] newArray = array.getArray();
        for (int i = 0; i != newArray.length; i++) {
            if (newArray[i] == maxElement) {
                newArray[i] = 0;
            }
            array.setArray(newArray);

        }


    }


}