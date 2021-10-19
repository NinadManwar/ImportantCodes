import java.util.Scanner;

public class max_min_avg_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements you want to enter in array:");
        int n = sc.nextInt();
        System.out.println("enter "+ n +" elements:");
        int[] arr= new int[n];
        for(int i = 0;i < n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(n+": elements entered");

        int max=arr[0];
        int min =arr[0];
        int sum = arr[0];
        for(int i=1;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            sum=sum+arr[i];

        }
        System.out.println("min:"+min);
        System.out.println("max:"+max);
        System.out.println("avg:"+sum/n);
    }
}
