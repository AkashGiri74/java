import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][];
          arr[0]=new int[3];
          arr[1]=new int[2];
          arr[2]=new int[6];
          arr[3]=new int[1];
          arr[4]=new int[5];
          


        System.out.println("Enter row element of array");
        for (int i=0;i<5;i++)
       {
           for (int j=0;j<arr[i].length;j++) 
            {
            arr[i][j]=sc.nextInt();
            }
       }

        System.out.println("elements of the array:");

         for (int i=0;i<5;i++)
           {
          for (int j=0;j<arr[i].length;j++) 
           {  
             System.out.print(arr[i][j]+" ");
        
           }
           System.out.println();
            }
        // for (int i=0;i<4;i++) {
        //     System.out.print(arr[i]+" ");
        // }

    }
    
}
