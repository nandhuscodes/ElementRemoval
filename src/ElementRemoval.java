import java.util.Arrays;
import java.util.Scanner;

public class ElementRemoval {
    static int findCostOfElementRemoval(int[] A){ //NlogN
        Arrays.sort(A); //NlogN
        int i = 0, j = A.length-1;
        while(i < j){ //N
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        int cost = 0;
        for(int k = 0; k < A.length; k++){ //N
            cost += A[k]*(k+1);
        }
        return cost;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        System.out.println(findCostOfElementRemoval(A));
    }
}
