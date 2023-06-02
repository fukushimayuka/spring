package com.example.demo.user;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> getAllUsers(){
        List<User> users = repository.findAll();
        return users;
    }

    public User getById(@PathVariable("name") String name){
        return repository.findByName(name);
    }


    @PostMapping("update")
    public String updateName(@RequestParam("fromName") String fromName){
        repository.updateUser(fromName);
        return "変更しました";
        // @RequestBody
        //４つ、更新、削除、追加、
    }
    
}
