@ActiveRecord(tableName = "commands", primaryKeyName = "id")

public class Command extends Entity{
    int id;
    String description;
    int user_id;

}
