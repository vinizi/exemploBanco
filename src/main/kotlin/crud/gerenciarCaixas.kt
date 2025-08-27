package org.example.crud

import org.example.entidades.CaixaDAgua
import org.example.enumeradores.Cores
import org.example.enumeradores.Material

fun cadastrarCaixa(){
    /*
    * val material: Material,
    val capacidade : Int,
    val cor : Cores,
    val peso : Double,
    val preco : BigDecimal,
    val dimenssao : Array<Double>
    * PLASTICO, PVC, FIBRA, METAL
     */
    println("Escolha o material do qual a caixa é composta:")
    println("1 - Plástico")
    println("2 - PVC")
    println("3 - Metal")
    println("4 - Fibra")
    val opcao = readln().toInt()
    val material : Material
    when(opcao){
        1 -> material = Material.PLASTICO
        2 -> material = Material.PVC
        3 -> material = Material.METAL
        4 -> material = Material.FIBRA
        else -> material = Material.PLASTICO

    }
    println("Escolha a cor da sua caixa:")
    println("1 - Azul")
    println("2 - Preta")
    println("3 - Branca")
    println("4 - Bege")
    println("5 - Cinza")
    println("6 - Verde")
    println("7 - Metalica")
    val opcaoCores = readln().toInt()
    val cores : Cores
    when(opcao){
        1 -> cores = Cores.AZUL
        2 -> cores = Cores.PRETA
        3 -> cores = Cores.BRANCA
        4 -> cores = Cores.BEGE
        5 -> cores = Cores.CINZA
        6 -> cores = Cores.VERDE
        7 -> cores = Cores.METALICA

        else -> cores = Cores.AZUL

    }
    println("Peso da Caixa:")
    val peso = readln().toDouble()
    println("Capacidade da Caixa em Litros:")
    val capacidade = readln().toDouble()
    println("Preço da Caixa:")
    val preco = readln().toBigDecimal()
    println("Altura da Caixa:")
    val alt = readln().toDouble()
    println("Largura da Caixa:")
    val lag = readln().toDouble()
    println("Profundidade da Caixa:")
    val prof = readln().toDouble()
    //Salvar as variáveis agora dentro da classe
    //Conecte p atributo da Classe a variavel que o usuário digitou

    val dimenssao = arrayOf(alt,lag,prof)
    CaixaDAgua(
        material = material,
        cor = cores,
        peso = peso,
        preco = preco,
        dimenssao = dimenssao,
        capacidade = capacidade,


    )


}
fun editarCaixaa(){

}
fun listarCaixas(){

}
fun excluirCaixa(){

}