package car_book_driver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import car_book_driver.services.CabLocationService;

@RestController
@RequestMapping("/location")
public class CabLocatonController {
    
    @Autowired
    private CabLocationService cabLocationService;
    
    @PostMapping
    public ResponseEntity<?> updateLocation() throws InterruptedException{

        int a =100;
        while (a>0) {
            cabLocationService.updateLocation(Math.round(Math.random()*100)+",");
            Thread.sleep(1000);
            a--;
            
        }

        return new ResponseEntity<>(("Location Updated"),HttpStatus.OK);
    }

}
