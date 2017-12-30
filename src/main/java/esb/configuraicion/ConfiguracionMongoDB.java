package esb.configuraicion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

@Configuration
// @EnableMongoRepositories(basePackages = "esb.repositorios")
public class ConfiguracionMongoDB extends AbstractMongoConfiguration {

    @Bean
    public MongoClient mongoClient() {
	return new MongoClient("nasjavabuk", 32769);
    }

    @Override
    protected String getDatabaseName() {
	return "esb";
    }

    /*
     * @Override public Mongo mongo() throws Exception { // TODO Auto-generated
     * method stub return new Mongo("nasjavabuk", 32769); }
     */

}
