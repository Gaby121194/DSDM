package com.example.persona.services;

import com.example.persona.entities.Paquete1.Libro;
import com.example.persona.repositories.BaseRepository;
import com.example.persona.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService{

	@Autowired
	private LibroRepository LibroRepository;
	
	public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository){
        super(baseRepository);
    }
}


