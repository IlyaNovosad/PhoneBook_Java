package JavaOOP.HomeTask2;

public abstract class Actor extends ActorBehaviour {
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;

    public Actor(String name) {
        this.name = name;
        makeOrder = false;
        takeOrder = false;
    }

    public String getName(){
        return name;
    }

    public abstract void setMakeOrder(boolean makeOrder);

    public abstract void setTakeOrder(boolean takeOrder);

    public abstract boolean isMakeOrder();

    public abstract boolean isTakeOrder();
}