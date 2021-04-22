package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.service;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.insertion_sort.service.InsertionSortService;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_generic_sort.GenericSortService;

public class InsertionSortAlgorithmService implements ISortAlgorithm{
    @Override
    public void sort(String[] array) {
        InsertionSortService insertionSortService = new InsertionSortService();
        IPrintArrayContentService printArrayContentService = new PrintArrayContentService();
        String[] newArray = insertionSortService.insertionSort(array,array.length);
        printArrayContentService.printArrayContent(newArray);
    }
}
