package problems_on_reflection_in_java.intermediate_level.access_and_modify_static_fields;


import java.lang.reflect.Field;

public class StaticFieldModifier {
    public static void modifyApiKey(String newApiKey) {
        try {
            Class<?> clazz = Configuration.class;
            Field apiKeyField = clazz.getDeclaredField("API_KEY");

            apiKeyField.setAccessible(true);
            apiKeyField.set(null, newApiKey);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.err.println("Error modifying static field: " + e.getMessage());
        }
    }
}
