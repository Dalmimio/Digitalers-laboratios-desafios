
public class Alumno {
	private String id_alumno;
	private Persona datos;
	private Asignatura materia;
	private Carrera carrera;
	
	
	
	public String getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(String id_alumno) {
		this.id_alumno = id_alumno;
	}
	public Persona getDatos() {
		return datos;
	}
	public void setDatos(Persona datos) {
		this.datos = datos;
	}
	public Asignatura getMateria() {
		return materia;
	}
	public void setMateria(Asignatura materia) {
		this.materia = materia;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
	
	
}
