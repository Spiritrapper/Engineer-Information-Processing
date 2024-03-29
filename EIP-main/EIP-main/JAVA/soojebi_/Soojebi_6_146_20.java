package soojebi_;

public class Soojebi_6_146_20 {
    public static void main(String[] args) {
        int[] result = new int[5];
        int[] arr = {79, 34, 10, 99, 50};
        for(int i = 0; i < 5; i++){         // i =0 일때 ( 1, 1, 1, 2, 2) 
            result[i] = 1;
            for (int j = 0; j< 5; j++) {
                if(arr[i] <arr[j]) result[i]++; // 비교하며 계속 변할수 있기에 for문 전부 실행하고 나온 마지막 result[i]값이 출력으로나온다.
            }
        }
        for(int k=0; k<5; k++) {
            System.out.println(result[k]);
        }
    }
}
