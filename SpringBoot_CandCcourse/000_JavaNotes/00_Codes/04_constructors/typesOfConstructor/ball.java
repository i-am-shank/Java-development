package typesOfConstructor;

public class ball {
    String name;
    int cost;

//    Overloaded constructors (on no. of parameters & data-type of parameters)

    ball() {
        this.name = "name not specified";
        cost = -1;
    }

    ball(String name) {
        this.name = name;
        this.cost = -1;
    }

    ball(int cost) {
        this.name = "name not specified";
        this.cost = cost;
    }

    ball(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
