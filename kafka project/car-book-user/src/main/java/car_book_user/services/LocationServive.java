package car_book_user.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationServive {
    
    @KafkaListener(topics  = "cab-location",groupId = "user-group")
    public void cabLocation(String location){

        System.out.println(location);
    }

}
