package exerciseBusiness;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        // Logic to connect to MongoDB and retrieve data
        System.out.println("MongoDB Data Service test");
        return new int[] { 11, 22, 33, 44, 55 };
    }
}
