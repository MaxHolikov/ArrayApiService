package by.holikov.array.servise.impl;

import java.util.Arrays;

import by.holikov.array.entity.ArrayEntity;
import by.holikov.array.servise.ArrayFindService;

public class ArrayFindServiceImpl implements ArrayFindService {
    public ArrayFindServiceImpl() {
    }

    @Override
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

    @Override
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

    @Override
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

    @Override
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