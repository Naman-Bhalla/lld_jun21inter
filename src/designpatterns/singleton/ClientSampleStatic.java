package designpatterns.singleton;

public class ClientSampleStatic {

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            SampleStatic sampleStatic = new SampleStatic();
            SampleStatic.count += 1;
            System.out.println(SampleStatic.count);
        }
    }
}
