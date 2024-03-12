package JavaOOP.Sem2.ExampleTask1;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}
