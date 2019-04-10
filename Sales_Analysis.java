import java.util.*;
import java.io.*;
public class Sales_Analysis {

    public void main()  throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = in.nextLine();
        Scanner fileIn = new Scanner(new File(filename));
        String [] name = new String [10];
        double [] [] items = new double [10] [10];
        int i = 0;

        while (fileIn.hasNext()) {
            name[i] = fileIn.next();

            items[i][0] = fileIn.nextDouble();
            items[i][1] = fileIn.nextDouble();
            i++;

        }
        System.out.println("Weekly sales");
        System.out.print("Product\t\t" + "Price\t\t" + "Number\t\t" + "Sales\n");
                for (int i2 = 0; i2 < i; i2++) {
            System.out.println(name[i2] + "\t\t" + items[i2] [0] + "\t\t"  
            + items [i2][1] + "\t\t" + items[i2][0]
                * items [i2] [1]);


            
        }
    }
}