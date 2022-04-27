package ma.emsi.javaap.repositories;

import ma.emsi.javaap.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientReository extends JpaRepository<Patient,Long> {
}
