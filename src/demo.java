import java.util.Scanner;

public class demo {
    static int[][] arr(Scanner scanner){
        int i;
        int j;
        System.out.println("Mời nhập độ dài mảng arr[][]!!");
        i = scanner.nextInt();
        int arr[][]=new int[i][];
        for (int n=0; n<i;n++){
            System.out.println("Mời nhập độ dài mảng con tại"+n);
            j = scanner.nextInt();
            arr[n]= new int[j];
        }
        for (int n=0; n<arr.length;n++){
            for (int m=0;m<arr[n].length;m++){
                System.out.println("Mời nhập phần tử lại arr["+n+"]["+m+"]:");
                arr[n][m] = scanner.nextInt();
            }
        }
        return arr;
    }
    static int sumArr(Scanner scanner,int arr[][]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
       return sum;
    }
    static int sumDiagonalArr(Scanner scanner,int arr[][]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
                sum+=arr[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][]=arr(scanner);
        System.out.println(sumArr(scanner,arr));
        System.out.println(sumDiagonalArr(scanner,arr));

    }
}

