package com.authenticates.authenticates.services;

import com.authenticates.authenticates.models.Usuario;
import com.authenticates.authenticates.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    public void salvarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

}
