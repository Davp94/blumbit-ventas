package com.blumbit.demo.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDto {

    public String username;

    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8,20}$")
    public String password;

    @Pattern(regexp = "")
    public String dni;

    @Pattern(regexp = "")
    public String celular;

    @Email
    public String email;
}
