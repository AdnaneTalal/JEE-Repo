package ma.emsi.javaap;

import ma.emsi.javaap.entities.Patient;
import ma.emsi.javaap.repositories.PatientReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JavaApApplication implements CommandLineRunner {
@Autowired
    private PatientReository patientRepo;
    public static void main(String[] args) {

        SpringApplication.run(JavaApApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

 patientRepo.save(
         new Patient(null,"adnane",new Date(),false,12)
         );
        patientRepo.save(
                new Patient(null,"talal",new Date(),true,12)
        );

        System.err.println("**************************************************************************************");
        Page<Patient> patients = patientRepo.findAll(PageRequest.of(0,5));
        System.out.println("total pages! "+patients.getTotalPages());
        System.out.println("total Element! "+patients.getTotalElements());
        System.out.println("page number! "+patients.getNumber());

        Page<Patient> pat = patientRepo.findByMalade(true,PageRequest.of(0,5));
        List<Patient> Pc = pat.getContent();
        List<Patient> content = patients.getContent();


      Pc.forEach(p -> {
          System.out.println("=============================================");
          System.out.println("id patient=\t"+p.getId());
          System.out.println("Nom patient=\t"+p.getNom());
          System.out.println("DateNaissance patient=\t"+p.getDateNaisssance());
          System.out.println("score patient=\t"+p.getScore());
          System.out.println("est il malade? = \t"+p.isMalade());
      });
    }
}
