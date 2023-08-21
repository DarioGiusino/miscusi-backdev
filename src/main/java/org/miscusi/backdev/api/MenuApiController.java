package org.miscusi.backdev.api;

import org.miscusi.backdev.pojo.Menu;
import org.miscusi.backdev.serv.MenuServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin
@RequestMapping("api/menu")
public class MenuApiController {

    @Autowired
    MenuServ menuServ;

    @PostMapping(path = "/create", consumes = "application/json")
    public ResponseEntity<Menu> apiCreate(@RequestBody Menu menu) {
        Menu newMenu = menuServ.save(menu);

        return new ResponseEntity<>(newMenu, HttpStatus.OK);
    }

    @PutMapping(path = "/update", consumes = "application/json")
    public ResponseEntity<Menu> apiUpdate(@RequestBody Menu menu) {
        Menu updatedMenu = menuServ.save(menu);

        return new ResponseEntity<>(updatedMenu, HttpStatus.OK);
    }
}
