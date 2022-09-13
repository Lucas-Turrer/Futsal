package TestFutsal;

import static org.junit.Assert.*;

import org.junit.Test;

import unlam.pb2.Equipo;
import unlam.pb2.Evento;
import unlam.pb2.Jugador;
import unlam.pb2.Partido;
import unlam.pb2.TipoDeEvento;

public class TestFutsal {

	@Test
	public void QueSeCreaUnJugador() {
		Jugador arquero = new Jugador ("Romero", "Agustin", 1, 26, 1500.00, 37931874);
		assertNotNull(arquero);
	}
	
	@Test
	public void QueSeCreaUnEquipo() {
		Jugador arquero = new Jugador ("Romero", "Agustin", 1, 26, 1500.00, 37931874);
		Equipo realMadrid = new Equipo ("Real Madrid");
		
		realMadrid.agregarJugador(arquero);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = realMadrid.cantidadDeJugadores();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void CalcularValorDelEquipo() {
		Jugador arquero = new Jugador ("Romero", "Agustin", 1, 26, 1500.00, 37931874);
		Jugador defensor = new Jugador ("Palacio", "Matias", 3, 18, 2000.50, 25556895);
		Equipo realMadrid = new Equipo ("Real Madrid");
		
		realMadrid.agregarJugador(arquero);
		realMadrid.agregarJugador(defensor);
		
		Double valorEsperado = 3500.50;
		Double valorObtenido = realMadrid.valorDelEquipo();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void CalcularPromedioDeEdadDelEquipo() {
		Jugador arquero = new Jugador ("Romero", "Agustin", 1, 26, 1500.00, 37931874);
		Jugador defensor = new Jugador ("Palacio", "Matias", 3, 18, 2000.50, 25556895);
		Equipo realMadrid = new Equipo ("Real Madrid");
		
		realMadrid.agregarJugador(arquero);
		realMadrid.agregarJugador(defensor);
		
		Integer valorEsperado = 22;
		Integer valorObtenido = realMadrid.promedioDeEdad();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSeMarcaUnGolEnUnPartido() {
		Jugador arquero = new Jugador ("Romero", "Agustin", 1, 26, 1500.00, 37931874);
		Jugador defensor = new Jugador ("Palacio", "Matias", 3, 18, 2000.50, 25556895);
		Jugador delantero1 = new Jugador ("Vega", "Mauro", 5, 28, 1000.50, 254869335);
		Jugador delantero2 = new Jugador ("Macconel", "Emilio", 10, 22, 2000.50, 12345689);
		Jugador delantero3 = new Jugador ("Venutti", "Cristian", 9, 20, 2000.50, 2658525);
		
		Equipo realMadrid = new Equipo ("Real Madrid");
		
		realMadrid.agregarJugador(arquero);
		realMadrid.agregarJugador(defensor);
		realMadrid.agregarJugador(delantero1);
		realMadrid.agregarJugador(delantero2);
		realMadrid.agregarJugador(delantero3);
		
		Jugador arquero0 = new Jugador ("Romero", "Agustin", 1, 26, 1500.00, 25486354);
		Jugador defensor1 = new Jugador ("Palacio", "Matias", 3, 18, 2000.50, 22125985);
		Jugador delantero01 = new Jugador ("Vega", "Mauro", 5, 28, 1000.50, 37832145);
		Jugador delantero02 = new Jugador ("Macconel", "Emilio", 10, 22, 2000.50, 25485636);
		Jugador delantero03 = new Jugador ("Venutti", "Cristian", 9, 20, 2000.50, 25458666);
		
		Equipo barcelona = new Equipo ("Barcelona");
		
		barcelona.agregarJugador(arquero0);
		barcelona.agregarJugador(defensor1);
		barcelona.agregarJugador(delantero01);
		barcelona.agregarJugador(delantero02);
		barcelona.agregarJugador(delantero03);
		
		Partido fecha01 = new Partido (realMadrid, barcelona);
		
		Evento evento1 = new Evento (TipoDeEvento.Gol, delantero03, 22.50);
		
		fecha01.eventoOcurrido(evento1);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = fecha01.golesDelVisitante();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSeAmonestaAlJugador() {
		Jugador arquero = new Jugador ("Romero", "Agustin", 1, 26, 1500.00, 37931874);
		Jugador defensor = new Jugador ("Palacio", "Matias", 3, 18, 2000.50, 25556895);
		Jugador delantero1 = new Jugador ("Vega", "Mauro", 5, 28, 1000.50, 254869335);
		Jugador delantero2 = new Jugador ("Macconel", "Emilio", 10, 22, 2000.50, 12345689);
		Jugador delantero3 = new Jugador ("Venutti", "Cristian", 9, 20, 2000.50, 2658525);
		
		Equipo realMadrid = new Equipo ("Real Madrid");
		
		realMadrid.agregarJugador(arquero);
		realMadrid.agregarJugador(defensor);
		realMadrid.agregarJugador(delantero1);
		realMadrid.agregarJugador(delantero2);
		realMadrid.agregarJugador(delantero3);
		
		Jugador arquero0 = new Jugador ("Romero", "Agustin", 1, 26, 1500.00, 25486354);
		Jugador defensor1 = new Jugador ("Palacio", "Matias", 3, 18, 2000.50, 22125985);
		Jugador delantero01 = new Jugador ("Vega", "Mauro", 5, 28, 1000.50, 37832145);
		Jugador delantero02 = new Jugador ("Macconel", "Emilio", 10, 22, 2000.50, 25485636);
		Jugador delantero03 = new Jugador ("Venutti", "Cristian", 9, 20, 2000.50, 25458666);
		
		Equipo barcelona = new Equipo ("Barcelona");
		
		barcelona.agregarJugador(arquero0);
		barcelona.agregarJugador(defensor1);
		barcelona.agregarJugador(delantero01);
		barcelona.agregarJugador(delantero02);
		barcelona.agregarJugador(delantero03);
		
		Partido fecha01 = new Partido (realMadrid, barcelona);
		
		Evento evento1 = new Evento (TipoDeEvento.Amonestacion,delantero03, 22.50);
		
		fecha01.eventoOcurrido(evento1);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = fecha01.amonestacionesDelVisitante();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueSeExpulsaUnJugador() {
		Jugador arquero = new Jugador ("Romero", "Agustin", 1, 26, 1500.00, 37931874);
		Jugador defensor = new Jugador ("Palacio", "Matias", 3, 18, 2000.50, 25556895);
		Jugador delantero1 = new Jugador ("Vega", "Mauro", 5, 28, 1000.50, 254869335);
		Jugador delantero2 = new Jugador ("Macconel", "Emilio", 10, 22, 2000.50, 12345689);
		Jugador delantero3 = new Jugador ("Venutti", "Cristian", 9, 20, 2000.50, 2658525);
		
		Equipo realMadrid = new Equipo ("Real Madrid");
		
		realMadrid.agregarJugador(arquero);
		realMadrid.agregarJugador(defensor);
		realMadrid.agregarJugador(delantero1);
		realMadrid.agregarJugador(delantero2);
		realMadrid.agregarJugador(delantero3);
		
		Jugador arquero0 = new Jugador ("Romero", "Agustin", 1, 26, 1500.00, 25486354);
		Jugador defensor1 = new Jugador ("Palacio", "Matias", 3, 18, 2000.50, 22125985);
		Jugador delantero01 = new Jugador ("Vega", "Mauro", 5, 28, 1000.50, 37832145);
		Jugador delantero02 = new Jugador ("Macconel", "Emilio", 10, 22, 2000.50, 25485636);
		Jugador delantero03 = new Jugador ("Venutti", "Cristian", 9, 20, 2000.50, 25458666);
		
		Equipo barcelona = new Equipo ("Barcelona");
		
		barcelona.agregarJugador(arquero0);
		barcelona.agregarJugador(defensor1);
		barcelona.agregarJugador(delantero01);
		barcelona.agregarJugador(delantero02);
		barcelona.agregarJugador(delantero03);
		
		Partido fecha01 = new Partido (realMadrid, barcelona);
		
		Evento evento1 = new Evento (TipoDeEvento.Expulsion,delantero03, 22.50);
		
		fecha01.eventoOcurrido(evento1);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = fecha01.expulsionDelVisitante();
		
		assertEquals(valorEsperado, valorObtenido);
	}

}
