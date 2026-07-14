import java.util.Scanner;
class SecondLargest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        System.out.print("Enter size:");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Second largest element is:"+" "+secondLargest);
    }
}