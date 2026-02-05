import java.util.Scanner;

public class PyramidPattern {
    
    public static void main (String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number rows: ");
        int n=sc.nextInt();

        for(i=1;i<=n ;i++){
                       for(j=1;j<=i-n;j++){
                System.out.println(" ");
            }
        for(int k=1;k<=2*i-1;k++){
            System.out.println("*");

            }
            System.out.println();


        }


        

    }
}
