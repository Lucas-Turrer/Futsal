package unlam.pb2;

import java.util.ArrayList;

public class Partido {
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private ArrayList <Evento> golesEquipoLocal = new ArrayList <Evento> ();
	private ArrayList <Evento> golesEquipoVisitante = new ArrayList <Evento> ();
	private ArrayList <Evento> amonestacionesEquipoLocal = new ArrayList <Evento> ();
	private ArrayList <Evento> amonestacionesEquipoVisitante = new ArrayList <Evento> ();
	private ArrayList <Evento> expulsionesEquipoLocal = new ArrayList <Evento> ();
	private ArrayList <Evento> expulsionesEquipoVisitante = new ArrayList <Evento> ();

	public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
	}

	public void eventoOcurrido(Evento evento) {
		if(evento.getEvento()== TipoDeEvento.Gol) {
			if(equipoLocal.verificarJugador(evento.getJugadorInvolucrado())){
				golesEquipoLocal.add(evento);
			} else {golesEquipoVisitante.add(evento);
					}
		}else {
			if(evento.getEvento()== TipoDeEvento.Amonestacion) {
				if(equipoLocal.verificarJugador(evento.getJugadorInvolucrado())){
					amonestacionesEquipoLocal.add(evento);
				} else {amonestacionesEquipoVisitante.add(evento);
						}
			} else { if(evento.getEvento()== TipoDeEvento.Expulsion) {
				if(equipoLocal.verificarJugador(evento.getJugadorInvolucrado())){
					expulsionesEquipoLocal.add(evento);
				} else {expulsionesEquipoVisitante.add(evento);
						}
			} 	
			}
		}
	}

	public Integer golesDelVisitante() {
		return golesEquipoVisitante.size();
	}

	public Integer amonestacionesDelVisitante() {
		return amonestacionesEquipoVisitante.size();
	}

	public Integer expulsionDelVisitante() {
		return expulsionesEquipoVisitante.size();
	}

	

	

	

}
