package pl.pjatk.marlew.zjazd2.Cwiczenie2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cwiczenie2/car")
public class CarController {
    
    @GetMapping("/getCarModel")
    public ResponseEntity<CarModel> getCar() {
        return ResponseEntity.ok(new CarModel(2003, "Mazda", "VIN"));
    }
}
