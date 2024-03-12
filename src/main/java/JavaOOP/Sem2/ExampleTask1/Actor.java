package JavaOOP.Sem2.ExampleTask1;

import lombok.Getter;

public abstract class Actor implements ActorBehaviour{
    @Getter
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;

    public Actor(String name) {
        this.name = name;
        makeOrder = false;
        takeOrder = false;
    }
}
