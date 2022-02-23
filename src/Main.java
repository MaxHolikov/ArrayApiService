import by.holikov.array.entity.ArrayEntity;
import by.holikov.array.servise.impl.ArrayFindServiceImpl;
import by.holikov.array.servise.impl.ArrayCalculateServiceImpl;
import by.holikov.array.servise.impl.ArrayReplaceServiceImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayEntity array = new ArrayEntity(1, 2, -2, 16, 99, -16);
        ArrayFindServiceImpl arrayFindService = new ArrayFindServiceImpl();
        ArrayCalculateServiceImpl arrayCalcService = new ArrayCalculateServiceImpl();
        ArrayReplaceServiceImpl arrayReplaceService = new ArrayReplaceServiceImpl();

        arrayFindService.findMinArray(array);
        arrayFindService.findMaxElement(array);
        arrayFindService.findMinArray(array);
        arrayCalcService.averageArray(array);
        arrayCalcService.summArray(array);
        arrayFindService.findNegativeNumber(array);
        arrayFindService.findPositiveNumber(array);

        System.out.println(Arrays.toString(array.getArray()));
        arrayReplaceService.replaceNegativeNumber(array);
        System.out.println(Arrays.toString(array.getArray()));

        System.out.println(Arrays.toString(array.getArray()));
        arrayReplaceService.replaceNumber(array,0,400);
        System.out.println(Arrays.toString(array.getArray()));

        }

}
