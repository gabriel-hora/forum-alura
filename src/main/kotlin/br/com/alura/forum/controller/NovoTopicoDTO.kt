package br.com.alura.forum.controller

data class NovoTopicoDTO(
        val titulo: String,
        val mensagem: String,
        val idCurso: Long,
        val idAutor: Long
)
