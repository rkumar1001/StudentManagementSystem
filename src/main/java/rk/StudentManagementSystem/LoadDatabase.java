/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rk.StudentManagementSystem;

/**
 *
 * @author rajat
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(StudentsRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Students("Rajat Kumar", "San Jose","1232334","abc@gmail.com")));
      log.info("Preloading " + repository.save(new Students("Frodo Baggins", "San Francisco","84673874895","xyz@yahoo.com")));
    };
  }
}
