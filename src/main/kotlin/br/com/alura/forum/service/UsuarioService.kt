package br.com.alura.forum.service

import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService(private var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario(
                id = 1,
                nome = "Gabriel Hora",
                email = "gabriel@hora.com"
        )

        val usuario2 = Usuario(
                id = 2,
                nome = "Gustavo Carmo",
                email = "gustavo@carmo.com"
        )

        usuarios = listOf(usuario, usuario2)
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter {
            it.id == id
        }.findFirst().get()
    }

}
