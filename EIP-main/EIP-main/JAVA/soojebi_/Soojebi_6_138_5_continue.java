package soojebi_;

public class Soojebi_6_138_5_continue {
    
    public static void main(String[] args) {
        int i = 0;
        int sum =0;
        while(i<10)  {
            i++;
            if(i%2==1) {
                continue;
            }
            sum += i;
        }
    }
}


