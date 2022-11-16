package dio.web.api.controller;

import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserCotroller {
    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<User> getUsers() {
        return repository.listAll();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable("id") Integer id) {
        return repository.finById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id ) {
         repository.remove(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User user) {
        repository.save(user);
    }

}
