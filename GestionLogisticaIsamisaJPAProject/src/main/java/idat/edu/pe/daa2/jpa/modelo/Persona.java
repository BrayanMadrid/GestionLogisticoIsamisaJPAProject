package idat.edu.pe.daa2.jpa.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional=false)
	@Column (name="ID_PERSONA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID_PERSONA;
	@Column (name="NOM1_PERSONA")
	private String NOM1_PERSONA;
	@Column (name="NOM2_PERSONA")
	private String NOM2_PERSONA;
	@Column (name="APE_PAT_PERSONA")
	private String APE_PAT_PERSONA;
	@Column (name="APE_MAT_PERSONA")
	private String APE_MAT_PERSONA;
	@Column (name="DNI_PERSONA")
	private Integer DNI_PERSONA;
	@Column (name="RUC_PERSONA")
	private Integer RUC_PERSONA;
	@JoinColumn (name = "ID_CIUDAD", referencedColumnName = "ID_CIUDAD")
	@ManyToOne (optional=false)
	private Ciudad ID_CIUDAD;
	@JoinColumn (name = "ID_TIPO_PERSONA", referencedColumnName = "ID_TIPO_PERSONA")
	@ManyToOne (optional=false)
	private TipoPersona ID_TIPO_PERSONA;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nOM1_PERSONA, String nOM2_PERSONA, String aPE_PAT_PERSONA, String aPE_MAT_PERSONA,
			Integer dNI_PERSONA, Integer rUC_PERSONA) {
		super();
		NOM1_PERSONA = nOM1_PERSONA;
		NOM2_PERSONA = nOM2_PERSONA;
		APE_PAT_PERSONA = aPE_PAT_PERSONA;
		APE_MAT_PERSONA = aPE_MAT_PERSONA;
		DNI_PERSONA = dNI_PERSONA;
		RUC_PERSONA = rUC_PERSONA;
	}

	public Integer getID_PERSONA() {
		return ID_PERSONA;
	}

	public void setID_PERSONA(Integer iD_PERSONA) {
		ID_PERSONA = iD_PERSONA;
	}

	public String getNOM1_PERSONA() {
		return NOM1_PERSONA;
	}

	public void setNOM1_PERSONA(String nOM1_PERSONA) {
		NOM1_PERSONA = nOM1_PERSONA;
	}

	public String getNOM2_PERSONA() {
		return NOM2_PERSONA;
	}

	public void setNOM2_PERSONA(String nOM2_PERSONA) {
		NOM2_PERSONA = nOM2_PERSONA;
	}

	public String getAPE_PAT_PERSONA() {
		return APE_PAT_PERSONA;
	}

	public void setAPE_PAT_PERSONA(String aPE_PAT_PERSONA) {
		APE_PAT_PERSONA = aPE_PAT_PERSONA;
	}

	public String getAPE_MAT_PERSONA() {
		return APE_MAT_PERSONA;
	}

	public void setAPE_MAT_PERSONA(String aPE_MAT_PERSONA) {
		APE_MAT_PERSONA = aPE_MAT_PERSONA;
	}

	public Integer getDNI_PERSONA() {
		return DNI_PERSONA;
	}

	public void setDNI_PERSONA(Integer dNI_PERSONA) {
		DNI_PERSONA = dNI_PERSONA;
	}

	public Integer getRUC_PERSONA() {
		return RUC_PERSONA;
	}

	public void setRUC_PERSONA(Integer rUC_PERSONA) {
		RUC_PERSONA = rUC_PERSONA;
	}

	public Ciudad getID_CIUDAD() {
		return ID_CIUDAD;
	}

	public void setID_CIUDAD(Ciudad iD_CIUDAD) {
		ID_CIUDAD = iD_CIUDAD;
	}

	public TipoPersona getID_TIPO_PERSONA() {
		return ID_TIPO_PERSONA;
	}

	public void setID_TIPO_PERSONA(TipoPersona iD_TIPO_PERSONA) {
		ID_TIPO_PERSONA = iD_TIPO_PERSONA;
	}
	

}
