public class Horse extends Animal implements  Runnable {
    RunningBehaviour runningBehaviour = new FastRunningBehaviour();

    @Override
    public void run() {
        runningBehaviour.run();
    }
}

// It follows S -<> SRP
// Favour composition and not inheritance