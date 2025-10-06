package br.com.loginGui.LoginIA.controller;




import br.com.loginGui.LoginIA.models.users;
import br.com.loginGui.LoginIA.repository.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/users")


public class usersController {

 @Autowired
    private usersRepository usersRepository;


 @GetMapping("/")
    public List<users>searchAllUsers(){
     return usersRepository.findAll();
 }
@PostMapping(value = "/salvar",consumes ="application/json",produces = "application/json")
public users create(@RequestBody users database){
     return usersRepository.save(database);
}

}
