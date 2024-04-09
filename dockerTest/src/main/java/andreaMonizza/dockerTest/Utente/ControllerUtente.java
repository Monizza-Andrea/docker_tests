package andreaMonizza.dockerTest.Utente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/utente")
public class ControllerUtente {

    @Autowired
    private ServiceUtente serviceUtente;


    @GetMapping("/{id}")
    public EntityUtente getUtente (@PathVariable Long id){
        return serviceUtente.getUtente(id);
    }

    @GetMapping("/")
    @ResponseStatus(value = HttpStatus.OK)
    public List<EntityUtente> getAllUtenti (){
        return serviceUtente.getAllUtenti();
    }

    @PostMapping("/crea")
    @ResponseStatus(value = HttpStatus.OK)
    public EntityUtente creaUtente (@RequestBody EntityUtente utenteDaCreare){
        return serviceUtente.creaUtente(utenteDaCreare);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean cancellaUtente (@PathVariable Long id){
        return serviceUtente.cancellaUtente(id);
    }
}
