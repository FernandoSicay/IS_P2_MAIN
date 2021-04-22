package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.service;

public class PrintArrayContentService implements IPrintArrayContentService{
    @Override
    public void printArrayContent(String[] array) {
        for (int counter = 0; counter < array.length; counter++) {
            System.out.println("    Index   " + counter + ":    " + array[counter]);
        }
    }
}
