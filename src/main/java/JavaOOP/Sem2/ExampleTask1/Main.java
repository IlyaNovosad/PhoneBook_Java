package JavaOOP.Sem2.ExampleTask1;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human humanOne = new Human("Ivan");
        Human humanTwo = new Human("Olga");
        Human humanThree = new Human("Petr");
        market.acceptToMarket(humanOne);
        market.acceptToMarket(humanTwo);
        market.acceptToMarket(humanThree);
        market.update();
    }
}
