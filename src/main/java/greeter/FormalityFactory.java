package greeter;

import java.util.HashMap;
import java.util.Map;

public class FormalityFactory {
    private final Map<String, Formality> registry = new HashMap<>();

    public FormalityFactory() {
        register("formal", new FormalFormality());
        register("casual", new CasualFormality());
        register("intimate", new IntimateFormality());
    }

    public void register(String key, Formality formality) {
        registry.put(key, formality);
    }

    public Formality create(String key) {
        return registry.getOrDefault(key, new DefaultFormality());
    }
}
