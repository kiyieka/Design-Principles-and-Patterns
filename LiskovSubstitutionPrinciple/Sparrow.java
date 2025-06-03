package LiskovSubstitutionPrinciple;

public class Sparrow extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying fast.");
    }
}

