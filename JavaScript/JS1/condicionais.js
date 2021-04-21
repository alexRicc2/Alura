console.log(`Trabalhando com comdicionais`)
// const salvador = `Salvador`
// const saoPaulo = `São Paulo`
// const rioDeJaneiro = `Rio de Janeiro`

const listaDeDestinos = new Array(
    `Salvador`,
    `Sao Paulo`,
    `Rio de Janeiro`,
    `Curitiba`
)
const idadeComprador = 18

listaDeDestinos.push(`Olimpia`)
console.log('Lista de destinos')
console.log(listaDeDestinos)

if(idadeComprador >= 18){
    console.log('Maior de idade')
    listaDeDestinos.splice(1,3)
}
else{
    console.log('Comprado menor de idade, nao posso vender')
}




console.log('Lista de destinos')
console.log(listaDeDestinos)
