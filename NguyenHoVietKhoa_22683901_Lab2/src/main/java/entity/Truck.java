package entity;

public class Truck implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delived by truck");
    }
}
