package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.service;

public class SortFactoryService {
    public ISortAlgorithm sort(String sortType){
        if(sortType == null){
            return null;
        }
        if(sortType.equalsIgnoreCase("BUBBLE")){
            return new BubbleSortAlgorithmService();

        } else if(sortType.equalsIgnoreCase("GENERIC")){
            return new GenericSortAlgorithmService();

        } else if(sortType.equalsIgnoreCase("INSERTION")){
            return new InsertionSortAlgorithmService();
        } else if(sortType.equalsIgnoreCase("REVERSE")){
            return new ReverseSortAlgorithmService();
        } else if(sortType.equalsIgnoreCase("SELECTION")){
            return new SelectionSortAlgorithmService();
        }
        return null;
    }
}
