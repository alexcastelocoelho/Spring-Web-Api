package dio.web.api.repository;

import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(User user){
        System.out.println("SAVE - Getting the user in the repository layer");
        System.out.println(user);
    }
    public void update(User user){
        System.out.println("UPDATE - Getting the user in the repository layer");
        System.out.println(user);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Getting id: %d to delete a user", id));
        System.out.println(id);
    }
    public List<User> listAll(){
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("Almeida","password"));
        usuarios.add(new User("frank","masterpass"));
        return usuarios;
    }
    public User finById(Integer id){
        System.out.println(String.format("GET/id - Getting id: %d to find a user", id));
        return new User("Almeida","password");
    }


}
