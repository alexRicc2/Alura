const notas = [10, 9, 8, 7, 6]

const notasAtualizadas = notas.map( nota => nota == 10 ? nota : ++nota)

const novasNotas = notasAtualizadas

console.log(notasAtualizadas)
console.log(notas)
console.log(novasNotas)