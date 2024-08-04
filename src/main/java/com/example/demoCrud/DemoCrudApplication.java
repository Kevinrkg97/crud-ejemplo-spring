package com.example.demoCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class DemoCrudApplication {

	private static Logger logger = Logger.getLogger("CrudEjemplo");

	public static void main(String[] args) {
		SpringApplication.run(DemoCrudApplication.class, args);
		logger.log(Level .INFO, "*** EL SERVICIO INICIÓ CORRECTAMENTE ***");
	}

}
