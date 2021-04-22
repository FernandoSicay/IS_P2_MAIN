package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.service;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.bubble_sort.service.BubbleSortService;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_generic_sort.GenericSortService;

public class GenericSortAlgorithmService implements ISortAlgorithm{
    @Override
    public void sort(String[] array) {
        //SelectionSortStringService hola = new SelectionSortStringService();
        GenericSortService bubbleSortAlgorithmService = new GenericSortService();
        IPrintArrayContentService printArrayContentService = new PrintArrayContentService();
        //InsertionSortAlgorithmService hola3 = new InsertionSortAlgorithmService();
        String[] newArray = bubbleSortAlgorithmService.genericSort(array);
        printArrayContentService.printArrayContent(newArray);
    }
}
