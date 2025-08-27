package org.example.entidades

import org.example.enumeradores.Sexo

open class Pessoa(
    val nome : String,
    val idade : Int,
    val cpf : Long,
    sexo : Sexo,
)
{
}