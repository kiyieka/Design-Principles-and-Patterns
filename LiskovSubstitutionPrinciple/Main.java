package LiskovSubstitutionPrinciple;


public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();   // OK: can lay egg and fly
        bird1.layEgg();
        ((Sparrow) bird1).fly();

        Bird bird2 = new Ostrich();   // OK: can lay egg and run
        bird2.layEgg();
        ((Ostrich) bird2).run();
    }
}

