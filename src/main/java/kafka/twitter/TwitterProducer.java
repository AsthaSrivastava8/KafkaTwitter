package kafka.twitter;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TwitterProducer {
    public static void main(String[] args) {
        new TwitterProducer().run();
    }

    private void run() {

    }

    public void createTwitterClient() {
        BlockingQueue<String> msgQueue = new LinkedBlockingQueue<>(10000);
    }
}
