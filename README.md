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
