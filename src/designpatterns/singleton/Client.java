package designpatterns.singleton;

public class Client {

    public static void main(String[] args) {
//        DBC dbc = new DBC();
        DBC d1 = DBC.getInstance();
        DBC d2 = DBC.getInstance();
        ABC abc = new ABC();
//            DBC.dbc = null;
//        d1.dbUrl = "psql://";
//        d1.password = "abcde";

        System.out.println(d2.password);
    }
}
