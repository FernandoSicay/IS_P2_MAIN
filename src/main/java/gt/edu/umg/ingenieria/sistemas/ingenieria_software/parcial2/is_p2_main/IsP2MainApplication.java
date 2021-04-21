package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_selection_sort.service.SelectionSortStringService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class IsP2MainApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IsP2MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Check if a command line argument exists
        // Display the arguments from the command line
        for (int counter = 0; counter < args.length; counter++) {
            System.out.println("argument index " + counter + ": " + args[counter]);
        }

        SelectionSortStringService hola = new SelectionSortStringService();

        String[] newArray;
        newArray = hola.selectionSortString(args);


        for(int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }
    }
}