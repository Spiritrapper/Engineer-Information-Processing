package soojebi_;

public class SoojebiPractice {
    
    public static void main(String[] args) {
        int i = 0;
        int sum =0;
        while(i<10)  {
            
            ++i;
            System.out.println("첫번째: "+ i);
            sum += i++;
            System.out.println("다음 i: "+i);
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}


