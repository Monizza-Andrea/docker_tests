package andreaMonizza.dockerTest.Utente;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IServiceUtente {


    ResponseEntity<?> getUtente (Long id);

    List<EntityUtente> getAllUtenti ();

    EntityUtente creaUtente (EntityUtente utenteDaCreare);

    ResponseEntity<?> cancellaUtente (Long id);
}
