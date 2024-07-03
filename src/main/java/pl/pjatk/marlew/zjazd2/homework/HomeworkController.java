package pl.pjatk.marlew.zjazd2.homework;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

    @GetMapping("/pathVar-{pathVar}")
    public ResponseEntity<HomeworkModel> getByPathVar(@PathVariable String pathVar) {
        return ResponseEntity.ok(new HomeworkModel(pathVar));
    }

    @GetMapping("/param")
    public ResponseEntity<HomeworkModel> getByParam(@RequestParam String param) {
        return ResponseEntity.ok(new HomeworkModel(param));
    }

    @PutMapping("/putMap/{putValue}")
    public ResponseEntity<HomeworkModel> updateByPut(@PathVariable String putValue, @RequestBody HomeworkModel homeworkModel) {
        return ResponseEntity.ok(homeworkModel);
    }

    @PostMapping("/post")
    public ResponseEntity<HomeworkModel> createHomeworkBytPost(@RequestBody HomeworkModel homeworkModel) {
        return ResponseEntity.ok(homeworkModel);
    }

//    Oba są źle, nie to takie rozwiązanie chodziło w zadaniu domowym
//    @DeleteMapping("/delete/{pathVar}")
//    @ResponseStatus(HttpStatus.OK)
//    public void deleteHomework(@PathVariable String pathVar) { }
//
//    @DeleteMapping("/delete_2/{pathVar}")
//    public ResponseEntity<HomeworkModel> deleteHomework2(@PathVariable String pathVar) {
//        return new ResponseEntity<>(HttpStatus.OK);

    // To jest poprawione zadanie domowe
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteHomework() {
        return ResponseEntity.ok().build();
    }
}
