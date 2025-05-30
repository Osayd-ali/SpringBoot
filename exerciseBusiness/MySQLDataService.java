package exerciseBusiness;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        // Logic to connect to MySQL and retrieve data
        System.out.println("MySQL Data Service");
        return new int[] { 1, 2, 3, 4, 5 };
    }
}