package effectiveJava.selfTypeSimulation;


public class LetsMakePizzas {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.MEDIUM)
                .addTopping(AbstractPizza.Topping.CHEESE)
                .addTopping(AbstractPizza.Topping.HAM)
                .addTopping(AbstractPizza.Topping.SAUSAGE)
                .build();
        System.out.println(nyPizza);


        CalzonePizza calzone = new CalzonePizza.Builder(true)
                .addTopping(AbstractPizza.Topping.MUSHROOM)
                .addTopping(AbstractPizza.Topping.SAUSAGE)
                .addTopping(AbstractPizza.Topping.PEPPER)
                .addTopping(AbstractPizza.Topping.ONION)
                .build();
        System.out.println(calzone);
    }
}
