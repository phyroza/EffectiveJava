package effectiveJava.selfTypeSimulation;

import java.util.Objects;

public class NyPizza extends AbstractPizza {
    public NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    enum Size {SMALL, MEDIUM, LARGE}
    final Size size;

    public static class Builder extends AbstractPizza.AbstractBuilder<Builder>{

        private final Size size;

        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public Builder self() {
            return this;
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }
    }

    @Override
    public String toString() {
        return String.format("NY style pizza, size %s, toppings %s", this.size.toString(), toppings.toString());
    }
}
