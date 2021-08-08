const salaPython = [7, 4, 3, 9, 10]
const salaJS = [ 2, 5, 8, 10]
const salaC = [3, 8, 7, 3]

function mediaSala(sala){
  return sala.reduce((acum, atual) => acum + atual,0) / sala.length
}

console.log(`media da sala de python: ${mediaSala(salaPython)}`)

const notas = [10, 6.5, 8, 7]

const media = notas.reduce((acum,atual) => atual + acum,0) / notas.length

console.log(media)