package notas

class Nota (
    private var media: Double = 0.0,
    private var listaDeNotas: DoubleArray
){

    fun recebeNotas() : DoubleArray {

        println("*** Inserção de notas ***\n")

        for (i in listaDeNotas.indices) {
            println("Digite a ${i+1}a nota do aluno: ")
            val nota = readln().toDouble()
            if (nota in 0.0..10.0) {
                listaDeNotas[i] = nota
                mensagemSucesso()
            } else {
                println("A nota digitada é inválida.\n" +
                        "Insira uma nota válida para continuar\n")
                break
            }
        }

        println("*** Notas inseridas ***\n")
        for (i in listaDeNotas.indices) {
            println("${i + 1}a nota: ${listaDeNotas[i]}")
        }

        println("Confira se estão todas corretas para continuar.\n" +
                "Deseja corrigir as notas inseridas?\n" +
                "1 - SIM | 2 - NÃO\n")

        when (readln().toInt()) {
            1 -> {
                alteraNota()
            }
            2 -> {
                Menus().menuPrincipal()
            }
            else -> {
                println("Opção inválida.")
            }
        }

        return listaDeNotas


    }

    fun calculaMedia(): Double {
        var soma = 0.0
        listaDeNotas.forEachIndexed { i, _ ->

            soma += listaDeNotas[i]
            media = soma / listaDeNotas.size

        }
        mostraMedia()
        Menus().menuNovoCalculo()
        return media
    }

   fun mostraMedia() {
        println("A média final do aluno é $media")
    }

    fun alteraNota() : DoubleArray{

        for (i in listaDeNotas.indices) {
            println("Que nota deseja alterar?\n" +
                    "1 - primeira nota\n" +
                    "2 - segunda nota\n" +
                    "3 - terceira nota\n" +
                    "4 - quarta nota")
            val notaAAlterar = readln().toInt()

            if (notaAAlterar == 1) {

                println("Digite o valor correto: ")
                val novaNota = readln().toDouble()
                listaDeNotas[0] = novaNota

                println("Sua primeira nota agora é ${listaDeNotas[0]}\n")
                println("Lista de notas atualizada:\n")
                for (j in listaDeNotas.indices) {
                    println("${j + 1}a nota: ${listaDeNotas[j]}")
                }

                println("Deseja fazer mais alguma alteração?\n" +
                        "1 - SIM | 2 - NÃO")
                val alteracao = readln().toInt()

                if (alteracao == 1) {
                    alteraNota()
                } else if (alteracao == 2) {
                    Menus().menuPrincipal()
                }

            } else if (notaAAlterar == 2) {

                println("Digite o valor correto: ")
                listaDeNotas[1] = readln().toDouble()

                println("Sua segunda nota agora é ${listaDeNotas[1]}\n")
                println("Lista de notas atualizada:\n")
                for (j in listaDeNotas.indices) {
                    println("${j + 1}a nota: ${listaDeNotas[j]}")
                }

                println("Deseja fazer mais alguma alteração?\n" +
                        "1 - SIM | 2 - NÃO")
                val alteracao = readln().toInt()

                if (alteracao == 1) {
                    alteraNota()
                } else if (alteracao == 2) {
                    Menus().menuPrincipal()
                }

            } else if (notaAAlterar == 3) {

                println("Digite o valor correto: ")
                listaDeNotas[2] = readln().toDouble()

                println("Sua terceira nota agora é ${listaDeNotas[2]}\n")
                println("Lista de notas atualizada:\n")
                for (j in listaDeNotas.indices) {
                    println("${j + 1}a nota: ${listaDeNotas[j]}")
                }

                println("Deseja fazer mais alguma alteração?\n" +
                        "1 - SIM | 2 - NÃO")
                val alteracao = readln().toInt()

                if (alteracao == 1) {
                    alteraNota()
                } else if (alteracao == 2) {
                    Menus().menuPrincipal()
                }

            } else if (notaAAlterar == 4) {

                println("Digite o valor correto: ")
                listaDeNotas[3] = readln().toDouble()

                println("Sua quarta nota agora é ${listaDeNotas[3]}\n")
                println("Lista de notas atualizada:\n")
                for (j in listaDeNotas.indices) {
                    println("${j + 1}a nota: ${listaDeNotas[j]}")
                }

                println("Deseja fazer mais alguma alteração?\n" +
                        "1 - SIM | 2 - NÃO")
                val alteracao = readln().toInt()

                if (alteracao == 1) {
                    alteraNota()
                } else if (alteracao == 2) {
                    Menus().menuPrincipal()
                }
            }

        }

        return listaDeNotas
    }


    companion object {
        fun mensagemSucesso() {
            println("Sucesso!\n")
        }



    }

}

