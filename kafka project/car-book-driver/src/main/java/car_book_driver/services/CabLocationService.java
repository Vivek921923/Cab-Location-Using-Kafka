package car_book_driver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import car_book_driver.constants.appconstants;

@Service
public class CabLocationService {
    
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void updateLocation(String location) {
        kafkaTemplate.send(appconstants.CAB_LOCATION,location);
    }


}
