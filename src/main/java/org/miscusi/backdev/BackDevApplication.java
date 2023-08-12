package org.miscusi.backdev;

import org.miscusi.backdev.pojo.Menu;
import org.miscusi.backdev.pojo.Product;
import org.miscusi.backdev.serv.MenuServ;
import org.miscusi.backdev.serv.ProductServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackDevApplication implements CommandLineRunner {

	@Autowired
	private MenuServ menuServ;

	@Autowired
	private ProductServ productServ;

	public static void main(String[] args) {
		SpringApplication.run(BackDevApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Menu m1 = new Menu("menu1", "description1");
		menuServ.save(m1);

		Product p1 = new Product("product1", "descrprod1", 7.24f, m1);
		productServ.save(p1);

	}
}
