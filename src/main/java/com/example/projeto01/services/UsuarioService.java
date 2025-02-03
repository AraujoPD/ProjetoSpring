package com.example.projeto01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto01.entities.Usuario;
import com.example.projeto01.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List <Usuario> procuraTodos(){
		
		return repository.findAll();
	}
	
	public Usuario procurarPorId (Integer id) {
		return repository.findById(id).get();
	}
	
	public String adicionaUsuario (Usuario usuario) {
		repository.save(usuario);
		return "Usuário adicionado com sucesso!";	
	}
	
	public String editarUsuario (Integer id, Usuario usuario) {
		Usuario response = repository.findById(id).get();
		
		response.setNome(usuario.getNome());
		response.setEmail(usuario.getEmail());
		response.setSenha(usuario.getSenha());
		
		repository.save(response);
		return "usuario editado com sucesso";
	}
	
	public void excluirUsuario (Integer id) {
		
		Usuario response = repository.findById(id).get();
		repository.delete(response);
	}
	
	
}