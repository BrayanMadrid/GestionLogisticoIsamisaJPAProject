package idat.edu.pe.daa2.jpa.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_persona")
public class TipoPersona implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional=false)
	@Column (name="ID_TIPO_PERSONA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID_TIPO_PERSONA;
	@Column (name="DESC_TIPO_PERSONA")
	private String DESC_TIPO_PERSONA;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ID_TIPO_PERSONA")
	private List<Persona> personaList;
	 
	public TipoPersona() {
		// TODO Auto-generated constructor stub
	}

	public TipoPersona(String dESC_TIPO_PERSONA) {
		DESC_TIPO_PERSONA = dESC_TIPO_PERSONA;
	}

	public Integer getID_TIPO_PERSONA() {
		return ID_TIPO_PERSONA;
	}

	public void setID_TIPO_PERSONA(Integer iD_TIPO_PERSONA) {
		ID_TIPO_PERSONA = iD_TIPO_PERSONA;
	}

	public String getDESC_TIPO_PERSONA() {
		return DESC_TIPO_PERSONA;
	}

	public void setDESC_TIPO_PERSONA(String dESC_TIPO_PERSONA) {
		DESC_TIPO_PERSONA = dESC_TIPO_PERSONA;
	}

	public List<Persona> getPersonaList() {
		return personaList;
	}

	public void setPersonaList(List<Persona> personaList) {
		this.personaList = personaList;
	}

}
