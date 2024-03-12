package JavaOOP.Sem2.ExampleTask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Market implements MarketBehaviour, QueueBehaviour {
    private final List<Actor> queue = new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        queue.add(actor);
    }

    @Override
    public void takeOrder() {
        for (Actor actor: queue) {
            if(!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrder() {
        for (Actor actor: queue) {
            if(!actor.isTakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor: queue) {
            if(actor.takeOrder) {
                releasedActors.add(actor);
                System.out.println(actor.getName() + " человек вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }
}
