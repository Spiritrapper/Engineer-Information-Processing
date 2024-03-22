class Soojebi{
    static private Soojebi instance = null;
    private int count = 0;
    static public Soojebi get() { 
        if(instance == null){
            instance = new Soojebi();
        }
        return instance; // 모든객체 같은 주소
        //return instance= new Soojebi(); // 다른 주소
    }
    public void count() {count++;}
    public int getCount(){return count;}
}



public class Soojebi_6_142_14_singlton {
    public static void main(String[] args) {
        Soojebi s1 = Soojebi.get(); // static 객체생성없이 사용가능
        s1.count();
        Soojebi s2 = Soojebi.get();
        s2.count();
        Soojebi s3 = Soojebi.get();
        s3.count();
        Soojebi s4 = Soojebi.get();
        s4.count();
        s4.count();

        Soojebi s5 = Soojebi.get();
        s5.getCount();
        System.out.println(s1.getCount());
        System.out.println(s2.getCount()); // 5
        System.out.println(s3.getCount()); // 5
        System.out.println(s5.getCount()); // 5
        System.out.println(s5); //Soojebi@372f7a8d
        System.out.println(s4); //Soojebi@372f7a8d
        System.out.println(s3); //Soojebi@372f7a8d
    }
}
