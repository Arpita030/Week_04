package problems_on_reflection_in_java.intermediate_level.access_and_modify_static_fields;


public class Main {
    public static void main(String[] args) {
        System.out.println("Before modification: " + Configuration.getApiKey());

        StaticFieldModifier.modifyApiKey("NEW_SECRET_KEY");

        System.out.println("After modification: " + Configuration.getApiKey());
    }
}
