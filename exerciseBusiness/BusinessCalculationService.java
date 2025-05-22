package exerciseBusiness;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private DataService dataService;
    // Constructor Injection
    public BusinessCalculationService(DataService dataService) {
        System.out.println("Constructor Injection");
        this.dataService = dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.retrieveData())
                .max().orElse(0);
    }
}