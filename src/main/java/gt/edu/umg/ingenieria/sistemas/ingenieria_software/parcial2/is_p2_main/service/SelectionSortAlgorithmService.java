package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.service;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.bubble_sort.service.BubbleSortService;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_selection_sort.service.SelectionSortStringService;

public class SelectionSortAlgorithmService implements ISortAlgorithm{
    @Override
    public void sort(String[] array) {
        SelectionSortStringService selectionSortStringService = new SelectionSortStringService();
        IPrintArrayContentService printArrayContentService = new PrintArrayContentService();
        String[] newArray = selectionSortStringService.selectionSortString(array);
        printArrayContentService.printArrayContent(newArray);
    }
}
