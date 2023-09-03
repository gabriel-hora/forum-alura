package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class TopicoService(private var topicos: List<Topico>) {

    init {
        val topico = Topico(
                id = 1,
                titulo = "Dúvida Kotlin",
                mensagem = "Variáveis do Kotlin",
                curso = Curso(
                        id = 1,
                        nome = "Kotlin",
                        categoria = "Programação"
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Ana da Silva",
                        email = "ana@email.com"
                )
        )

        val topico2 = Topico(
                id = 2,
                titulo = "Kotlin intermediário",
                mensagem = "Variáveis do Kotlin",
                curso = Curso(
                        id = 1,
                        nome = "Kotlin",
                        categoria = "Programação"
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Ana da Silva",
                        email = "ana@email.com"
                )
        )

        val topico3 = Topico(
                id = 3,
                titulo = "Kotlin avançado",
                mensagem = "Variáveis do Kotlin",
                curso = Curso(
                        id = 1,
                        nome = "Kotlin",
                        categoria = "Programação"
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Ana da Silva",
                        email = "ana@email.com"
                )
        )

        topicos = listOf(topico, topico2, topico3)
    }

    fun listar(): List<Topico> {
        return topicos
    }


    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
    }
}