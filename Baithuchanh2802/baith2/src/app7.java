import java.util.Scanner;

public class app7 {
private static String max;

public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        float n,max=0;
        do 
        {
            System.out.println("nhap so thuc: ");
            n=sc.nextFloat();
            if(n>max)
            {
                max=n;
            }
        }
        while(n!=0);
    }
            
    System.out.println("so lon nhat trong cac so vua nhap la: "+max);
        
    

}

}