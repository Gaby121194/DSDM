package com.example.persona.entities.Paquete1;

import com.example.persona.entities.Base;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
	
		
@Entity
@Table(name= "localidad")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
	

public class Localidad	extends Base
{
@Column(name = "denominacion")
	private  String denominacion;




	
}
