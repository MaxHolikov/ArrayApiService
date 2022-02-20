package by.holikov.array.entity;
import java.io.*;
import java.util.Arrays;

public class ArrayEntity {
    private int[] array;

   public ArrayEntity(int ... array){ //метод с переменным числом параметров
        this.array=array;
       // System.out.println(Arrays.toString(array));
    }

     public int[] getArray(){
         int newLength = array.length;
         int[] copiedArrayEntity = Arrays.copyOf(array, newLength);
         return copiedArrayEntity;
    }

    public void setArray(int ... array) {
            this.array=array;
    }
}
