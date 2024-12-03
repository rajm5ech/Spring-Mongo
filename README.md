JSON Validation - Bean Creation For The JSON Schema Validator
@Configuration
public class AppConfiguration {
    private static final String SCHEMA_VALIDATION_FILE = "validation.json";
   
    @Bean
    public JsonSchema jsonSchema() {
        return JsonSchemaFactory
                .getInstance( SpecVersion.VersionFlag.V7 )
                .getSchema( getClass().getResourceAsStream( SCHEMA_VALIDATION_FILE ) );
    }
}
https://www.mongodb.com/docs/manual/reference/method/Date/#:~:text=You%20can%20specify%20a%20particular,ISODate%20with%20the%20specified%20date.
