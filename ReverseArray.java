import java.util.Scanner;
class ReverseArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter size:");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=size-1;
        for(int i=0;i<arr.length;i++){
            if(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            }
            System.out.println("reverse array:"+arr[i]);
            left++;
            right--;
        }
    }
}