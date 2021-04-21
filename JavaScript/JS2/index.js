class Cliente{
    nome
    cpf
}

class ContaCorrente{

    agencia
    #saldo = 0

    sacar(valor){
        if(this.#saldo < 0 || this.#saldo < valor)return
        
        this.#saldo -= valor
        return this.#saldo
    }
    depositar(valor){
        if(valor > 0){
            this.#saldo += valor
        }
    }
}

const cliente1 = new Cliente()
cliente1.nome = "Ricardo"
cliente1.cpf = 11122233309

const cliente2 = new Cliente()
cliente2.nome = "Alice"
cliente2.cpf = 88822233309

const ContaCorrenteRicardo = new ContaCorrente()
ContaCorrenteRicardo.agencia = 1001

ContaCorrenteRicardo.depositar(300)
ContaCorrenteRicardo.depositar(-400) //o metodo nao modifica com esse argumento passado

const valorRestante = ContaCorrenteRicardo.sacar(60)

console.log(valorSacado)
console.log(ContaCorrenteRicardo)

// console.log(cliente1, cliente2)