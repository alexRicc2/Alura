console.log(`Trabalhando com listas`)
// const salvador = `Salvador`
// const saoPaulo = `São Paulo`
// const rioDeJaneiro = `Rio de Janeiro`

const listaDeDestinos = new Array(
    `Salvador`,
    `Sao Paulo`,
    `Rio de Janeiro`,
    `Curitiba`
)


listaDeDestinos.push(`Olimpia`)
console.log('Lista de destinos')
console.log(listaDeDestinos)

listaDeDestinos.splice(1,3)

console.log('Lista de destinos')
console.log(listaDeDestinos)
