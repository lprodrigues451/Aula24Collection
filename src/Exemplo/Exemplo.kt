package Exemplo

import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter
import javax.swing.JOptionPane
import javax.swing.JScrollPane
import javax.swing.JTextArea

/*
Programa Atendimento
Programador : Luiz paulo
Data: Maio de 2018
*/



object Atendimento {
	private fun opcoesMenu(): String {
		return """
		   	
		   	MENU DE OPÇÕES
		   	
		   	1  - Recepcionar cliente .
		   	2  - Consultar clientes a serem atendidos.
		   	3  - Atender cliente .
		   	4  - Liberar todos os clientes.
		   	5  - Verificar quantidade de clientes a atender.
		   	6  - Localizar cliente por número.
		   	7  - Localizar cliente por nome.
		   	8  - Emitir relatório de clientes
		   	9  - Ver relatório de clientes.
		   	10 - Filtrar clientes por valor.
		   	11 - Ver endereço Hash.
		   	12 - Sobre.
		   	13 - Sair.
		   	""".trimIndent()
	}

	private fun mensagem(a: String) {
		JOptionPane.showMessageDialog(
			null, a, "Entrada",
			JOptionPane.INFORMATION_MESSAGE
		)
	}

	@JvmStatic
	fun main(args: Array<String>) {
		var inicio: Fila? = null
		var fim: Fila? = null
		var aux: Fila?
		var op = 0
		do {
			try {
				op = JOptionPane.showInputDialog(opcoesMenu(), "1").toInt()
				if (op < 1 || op > 13) JOptionPane.showMessageDialog(
					null, "OPÇÃO INVÁLIDA!",
					"MENSAGEM", JOptionPane.CLOSED_OPTION
				)
			} catch (e: Exception) {
				JOptionPane.showMessageDialog(
					null, "TECLA CANCELAR FOI ACIONADA - ENCERRANDO ...",
					"MENSAGEM", JOptionPane.CLOSED_OPTION
				)
				break
			}

			// INICIO OP 1
			if (op == 1) {
				val num = JOptionPane.showInputDialog("NÚMERO DO CARTÃO :", "0").toInt()
				aux = inicio
				var encontrou = false
				while (aux != null) {
					if (aux.cartao == num) {
						encontrou = true
						mensagem("Esse número do cartão já foi usado .\nFavor verificar ! $num")
						break
					}
					aux = aux.prox
				}
				if (encontrou == false) {
					val novo = Fila()
					novo.cartao = num
					novo.nome = JOptionPane.showInputDialog("NOME:", " ")
					novo.sobreNome = JOptionPane.showInputDialog("SOBRENOME:", " ")
					novo.valor = JOptionPane.showInputDialog("VALOR:", "0").toDouble()
					if (inicio == null) {
						inicio = novo
						fim = novo
					} else {
						fim!!.prox = novo
						fim = novo
					}
				}
			}
			// FIM OP 1

			// INICIO OP 2
			if (op == 2) {
				if (inicio == null) {
					mensagem("NÃO HÁ ATENDIMENTOS")
				} else {
					val saida = JTextArea(8, 35) // Weight x Width
					val scroll = JScrollPane(saida)
					saida.append(
						"""
							CARTÃO	NOME	SOBRENOME	VALOR
							
							""".trimIndent()
					)
					saida.append("===================================================\n")
					aux = inicio
					while (aux != null) {
						saida.append(
							"""${aux.cartao}	${aux.nome}	${aux.sobreNome}	${aux.valor}
"""
						)
						aux = aux.prox
					}
					JOptionPane.showMessageDialog(
						null, scroll, "CONSULTAR DADOS DO ATENDIMENTO",
						JOptionPane.INFORMATION_MESSAGE
					)
				}
			}
			// FIM OP 2

			// INICIO OP 3
			if (op == 3) {
				if (inicio == null) {
					mensagem("NÃO HÁ ATENDIMENTOS")
				} else {
					aux = inicio
					inicio = inicio.prox
					JOptionPane.showMessageDialog(
						null,
						"CARTÃO: " + aux.cartao + ", NOME: " + aux.nome + "foi atendido(a)!"
					)
				}
			}
			// FIM OP 3

			// INICIO OP 4
			if (op == 4) {
				if (inicio == null) {
					mensagem("NÃO HÁ ATENDIMENTOS")
				} else {
					inicio = null
					mensagem("**O ATENDIMENTO FOI LIBERADO **")
				}
			}
			// FIM OP 4

			// iNICIO OP 5
			if (op == 5) {
				if (inicio == null) {
					mensagem("NÃO HÁ ATENDIMENTOS")
				} else {
					var contador = 0
					aux = inicio
					var valores = 0.0
					while (aux != null) {
						contador = contador + 1
						valores = valores + aux.valor
						aux = aux.prox
					}
					JOptionPane.showMessageDialog(
						null, """O ATENDIMENTO CONTÉM: $contador ELEMENTOS .
 VALOR TOTAL: $valores"""
					)
				}
			}
			// FIM OP 5

			// INICIO OP  6
			if (op == 6) {
				if (inicio == null) {
					mensagem("NÃO HÁ ATENDIMENTOS")
				} else {
					val procurar = JOptionPane.showInputDialog("Informe o número do cartão", "0").toInt()
					aux = inicio
					var encontrou = false
					var cont = 0
					while (aux != null) {
						cont = cont + 1
						if (aux.cartao == procurar) {
							encontrou = true
							JOptionPane.showMessageDialog(
								null, """DADOS DO CLIENTE: 

CARTÃO: ${aux.cartao}
NOME: ${aux.nome}
SOBRENOME: ${aux.sobreNome}
VALOR: R${"$"}${aux.valor}
 POSIÇÃO: ${cont}ª POSIÇÃO"""
							)
							break
						}
						aux = aux.prox
					}
					if (encontrou == false) {
						mensagem("Elemento não encontrado!")
					}
				}
			}
			// FIM OP 6

			// INICIO OP 7
			if (op == 7) {
				if (inicio == null) {
					mensagem("NÃO HÁ ATENDIMENTOS")
				} else {
					val procurarNome = JOptionPane.showInputDialog("Nome do cliente", "")
					aux = inicio
					var encontrou = false
					var cont = 0
					while (aux != null) {
						cont = cont + 1
						if (aux.nome.equals(procurarNome, ignoreCase = true)) {
							encontrou = true
							JOptionPane.showMessageDialog(
								null, """DADOS DO CLIENTE: 

CARTÃO: ${aux.cartao}
NOME: ${aux.nome}
SOBRENOME: ${aux.sobreNome}
VALOR: R${"$"}${aux.valor}
 POSIÇÃO: ${cont}ª POSIÇÃO"""
							)
							break
						}
						aux = aux.prox
					}
					if (encontrou == false) {
						mensagem("Elemento não encontrado!")
					}
				}
			}
			// FIM OP 7

			// INICIO OP 8
			if (op == 8) {
				if (inicio == null) {
					mensagem("NÃO HÁ ATENDIMENTOS")
				} else {
					aux = inicio
					try {
						val arq = FileWriter("C:\\Users\\31715395\\Downloads\\atendimento\\atendimentos.txt")
						val gravar = PrintWriter(arq)
						while (aux != null) {
							gravar.printf("%d, %s, %s, %.2f %n", aux.cartao, aux.nome, aux.sobreNome, +aux.valor)
							aux = aux.prox
						}
						gravar.println("------------------------------------------------------ \n")
						gravar.println("Copyrigth (c) By: Luiz Paulo ")
						arq.close()
					} catch (e: IOException) {
						println("MENSAGEM / CLASS ArquivoTexto:\nErro ao tentar gravar  no arquivo")
					}
					JOptionPane.showMessageDialog(
						null, "ARQUIVO GRAVADO COM SUCESSO", "MENSAGEM DO SISTEMA",
						JOptionPane.CLOSED_OPTION
					)
				}
			}
			// FIM OP 8

			// INICIO OP 9
			if (op == 9) {
				val options = arrayOf<Any>("Sim", "Não")
				var opcao = 0
				while (opcao == 0 || opcao == -1) {
					opcao = JOptionPane.showOptionDialog(
						null,
						"DESEJA VER ARQUIVO?",
						"",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE,
						null,
						options,
						options[0]
					)
					break
				}
				if (opcao == 0) {
					try {
						val pro = Runtime.getRuntime()
							.exec("cmd.exe /c start C:\\\\Users\\\\31715395\\\\Downloads\\\\atendimento\\\\atendimentos.txt")
						pro.waitFor()
					} catch (e: Exception) {
						println("Erro . . .")
					}
				}
			}

			// FIM OP 9

			// INICIO OP 10
			if (op == 10) {
				if (inicio == null) {
					mensagem("NÃO HÁ ATENDIMENTOS")
				} else {
					val procurarValor =
						JOptionPane.showInputDialog("FILTRAR ATENDIMENTOS PARA VALORES SUPERIORES A:", "").toDouble()
					val saida = JTextArea(8, 35) // Weight x Width
					val scroll = JScrollPane(saida)
					saida.append(
						"""
							CARTÃO	NOME	SOBRENOME	VALOR
							
							""".trimIndent()
					)
					saida.append("===================================================\n")
					aux = inicio
					while (aux != null) {
						if (aux.valor > procurarValor) saida.append(
							"""${aux.cartao}	${aux.nome}	${aux.sobreNome}	${aux.valor}
"""
						)
						aux = aux.prox
					}
					JOptionPane.showMessageDialog(
						null, scroll, "ATENDIMENTOS COM VALORES SUPERIORES A: $procurarValor",
						JOptionPane.INFORMATION_MESSAGE
					)
				}
			}
			// FIM OP 10

			// INICIO OP 11
			if (op == 11) {
				if (inicio == null) {
					mensagem("NÃO HÁ ATENDIMENTOS")
				} else {
					val procurarValor =
						JOptionPane.showInputDialog("ATENDIMENTOS PARA VALORES SUPERIORES A:", "").toDouble()
					val saida = JTextArea(8, 35) // Weight x Width
					val scroll = JScrollPane(saida)
					saida.append(
						"""
							NOME	ENDEREÇO	PROX
							
							""".trimIndent()
					)
					saida.append("===================================================\n")
					aux = inicio
					while (aux != null) {
						if (aux.prox == null) {
							saida.append(
								"""${aux.nome}	${aux.hashCode()}	 fim 
"""
							)
						} else {
							saida.append(
								"""${aux.nome}	${aux.hashCode()}	${aux.prox.hashCode()}
"""
							)
						}
						aux = aux.prox
					}
					JOptionPane.showMessageDialog(
						null, scroll, "CONSULTAR DADOS DO ATENDIMENTO: $procurarValor",
						JOptionPane.INFORMATION_MESSAGE
					)
				}
			}
			// FIM OP 11


			// INICIO OP 12
			if (op == 12) {
				val saida = JTextArea(8, 35) // Weight x Width
				val scroll = JScrollPane(saida)
				saida.append("PROGRAMA DE ATENDIMENTO AO CLIENTE \n")
				saida.append("--------------------------------------------------------------- \n")
				saida.append("Copyright (c) Byta Bug Informática Ltda \n")
				saida.append("Programador : Luiz Paulo \n")
				saida.append("Versão 3.0 (Build 100)\n")
				saida.append("Data Inicial do projeto: 26 de abril 2018 \n")
				JOptionPane.showMessageDialog(
					null, scroll, "SOBRE O PROGRAMA",
					JOptionPane.INFORMATION_MESSAGE
				)
			}
		} while (op != 13)
		JOptionPane.showMessageDialog(null, " * PROGRAMA FINALIZADO * ")
	}

	private class Fila {
		var cartao = 0
		var nome: String? = null
		var sobreNome: String? = null
		var valor = 0.0
		var prox: Fila? = null
	}
}