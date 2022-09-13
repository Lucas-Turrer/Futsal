package unlam.pb2;

public class Evento {
	private TipoDeEvento evento;
	private Jugador jugadorInvolucrado;
	private Double minutosDelPartido;

	public Evento(TipoDeEvento evento, Jugador jugadorInvolucrado, Double minutosDelPartido) {
		this.evento = evento;
		this.jugadorInvolucrado = jugadorInvolucrado;
		this.minutosDelPartido = minutosDelPartido;
	}

	public TipoDeEvento getEvento() {
		return evento;
	}

	public void setEvento(TipoDeEvento evento) {
		this.evento = evento;
	}

	public Jugador getJugadorInvolucrado() {
		return jugadorInvolucrado;
	}

	public void setJugadorInvolucrado(Jugador jugadorInvolucrado) {
		this.jugadorInvolucrado = jugadorInvolucrado;
	}

	public Double getMinutosDelPartido() {
		return minutosDelPartido;
	}

	public void setMinutosDelPartido(Double minutosDelPartido) {
		this.minutosDelPartido = minutosDelPartido;
	}
	

}
