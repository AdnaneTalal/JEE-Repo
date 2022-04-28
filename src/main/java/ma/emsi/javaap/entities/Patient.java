package ma.emsi.javaap.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor
@Entity

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nom   ;
    @Temporal(TemporalType.DATE)
    private Date dateNaisssance    ;
    private  boolean malade         ;
    private  int score;
}
