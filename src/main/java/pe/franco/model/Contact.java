package pe.franco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacto")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codcontacto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="mensaje")
	private String mensaje;
	
	public Contact() {
	}
	
	public Contact(int codcontacto, String nombre, String correo, String mensaje) {
		super();
		this.codcontacto = codcontacto;
		this.nombre = nombre;
		this.correo = correo;
		this.mensaje = mensaje;
	}

	public int getCodcontacto() {
		return codcontacto;
	}

	public void setCodcontacto(int codcontacto) {
		this.codcontacto = codcontacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}