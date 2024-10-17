import java.util.Scanner;
public class SumNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers");

        int[] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=1; i<3; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);


        
        sc.close();

    }
}
