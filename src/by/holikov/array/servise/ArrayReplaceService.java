package by.holikov.array.servise;

import by.holikov.array.entity.ArrayEntity;

public interface ArrayReplaceService {

    void replaceNegativeNumber(ArrayEntity array);

    void replaceNumber(ArrayEntity array, int replacementNumber, int number);

}
