public class Demo {
    int a = 10;
    void show(){
        System.out.println(a);
    }
    public static void main(String[] args){
        Demo r = new Demo();
        r.show();
    }
    static class Test{
        public static void main(String[] args){
            Demo r = new Demo();
            r.show();
        }
    }
}
