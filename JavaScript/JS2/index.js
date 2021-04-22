import {Cliente} from "./Cliente.js"
import {ContaCorrente} from "./ContaCorrente.js"
import { ContaPoupanca } from "./ContaPoupanca.js"

 const cliente1 = new Cliente("Ricardo", 11122233309) //aloca no heap o espaço de um Cliente


// const cliente2 = new Cliente("Alice", 88822233309)

 const ContaCorrenteRicardo = new ContaCorrente(cliente1, 1001)

 const contaPoupanca = new ContaPoupanca(50, cliente1, 1001)

 console.log(contaPoupanca)


// const conta2 = new ContaCorrente(cliente2, 1002) 






//ContaCorrenteRicardo.depositar(300)
//ContaCorrenteRicardo.depositar(-400) //o metodo nao modifica com esse argumento passado

//const valorSacado = ContaCorrenteRicardo.sacar(60)

//ContaCorrenteRicardo.transferir(100,conta2)

//console.log(conta2, ContaCorrenteRicardo)

console.log(ContaCorrente.numeroDeContas)



// console.log(cliente1, cliente2)