import by.holikov.array.entity.ArrayEntity;
import by.holikov.array.servise.ArrayFindService;
import by.holikov.array.servise.ArrayCalculateService;
import by.holikov.array.servise.ArrayReplaceService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayEntity array = new ArrayEntity(1, 3, -2, 16, 99, -12);
        ArrayFindService arrayFindService = new ArrayFindService();
        ArrayCalculateService arrayCalcService = new ArrayCalculateService();
        ArrayReplaceService arrayReplaceService = new ArrayReplaceService();

        arrayFindService.findMaxElement(array);
        arrayFindService.findMinArray(array);
        arrayCalcService.averageArray(array);
        arrayCalcService.summArray(array);
        arrayFindService.findNegativeNumber(array);
        arrayFindService.findPositiveNumber(array);
        //
        System.out.println(Arrays.toString(array.getArray()));
        arrayReplaceService.replaceNegativeNumber(array);
        System.out.println(Arrays.toString(array.getArray()));

        int maxElement = arrayFindService.findMaxElement(array);
        arrayReplaceService.replaceMaxNumber(array, maxElement);
        System.out.println(Arrays.toString(array.getArray()));
        }

}
