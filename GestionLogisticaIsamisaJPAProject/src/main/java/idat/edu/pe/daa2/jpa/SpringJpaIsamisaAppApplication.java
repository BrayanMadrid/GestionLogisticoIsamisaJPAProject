package idat.edu.pe.daa2.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import idat.edu.pe.daa2.jpa.modelo.Ciudad;
import idat.edu.pe.daa2.jpa.modelo.Departamento;
import idat.edu.pe.daa2.jpa.modelo.Pais;
import idat.edu.pe.daa2.jpa.modelo.Persona;
import idat.edu.pe.daa2.jpa.modelo.TipoPersona;
import idat.edu.pe.daa2.jpa.servicios.DepartamentoServicio;
import idat.edu.pe.daa2.jpa.servicios.PaisServicio;
import idat.edu.pe.daa2.jpa.servicios.PersonaServicio;
import idat.edu.pe.daa2.jpa.servicios.TipoPersonaServicio;
import idat.edu.pe.daa2.jpa.servicios.CiudadServicio;

@SpringBootApplication
public class SpringJpaIsamisaAppApplication {
	public static void main(String[] args) {
	ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaIsamisaAppApplication.class, args);
	crearPais(ctx);
	//crearDepartamento(ctx);
	//crearCiudad(ctx);
	//eliminarPais(ctx);
	//eliminarDepartamento(ctx);
	//eliminarCiudad(ctx);
	//actualizarPais(ctx);
	//actualizarDepartamento(ctx);
	//actualizarCiudad(ctx);
	//crearTipoPersona(ctx);
	//crearPersona(ctx);
	
	}
/**
 * 
 * @param ctx
 */
	
//CREACIONES*********************************************************************************************
private static void crearCiudad(ConfigurableApplicationContext ctx) {
		DepartamentoServicio servicioDepartamento = ctx.getBean(DepartamentoServicio.class);
		CiudadServicio servicioCiudad = ctx.getBean(CiudadServicio.class);
		
		Departamento madrid = servicioDepartamento.buscarPorID(1);
		if (madrid != null)
			System.out.println("departamento obtenido");
		// Creando nueva instancia de Pais
		Ciudad valdemoro = new Ciudad("Valdemoro");
		valdemoro.setID_DEP(madrid);
		servicioCiudad.crear(valdemoro);

	}	

private static void crearDepartamento(ConfigurableApplicationContext ctx) {
	PaisServicio servicioPais = ctx.getBean(PaisServicio.class);
	DepartamentoServicio servicioDepartamento = ctx.getBean(DepartamentoServicio.class);
	
	Pais europa = servicioPais.buscarPorID(1);
	if (europa != null)
		System.out.println("pais obtenido");
	// Creando nueva instancia de Pais
	Departamento madrid = new Departamento("Madrid");
	madrid.setID_PAIS(europa);
	servicioDepartamento.crear(madrid);

}	

private static void crearPais(ConfigurableApplicationContext ctx){
		PaisServicio servicio = ctx.getBean(PaisServicio.class);
		Pais colombia = new Pais("Colombia");
		servicio.crear(colombia);
	}

private static void crearTipoPersona(ConfigurableApplicationContext ctx){
	TipoPersonaServicio servicio = ctx.getBean(TipoPersonaServicio.class);
	TipoPersona proveedor = new TipoPersona("Proveedor");
	servicio.crear(proveedor);
}

private static void crearPersona(ConfigurableApplicationContext ctx) {
	TipoPersonaServicio servicioTipoPersona = ctx.getBean(TipoPersonaServicio.class);
	CiudadServicio servicioCiudad = ctx.getBean(CiudadServicio.class);
	PersonaServicio servicioPersona = ctx.getBean(PersonaServicio.class);
	
	TipoPersona proveedor = servicioTipoPersona.buscarPorID(1);
	if (proveedor != null)
		System.out.println("tipo persona obtenida");
	Ciudad ate = servicioCiudad.buscarPorID(1);
	if (ate != null)
		System.out.println("ciudad obtenida");
	// Creando nueva instancia de Pais
	Persona brayan = new Persona("Brayan","Arturo","Madrid","Contreras",75002598,1234567891);
	brayan.setID_TIPO_PERSONA(proveedor);
	brayan.setID_CIUDAD(ate);
	servicioPersona.crear(brayan);

}
//ELIMINACIONES*****************************************************************************************
private static void eliminarPais(ConfigurableApplicationContext ctx) {
	PaisServicio servicioPais = ctx.getBean(PaisServicio.class);
	servicioPais.borrarPorID(1);
}

private static void eliminarDepartamento(ConfigurableApplicationContext ctx) {
	DepartamentoServicio servicioDepartamento = ctx.getBean(DepartamentoServicio.class);
	servicioDepartamento.borrarPorID(1);
}

private static void eliminarCiudad(ConfigurableApplicationContext ctx) {
	CiudadServicio servicioCiudad = ctx.getBean(CiudadServicio.class);
	servicioCiudad.borrarPorID(1);
}

//ACTUALIZACIONES*****************************************************************************************
private static void actualizarCiudad(ConfigurableApplicationContext ctx) {
	DepartamentoServicio servicioDepartamento = ctx.getBean(DepartamentoServicio.class);
	CiudadServicio servicio = ctx.getBean(CiudadServicio.class);
	Departamento Lima = servicioDepartamento.buscarPorID(1);
	if (Lima != null)
		System.out.println("departamento obtenido");
	
	Ciudad ciudad = new Ciudad();
	ciudad.setID_CIUDAD(1);
	ciudad.setDESC_CIUDAD("ATE");
	ciudad.setID_DEP(Lima);
	servicio.actualizar(ciudad);
}

private static void actualizarDepartamento(ConfigurableApplicationContext ctx) {
	PaisServicio servicioPais = ctx.getBean(PaisServicio.class);
	DepartamentoServicio servicio = ctx.getBean(DepartamentoServicio.class);
	Pais Perú = servicioPais.buscarPorID(1);
	if (Perú != null)
		System.out.println("pais obtenido");
	Departamento departamento = new Departamento();
	departamento.setID_DEP(1);
	departamento.setDESC_DEP("Lima");
	departamento.setID_PAIS(Perú);
	servicio.actualizar(departamento);
}

private static void actualizarPais(ConfigurableApplicationContext ctx) {
	PaisServicio servicio = ctx.getBean(PaisServicio.class);
	Pais pais = new Pais();
	pais.setID_PAIS(1);
	pais.setDES_PAIS("Perú");
	servicio.actualizar(pais);
 }

}
