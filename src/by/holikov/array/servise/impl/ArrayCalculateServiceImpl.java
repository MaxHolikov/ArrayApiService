package by.holikov.array.servise.impl;

import by.holikov.array.entity.ArrayEntity;
import by.holikov.array.servise.ArrayCalculateService;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {
    public ArrayCalculateServiceImpl() {
    }

    @Override
    public void averageArray(ArrayEntity array) {
        int[] newArray = array.getArray();
        double summArray = 0;
        double averageArray = 0;
        for (int i = 0; i != newArray.length; i++) {
            summArray = summArray + newArray[i];
        }
        averageArray = summArray / (newArray.length);
        System.out.println("averageArray = " + averageArray);
    }

    @Override
    public void summArray(ArrayEntity array) {
        int[] newArray = array.getArray();
        int summArray = 0;
        for (int i = 0; i != newArray.length; i++) {
            summArray = summArray + newArray[i];
        }
        System.out.println("SummArray = " + summArray);
    }


}


