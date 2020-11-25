package com.example.persona.entities.Paquete1;

import com.example.persona.entities.Base;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
	
		
@Entity
@Table(name= "persona")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
	

public class Persona extends Base
{

@Column(name = "nombre")
	private  String nombre;
@Column(name = "apellido")
	private  String apellido;
@Column(name = "dni")
	private  int dni;





			@OneToOne(cascade= CascadeType.PERSIST)
			@JoinColumn(name="fk_Domicilio")
		private Domicilio haciaDomicilio;



			@OneToMany(cascade=CascadeType.MERGE, orphanRemoval=true)
			
		private List<Libro> haciaLibro = new ArrayList<Libro>();



	
}
