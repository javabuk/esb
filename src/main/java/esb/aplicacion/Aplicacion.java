package esb.aplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import esb.entidades.Error;
import esb.repositorios.MongoErrorRepositorio;

@SpringBootApplication
@ComponentScan({ "esb.repositorios" })
@EnableMongoRepositories(basePackages = "esb.repositorios")
@Configuration
public class Aplicacion implements CommandLineRunner {

    @Autowired
    private MongoErrorRepositorio repositorioError;

    public static void main(String[] args) {
	SpringApplication.run(Aplicacion.class, args);
    }

    public void run(String... args) throws Exception {

	repositorioError.save(new Error("22", "Sabado"));

	/*
	 * repository.deleteAll();
	 * 
	 * // save a couple of customers repository.save(new Customer("Alice",
	 * "Smith")); repository.save(new Customer("Bob", "Smith"));
	 * 
	 * // fetch all customers
	 * System.out.println("Customers found with findAll():");
	 * System.out.println("-------------------------------"); for (Customer
	 * customer : repository.findAll()) { System.out.println(customer); }
	 * System.out.println();
	 * 
	 * // fetch an individual customer
	 * System.out.println("Customer found with findByFirstName('Alice'):");
	 * System.out.println("--------------------------------");
	 * System.out.println(repository.findByFirstName("Alice"));
	 * 
	 * System.out.println("Customers found with findByLastName('Smith'):");
	 * System.out.println("--------------------------------"); for (Customer
	 * customer : repository.findByLastName("Smith")) {
	 * System.out.println(customer); }
	 */
    }
}
