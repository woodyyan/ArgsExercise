package argsexercise;

import java.util.Set;

public class Schema {
    private Set<FlagSchema> flagSchemas;

    public Schema(Set<FlagSchema> flagSchemas){
        this.flagSchemas = flagSchemas;
    }

    public Object getTypeOf(String flag) {
        return flagSchemas.stream()
                .filter(flagSchema -> flagSchema.equalsByFlag(flag))
                .findFirst()
                .get()
                .getType();
    }

}
