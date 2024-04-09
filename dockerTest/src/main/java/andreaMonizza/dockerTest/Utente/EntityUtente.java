package andreaMonizza.dockerTest.Utente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Entity
@Table(name = "Utente")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntityUtente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Enumerated(value = EnumType.STRING)
    private ArrayList<Poteri> poteri;
}
