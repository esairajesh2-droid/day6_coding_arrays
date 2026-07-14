import java.util.Scanner;
class RemoveDup{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.err.print("Enter size:");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("enter array elements:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]!=arr[i+1]){
                   System.out.println(arr[i]);
                }
            }
System.out.println(arr[size-1]);
    }
}