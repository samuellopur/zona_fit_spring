package gm.zona_fit;

import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {
	@Autowired
	private IClienteServicio clienteServicio;
	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);
	String ln = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("Iniciando aplicación");

//		Levanta la fabrica de spring
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Aplicación finalizada");
	}

	@Override
	public void run(String... args) throws Exception {

		zonaFitApp();
	}

	private void zonaFitApp(){
		var salir = false;
		var consola = new Scanner(System.in);
		while (!salir){
			var opcion = mostrarMenu(consola);
//			salir = ejecutarOpciones(consola, opcion);
		}
	}

	private int mostrarMenu(Scanner consola){
		logger.info("""
		\n---------------------------------
		*** Aplicación Zona Fit (GYM) ***
		---------------------------------
		1. Listar cliente
		2. Buscar cliente
		3. Agregar cliente
		4. Modificar cliente
		5. Eliminar cliente
		6. Salir
		Elige una opción:\s""");
        return Integer.parseInt(consola.nextLine());
    }
}
