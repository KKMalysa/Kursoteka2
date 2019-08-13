package pl.karolmalysa.kursoteka.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.karolmalysa.kursoteka.model.UserDTO;

@RestController
@RequestMapping(value = "/")
public class Controller {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName("Karol");
        userDTO.setLastName("Małysa");
        userDTO.setAdmin(true);
        return "Hello UserDTO";
    }
}
