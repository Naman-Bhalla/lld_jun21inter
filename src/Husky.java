public class Husky extends Dog {
    RunningBehaviour runningBehaviour = new SlowRunningBehaviour();


    @Override
    public void run() {
        runningBehaviour.run();
    }
}

// Code to interfaces not implementation