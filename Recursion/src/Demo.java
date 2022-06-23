public class Demo {
    public static void main(String[] args) {

//        hello();
        helo(3);
    }
//    public static void hello(){
//        hello();
//    }
    // output stackoverflow error
    public static void helo(int a){

        if(a < 0) return;
        System.out.println(a);
        helo(a - 1);
        System.out.println(a);
    }

}
