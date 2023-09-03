package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import org.springframework.stereotype.Service

@Service
class CursoService(var cursos: List<Curso>) {

    init {
        val curso1 = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
        )

        val curso2 = Curso(
                id = 2,
                nome = "Java",
                categoria = "Programação"
        )

        cursos = listOf(curso1, curso2)
    }

    fun buscarPorId(id: Long): Curso {
        return cursos.stream().filter {
            it.id == id
        }.findFirst().get()
    }

}
