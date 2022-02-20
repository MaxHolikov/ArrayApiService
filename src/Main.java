import by.holikov.array.entity.ArrayEntity;
import by.holikov.array.servise.ArrayService;
import java.io.*;
import java.util.Arrays;
public class Main {

        public static void main(String[] args) {
           ArrayEntity array = new ArrayEntity(1, 3, -2, 16, 99, 26, 92, 43, -23, 44, -12);
          //ArrayService arrayService = new ArrayService(array.getArray());
            ArrayService arrayService = new ArrayService();

            arrayService.findMaxArray(array);


        }

}
