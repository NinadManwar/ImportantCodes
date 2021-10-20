public class programForLinearsearch {
    public static void main(String[] args) {
        int[] arr ={11,22,33,44,55,66,77};
        int x= 44;
        System.out.println(search(arr,x));

    }
    public static int search(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println(arr[i]);
                return i;
            }
        }
        return -1;
    }
}
