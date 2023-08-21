package org.miscusi.backdev.api;

import java.util.logging.Logger;

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

    private final Logger logger;

    public MenuApiController(Logger globalLogger) {
        this.logger = globalLogger;
    }

    @PostMapping(path = "/create", consumes = "application/json")
    public ResponseEntity<Menu> apiCreate(@RequestBody Menu menu) {
        logger.info("POST /api/menu/create called");

        Menu newMenu = menuServ.save(menu);

        return new ResponseEntity<>(newMenu, HttpStatus.OK);
    }

    @PutMapping(path = "/update", consumes = "application/json")
    public ResponseEntity<Menu> apiUpdate(@RequestBody Menu menu) {
        logger.info("POST /api/menu/update called");

        Menu updatedMenu = menuServ.save(menu);

        return new ResponseEntity<>(updatedMenu, HttpStatus.OK);
    }
}
