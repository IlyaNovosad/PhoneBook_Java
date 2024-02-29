package JavaOOP.HomeTask2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour,MarketBehaviour{
    private List<Actor> queue = new ArrayList<>();
    private List<Actor> queueWaiting = new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            queueWaiting.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        waitOrder();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " занял очередь");
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void waitOrder() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()){
                queueWaiting.add(actor);
                System.out.println(actor.getName() + " ожидает получения заказа");
            }
        }
        for (Actor actor : queueWaiting) {
            if (actor.isMakeOrder()){
                queue.remove(actor);
            }
        }

    }

    @Override
    public void giveOrders() {
        for (Actor actor : queueWaiting) {
            if (actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }


    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queueWaiting) {
            if (actor.isTakeOrder()){
                System.out.println(actor.getName() + " вышел из очереди");
                releasedActors.add(actor);
            }
        }
        releaseFromMarket(releasedActors);
    }
}