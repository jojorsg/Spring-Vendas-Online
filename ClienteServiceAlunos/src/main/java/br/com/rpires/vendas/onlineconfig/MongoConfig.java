/**
 * 
 */
package br.com.jojo.vendas.onlineconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author jojorsg
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.jojo.vendas.online.repository")
public class MongoConfig {

}
