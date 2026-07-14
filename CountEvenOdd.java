import java.util.Scanner;
class CountEvenOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int countEven=0;
        int countOdd=0;
        System.out.println("Enter size:");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("Even Count:"+" "+countEven);
        System.out.println("Odd COunt:"+" "+countOdd);
    }
}