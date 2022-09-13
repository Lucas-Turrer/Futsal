package unlam.pb2;

public class Jugador {
	private String apellido;
	private String nombre;
	private Integer numeroDelJugador;
	private Integer edad;
	private Double valorDelJugador;
	private Integer dni;

	public Jugador(String apellido, String nombre, Integer numeroDelJugador, Integer edad, Double valorDelJugador, Integer dni) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.numeroDelJugador = numeroDelJugador;
		this.edad = edad;
		this.valorDelJugador = valorDelJugador;
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumeroDelJugador() {
		return numeroDelJugador;
	}

	public void setNumeroDelJugador(Integer numeroDelJugador) {
		this.numeroDelJugador = numeroDelJugador;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getValorDelJugador() {
		return valorDelJugador;
	}

	public void setValorDelJugador(Double valorDelJugador) {
		this.valorDelJugador = valorDelJugador;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	
	

}
