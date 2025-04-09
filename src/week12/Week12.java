//package week12;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Week12 {
//
//    public static void main(String[] args) {
////        try{
////           FileWriter gust=new FileWriter("employee.csv", false);
////           gust.write("Gustavo Alatta, CIS, Chicago\n");
////           gust.write("Laurie Alfaro, CIS, Chicago\n");
////           gust.write("Jeff Jirout, CIS, Chicago\n");
////           gust.write("Sam Saba, CIS, Chicago\n");
////           gust.close();
////           
////        }catch(IOException e){
////            e.printStackTrace();
////        }
//
//        int employee;
//        String name;
//        int age;
//        String city;
//        
//        Scanner sc=new Scanner(System.in);
//        
//        System.out.print("Enter the number of Employees ==> ");
//        employee=sc.nextInt();
//        sc.nextLine();
//               
//        try{
//            FileWriter gust=new FileWriter("EMINFO.txt");
//            for(int i=1;i<employee+1;i++){
//            System.out.print("Enter the Employee name #" + i + " ==> ");
//            name=sc.nextLine();
//            
//            System.out.print("Enter the Employee Age ==> ");
//            age=sc.nextInt();
//            
//            System.out.print("Enter the Employee City ==> ");
//            city=sc.nextLine();
//            sc.nextLine();
//            
//            gust.write(name+ ","+age+","+city+", ");
//     
//        }
//        gust.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//    
//}
package week12;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Week12 {

    public static void main(String[] args) {
        int employee;
        String name;
        int age;
        String city;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Employees ==> ");
        employee = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        try {
            FileWriter gust = new FileWriter("EMINFO.txt");

            for (int i = 1; i <= employee; i++) {
                System.out.print("Enter the Employee name #" + i + " ==> ");
                name = sc.nextLine();

                System.out.print("Enter the Employee Age ==> ");
                age = sc.nextInt();
                sc.nextLine(); // consume leftover newline

                System.out.print("Enter the Employee City ==> ");
                city = sc.nextLine();

                gust.write(name + "," + age + "," + city + "\n");
            }

            gust.close();
            System.out.println("Employee information saved to EMINFO.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
