package com.sw.mongo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sw.mongo.document.Usuario;

public interface UsuarioRepository  extends MongoRepository<Usuario,Serializable>{
	


}
