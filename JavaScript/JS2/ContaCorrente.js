import { Cliente } from "./Cliente.js"
export class ContaCorrente{

    agencia
    static numeroDeContas = 0
    
    _cliente
    _saldo = 0

    set cliente(novoCliente){ //nao é chamado de metedo, e sim acessor
        if(novoCliente instanceof Cliente)this._cliente = novoCliente
    }
    
    get cliente(){
        return this._cliente
    }

    get saldo(){
        return this._saldo
    }
    constructor(cliente, agencia){
        this.agencia = agencia
        this.cliente = cliente //nao vai direto para _cliente, pois quero verificar antes através do acessor  set cliente
        ContaCorrente.numeroDeContas++
    }


    sacar(valor){
        if(this._saldo < 0 || this._saldo < valor)return
        
        this._saldo -= valor
        return valor
    }
    depositar(valor){
        if(valor > 0){
            this._saldo += valor
        }
    }
    transferir(valor, conta){
        const valorSacado = this.sacar(valor)
        conta.depositar(valorSacado)
    }

}