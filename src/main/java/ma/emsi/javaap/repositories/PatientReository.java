package ma.emsi.javaap.repositories;

import ma.emsi.javaap.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.xml.crypto.Data;
import java.util.List;

public interface PatientReository extends JpaRepository<Patient,Long> {

    List<Patient> findByMalade(Boolean m);
    Page<Patient> findByMalade(Boolean m , Pageable pa);
    //@Query("select Patient from Patient where Patient.dateNaisssance BETWEEN :x and :y or Patient .nom like :n")
    //List<Patient> rechercePatient(@Param(":x") Data d1, @Param(":y")Data  d2,@Param(":n") String nom);
}
