package soojebi_;

public class Soojebi_6_139_8_binary {
    
    public static void main(String[] args) {
        int []a = new int[8];
        int i=0;
        int n=10;
        while(n>0) {
            //a[i++]= n % 2;
            a[i++]= n&1;
            n/=2;
        }
        for(i=7; i>=0; i--){
            System.out.print(a[i]+" ");
        }
    }
}


