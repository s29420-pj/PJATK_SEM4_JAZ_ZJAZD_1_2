package pl.pjatk.marlew.zjazd2;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.marlew.zjazd2.Cwiczenie2.CarModel;

@RestController
@RequestMapping("/cwiczenie3_4_5")
public class Cwiczenie3_4_5 {

    // cwiczenie 3
    @GetMapping("/test/hello/{someValue}")
    public ResponseEntity<String> helloSomeValue(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    // cwiczenie 4
    @GetMapping("/test/hello/requestParam")
    public String helloSomeValueReqParam(@RequestParam String someValue) {
        return someValue;
    }

    // cwiczenie 5
    @PostMapping("/test/model")
    public ResponseEntity<CarModel> newCar(@RequestBody CarModel carModel) {
        return ResponseEntity.ok(carModel);
    }

//    {
//        "yearOfProduction": 2003,
//            "name": "Mazda",
//            "vin": "VIN"
//    }
}
