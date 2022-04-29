package notas

import kotlin.system.exitProcess

class Menus {

    init {
        println("Seja bem vindo(a) ao sistema de notas de Sim City\n")
    }

    fun menuPrincipal() {

        while (true) {
            println("***************************\n" +
                    "ESCOLA CATALISA DE SIM CITY\n" +
                    "             *             \n" +
                    "Sistema de Cálculo de Notas\n" +
                    "***************************\n")

            println("1 - Inserir notas das avaliações")
            println("2 - Alterar nota inserida")
            println("3 - Calcular média semestral")
            println("4 - Sair do sistema\n")

            println("Digite a opção desejada: ")

            when (readln()) {

                "1" -> {
                    sistemaDeNotas.recebeNotas()
                }
                "2" -> {
                    sistemaDeNotas.alteraNota()
                }
                "3" -> {
                    sistemaDeNotas.calculaMedia()

                }
                "4" -> {
                    println("Obrigado(a) por utilizar nosso sistema!")
                    exitProcess(0)
                }
            }
        }

    }

    fun menuNovoCalculo() {
        println(
            "Cálculo finalizado!\n" +
                    "Deseja efetuar um novo cálculo?\n" +
                    "1 - SIM | 2 - NÃO",
        )

        when (readln().toInt()) {
            1 -> {
                println("Ok, redirecionando para novo cálculo!\n\n")
            }
            2 -> {
                println("Obrigado(a) por utilizar nosso sistema!\n")
                exitProcess(0)
            }
            else -> {
                println("Digite uma opção válida para continuar.")
                menuNovoCalculo()
            }
        }
    }

    companion object ObjNota {

            private val sistemaDeNotas: Nota = Nota(0.0,DoubleArray(4))

    }


}