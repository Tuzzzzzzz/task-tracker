package evgen.task_tracker_api.controller;

import evgen.task_tracker_api.store.entities.UserEntity;
import evgen.task_tracker_api.store.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user){
        try{
            userRepo.save(user);
            return ResponseEntity.ok("пользователь успешно сохранён");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getUsers(){
        try{
            return ResponseEntity.ok("сервер пашет");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("произошла ошибка");
        }
    }
}
