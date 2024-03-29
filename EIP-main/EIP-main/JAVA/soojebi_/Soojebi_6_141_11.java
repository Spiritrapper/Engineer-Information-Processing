package soojebi_;

public class Soojebi_6_141_11 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        

        // 정상적으로 출력
        System.out.println(arr[0][1]); // 50

        // ArrayIndexOutOfBoundsException 발생
        System.out.println(arr[1][1]); // 두 번째 행에는 요소가 하나만 존재하므로 인덱스가 범위를 벗어납니다.
        // c언어에서는 배열에 초기0
    }
}
