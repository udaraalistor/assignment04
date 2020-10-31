package lk.ijse.assignment;

import lk.ijse.assignment.data.Mesaage;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
public class MyRestController {

    @GetMapping("api/hello")
    public Mesaage greeding () {
        Mesaage mesaage = new Mesaage();
        mesaage.setSender("Server");
        mesaage.setMessaage("Hello World");
        mesaage.getSentTime(new Date());
        return mesaage;

    }

    @GetMapping("api/message")
    public Mesaage messageBuilder (
            @RequestParam("username")
                    String user,
            @RequestParam("message")
                    String message
    ) {

        Mesaage mesaage = new Mesaage();
        mesaage.setSender(user);
        mesaage.setMessaage(message);
        mesaage.getSentTime(new Date());
        return mesaage;

    }

    @RequestMapping(value= "/api/message", method = RequestMethod.POST)
    public Mesaage createMessage(@RequestBody() Mesaage mesaage){
        System.out.println(mesaage);
        return mesaage;
    }

}


