package greeter;

public class Greeter {
    private final FormalityFactory formalityFactory;
    private Formality formality = new DefaultFormality();

    public Greeter() {
        this(new FormalityFactory());
    }

    public Greeter(FormalityFactory formalityFactory) {
        this.formalityFactory = formalityFactory;
    }

    public String greet() {
        return this.formality.greet();
    }

    public void setFormality(String formality) {
        this.formality = formalityFactory.create(formality);
    }
}