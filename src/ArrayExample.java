import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer[] arr=arrayExample.createRandom();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so a");
        int x=scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so 5"+x+"la"+arr[x]);

        } catch (Exception e){
            System.err.println("chi so vuot gioi han");
        }
    }
}
