package designpatterns.singleton;

public class DBC {
    private static DBC dbc = null;


    private DBC() {
    }

    public static DBC getInstance() {
        if (dbc == null) {
            synchronized (dbc) {
                if (dbc == null) {
                    dbc = new DBC();
                }
            }
        }
        return dbc;
    }
}

// A coinstructor
// 1. Throw an exception
// 2 Return a NEW object
