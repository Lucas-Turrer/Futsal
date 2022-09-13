package unlam.pb2;

import java.util.ArrayList;



public class Equipo {
	private ArrayList <Jugador> jugadoresDelEquipo = new ArrayList <Jugador> ();
	private String nombreDelEquipo;
	private Double valorActualDelEquipo = 0.00;
	private Integer sumaDeEdad = 0;
	private Integer promedioDeEdad = 0;

	public Equipo(String nombreDelEquipo) {
		this.nombreDelEquipo = nombreDelEquipo;
	}

	public void agregarJugador(Jugador jugadorParaAgregar) {
		jugadoresDelEquipo.add(jugadorParaAgregar);
	}

	public Integer cantidadDeJugadores() {
		return jugadoresDelEquipo.size();
	}

	public Double valorDelEquipo() {
		for (Jugador jugador : jugadoresDelEquipo) {
			valorActualDelEquipo = jugador.getValorDelJugador() + valorActualDelEquipo;
		}
		return valorActualDelEquipo;
	}

	public Integer promedioDeEdad() {
		for (Jugador jugador : jugadoresDelEquipo) {
			sumaDeEdad = jugador.getEdad() + sumaDeEdad;
			promedioDeEdad = sumaDeEdad / jugadoresDelEquipo.size();
		}
		return promedioDeEdad;
	}

	public String getNombreDelEquipo() {
		return nombreDelEquipo;
	}

	public void setNombreDelEquipo(String nombreDelEquipo) {
		this.nombreDelEquipo = nombreDelEquipo;
	}

	public Boolean verificarJugador(Jugador jugadorBuscado) {
		if(jugadoresDelEquipo.contains(jugadorBuscado)) {
			return true;
		}
		return false;
	}
	
	

}
