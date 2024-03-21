package com.blumbit.demo.service.impl;

import com.blumbit.demo.persistence.entities.Persona;
import com.blumbit.demo.persistence.repository.PersonaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserSecurityService implements UserDetailsService {

    private final PersonaRepository personaRepository;

    public UserSecurityService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Persona persona = this.personaRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario "+ username+ " no encontrado."));
        return User.builder()
                .username(persona.getUsername())
                .password(persona.getPassword())
                .accountLocked(persona.isLocked())
                .build();
    }
}
