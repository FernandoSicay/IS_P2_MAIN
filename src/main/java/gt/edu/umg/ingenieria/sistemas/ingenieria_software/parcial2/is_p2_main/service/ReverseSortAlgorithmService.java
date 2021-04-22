package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.service;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.bubble_sort.service.BubbleSortService;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.reverse_sort.service.ReverseSortService;

public class ReverseSortAlgorithmService implements  ISortAlgorithm{
    @Override
    public void sort(String[] array) {
        ReverseSortService reverseSortService = new ReverseSortService();
        IPrintArrayContentService printArrayContentService = new PrintArrayContentService();
        String[] newArray = reverseSortService.reverseSort(array);
        printArrayContentService.printArrayContent(newArray);
    }
}
