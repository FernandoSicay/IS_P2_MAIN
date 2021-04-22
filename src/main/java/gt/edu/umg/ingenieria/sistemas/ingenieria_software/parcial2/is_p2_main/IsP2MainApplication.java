package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.service.ISortAlgorithm;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.service.SortFactoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class IsP2MainApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IsP2MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (args.length==0){
            System.out.println("No parameters");;
        }else{
            menu(args);
        }
    }

    public static void menu(String[] args){
        Scanner scanner = new Scanner(System.in);
        SortFactoryService sortFactoryService = new SortFactoryService();
        ISortAlgorithm sortAlgorithm;
        int sortOption = 0;
        do {

            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("        MENU");
            System.out.println("    BUBBLE      SORT  (1)");
            System.out.println("    GENERIC     SORT  (2)");
            System.out.println("    INSERTION   SORT  (3)");
            System.out.println("    REVERSE     SORT  (4)");
            System.out.println("    SELECTION   SORT  (5)");
            System.out.println("        EXIT          (0)");
            System.out.println("- - - - - - - - - - - - - - -");
            sortOption = Integer.parseInt(scanner.nextLine());

            switch (sortOption) {
                case 0:
                    System.exit(0);
                case 1:
                    sortAlgorithm = sortFactoryService.sort("BUBBLE");
                    sortAlgorithm.sort(args);
                    break;
                case 2:
                    sortAlgorithm = sortFactoryService.sort("GENERIC");
                    sortAlgorithm.sort(args);
                    break;
                case 3:
                    sortAlgorithm = sortFactoryService.sort("INSERTION");
                    sortAlgorithm.sort(args);
                    break;
                case 4:
                    sortAlgorithm = sortFactoryService.sort("REVERSE");
                    sortAlgorithm.sort(args);
                    break;
                case 5:
                    sortAlgorithm = sortFactoryService.sort("SELECTION");
                    sortAlgorithm.sort(args);
                    break;
                default:
                    System.out.println("NOT VALID OPTION");
                    break;
            }
        }while (sortOption!=0);
    }

}