package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.service;


import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.bubble_sort.service.BubbleSortService;

public class BubbleSortAlgorithmService implements ISortAlgorithm{
    @Override
    public void sort(String[] array) {

        //SelectionSortStringService hola = new SelectionSortStringService();
        BubbleSortService bubbleSortAlgorithmService = new BubbleSortService();
        IPrintArrayContentService printArrayContentService = new PrintArrayContentService();
        //InsertionSortAlgorithmService hola3 = new InsertionSortAlgorithmService();
        String[] newArray = bubbleSortAlgorithmService.bubbleSortService(array);
        printArrayContentService.printArrayContent(newArray);

    }
}
