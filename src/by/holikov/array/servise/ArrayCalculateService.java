package by.holikov.array.servise;
import by.holikov.array.entity.ArrayEntity;

public class ArrayCalculateService {
    public ArrayCalculateService() {
    }
    public void averageArray(ArrayEntity array){
        int[] newArray = array.getArray();
        double summArray = 0;
        double averageArray = 0;
        for (int i = 0; i != newArray.length; i++) {
            summArray = summArray + newArray[i];
        }
        averageArray = summArray / (newArray.length);
        System.out.println("averageArray = " + averageArray);
    }

    public void summArray(ArrayEntity array){
        int[] newArray = array.getArray();
        int summArray = 0;
        for (int i = 0; i != newArray.length; i++) {
            summArray = summArray + newArray[i];
        }
        System.out.println("SummArray = " + summArray);
    }



}


