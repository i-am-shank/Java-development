package typesOfConstructor;

public class constructorOverload{
    public static void main(String []args) {
        ball b1 = new ball();
        ball b2 = new ball("Nike Football");
        ball b3 = new ball(2500);
        ball b4 = new ball("Adidas Football", 4000);

        System.out.println("b1 : " + b1.name + " , " + b1.cost);
        System.out.println("b2 : " + b2.name + " , " + b2.cost);
        System.out.println("b3 : " + b3.name + " , " + b3.cost);
        System.out.println("b4 : " + b4.name + " , " + b4.cost);
    }
}
