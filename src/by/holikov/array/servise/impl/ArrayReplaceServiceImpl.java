package by.holikov.array.servise.impl;

import by.holikov.array.entity.ArrayEntity;
import by.holikov.array.servise.ArrayReplaceService;

import java.util.Arrays;

public class ArrayReplaceServiceImpl implements ArrayReplaceService {

    public ArrayReplaceServiceImpl() {
    }

    @Override
    public void replaceNegativeNumber(ArrayEntity array) {
        int[] newArray = array.getArray();
        for (int i = 0; i != newArray.length; i++) {
            if (newArray[i] < 0) {
                newArray[i] = 0;
            }
            array.setArray(newArray);

        }
    }

    @Override
    public void replaceNumber(ArrayEntity array, int replacementNumber, int number) {
        int[] newArray = array.getArray();
        for (int i = 0; i != newArray.length; i++) {
            if (newArray[i] == replacementNumber) {
                newArray[i] = number;
            }
            array.setArray(newArray);

        }


    }


}