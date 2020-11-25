package com.example.persona.entities.Paquete1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.persona.entities.Base;
	
		
@Entity
@Table(name= "libro")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
	

public class Libro	extends Base
{
@Column(name = "titulo")
	private  String titulo;
@Column(name = "paginas")
	private  int paginas;
@Column(name = "autor")
	private  String autor;
@Column(name = "")
	private  int fecha;
@Column(name = "genero")
	private  String genero;




	
}
