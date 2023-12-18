package effectiveJava.selfTypeSimulation;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class AbstractPizza {
    public enum Topping {CHEESE, HAM, MUSHROOM, ONION, PEPPER, SAUSAGE;}
    final Set<Topping> toppings;
    public static abstract class AbstractBuilder<SelfType extends AbstractBuilder<SelfType>>{
        Set<Topping> toppings = EnumSet.noneOf(Topping.class);
        public SelfType addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        public abstract SelfType self();

        public abstract AbstractPizza build();

    }
    AbstractPizza(AbstractBuilder<?> builder) {
        toppings = EnumSet.copyOf(builder.toppings);
    }

}
