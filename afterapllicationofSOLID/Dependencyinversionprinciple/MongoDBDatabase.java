package afterapllicationofSOLID.Dependencyinversionprinciple;

public class MongoDBDatabase implements Database {
    @Override
public void save(String data) {
System.out.println("Saving to MongoDB: " + data);
}
}
