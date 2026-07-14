import java.util.Scanner;
class Count{
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int countNegative=0;
        int countPositive=0;
        int countZeros=0;
        System.err.print("Enter size:");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("enter array elements:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<size;i++){
                if(arr[i]>0){
                    countPositive++;
                }else if(arr[i]<0){
                    countNegative++;
                }else{
                    countZeros++;
                }
            }
            System.out.println("positive numbers="+" "+countPositive);
            System.out.println("negative numbers="+" "+countNegative);
            System.out.println("zeros="+" "+countZeros);
}
}