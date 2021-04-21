import {Cliente} from "./Cliente.js"
import {ContaCorrente} from "./ContaCorrente.js"

const cliente1 = new Cliente()
cliente1.nome = "Ricardo"
cliente1.cpf = 11122233309

const cliente2 = new Cliente()
cliente2.nome = "Alice"
cliente2.cpf = 88822233309

const ContaCorrenteRicardo = new ContaCorrente()
ContaCorrenteRicardo.agencia = 1001
ContaCorrenteRicardo.cliente = cliente1

const conta2 = new ContaCorrente()
conta2.agencia = 1002
conta2.cliente = cliente2

ContaCorrenteRicardo.depositar(300)
ContaCorrenteRicardo.depositar(-400) //o metodo nao modifica com esse argumento passado

const valorSacado = ContaCorrenteRicardo.sacar(60)

ContaCorrenteRicardo.transferir(100,conta2)

console.log(ContaCorrenteRicardo, conta2)



// console.log(cliente1, cliente2)