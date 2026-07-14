import java.util.Scanner;
class searchElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int search;
        System.out.println("Enter size:");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter an element to search:");
        search=sc.nextInt();
        int i;
        for(i=0;i<size;i++){
            if(arr[i]==search){
                System.out.println("Element found at index"+i);
                break;
            }
            }
            if(i==size){
                System.out.println("Element not found");
            }
            }
        }