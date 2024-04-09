package andreaMonizza.dockerTest.Utente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceUtente {

    @Autowired
    private RepositoryUtente repositoryUtente;

    private Optional<EntityUtente> findUtente (Long id){
        return repositoryUtente.findById(id);
    }
    public EntityUtente getUtente (Long id){
        Optional<EntityUtente> utente= findUtente(id);
        return utente.isEmpty() ? null : utente.get();
    }

    public List<EntityUtente> getAllUtenti (){
        return repositoryUtente.findAll();
    }

    public EntityUtente creaUtente ( EntityUtente utenteDaCreare){
        return repositoryUtente.save(utenteDaCreare);
    }

    public boolean cancellaUtente (Long id){
        Optional<EntityUtente> utente=findUtente(id);
        if (utente.isEmpty())
            return false;
        repositoryUtente.delete(utente.get());
        return false;
    }
}
