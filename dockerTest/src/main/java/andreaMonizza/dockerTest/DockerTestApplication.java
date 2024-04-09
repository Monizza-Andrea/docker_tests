package andreaMonizza.dockerTest;

import andreaMonizza.dockerTest.Utente.EntityUtente;
import andreaMonizza.dockerTest.Utente.Poteri;
import andreaMonizza.dockerTest.Utente.RepositoryUtente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class DockerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerTestApplication.class, args);

    }

    @Bean
    public CommandLineRunner commandLineRunner(RepositoryUtente repo) {
        EntityUtente utenteCompleto = new EntityUtente();
        utenteCompleto.setUsername("Saix");
        utenteCompleto.setPassword("sicche");
        ArrayList<Poteri> poteri = new ArrayList<>();
        poteri.add(Poteri.ADMIN);
        poteri.add(Poteri.SUPERUTENTE);
        poteri.add(Poteri.UTENTEBASE);
        utenteCompleto.setPoteri(poteri);
        return args -> {
            repo.save(utenteCompleto);
        };
    }

}
