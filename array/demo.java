import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        System.out.println("Enter the elements of the array:");
        for (int i=0;i<4;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("elements of the array:");
        for (int i=0;i<4;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

