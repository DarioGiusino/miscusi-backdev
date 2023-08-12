package org.miscusi.backdev.serv;

import java.util.List;
import java.util.Optional;

import org.miscusi.backdev.pojo.Menu;
import org.miscusi.backdev.repo.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServ {
	
	@Autowired
	private MenuRepo menuRepo;
	
	public List<Menu> findAll() {
		
		return menuRepo.findAll();
	}
	
	public Menu save(Menu menu) {
		
		return menuRepo.save(menu);
	}
	
	public Optional<Menu> findById(int id) {
		
		return menuRepo.findById(id);
	}
	
	public void delete(Menu menu) {
		
		menuRepo.delete(menu);
	}
}
