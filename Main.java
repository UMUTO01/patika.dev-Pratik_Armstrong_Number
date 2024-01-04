import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int delta = scan.nextInt();

        int total=0;



        boolean Calculate = true;
        while (Calculate) {

            int brother = delta % 10;
            delta = delta/10;

            if(brother!=0){
                total +=brother;
            }

            if(brother ==0 ){
                Calculate= false;
            }

        }

        System.out.println("The total is equal to: "+ total);
    }

}