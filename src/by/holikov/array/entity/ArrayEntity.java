package by.holikov.array.entity;

import java.io.*;
import java.util.Arrays;

public class ArrayEntity {
    private int[] array;

    public ArrayEntity(int... array) {
        this.array = array;
    }

    public int[] getArray() {
        return array.clone();
    }

    public void setArray(int... array) {
        this.array = array.clone();
    }
}
