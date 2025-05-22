package exerciseBusiness;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        // Logic to connect to MySQL and retrieve data
        System.out.println("MySQL Data Service");
        return new int[] { 1, 2, 3, 4, 5 };
    }
}