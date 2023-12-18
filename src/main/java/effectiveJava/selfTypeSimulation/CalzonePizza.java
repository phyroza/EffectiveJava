package effectiveJava.selfTypeSimulation;

public class CalzonePizza extends AbstractPizza {
    boolean sauceInside;

    private CalzonePizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    public static class Builder extends AbstractBuilder<Builder> {
        private final boolean sauceInside;

        public Builder(boolean sauceInside) {
            this.sauceInside = sauceInside;
        }

        @Override
        public Builder self() {
            return this;
        }

        @Override
        public CalzonePizza build() {
            return new CalzonePizza(this);
        }
    }

    @Override
    public String toString() {
        return String.format("Calzone pizza with sauce %s and toppings %", sauceInside ? "inside" : "outside", toppings);
    }

}
