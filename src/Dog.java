public class Dog extends Animal implements Runnable {
    String breed;
    String hairColour;
    private RunningBehaviour runningBehaviour = new FastRunningBehaviour();

    void bark() {
        System.out.println("Bhow");
    }

    void sayName() {
        System.out.println("Bhow bhow bhow saying name");
    }

    @Override
    public void run() {
        System.out.println("Nothing");
    }
}
