
import java.util.Scanner;

class checkSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        boolean sorted=true;
        System.out.println("Enter size:");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted=false;
                break;
            }
        }
        if(sorted){
                System.out.println("array is sorted");
            }else{
                System.out.println("array is not sorted");
            }
    }
}
