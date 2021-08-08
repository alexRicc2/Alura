const nomes = ['Alex' , 'Joao', 'Camila']
const notas = [8, 4, 3.4]

reprovados = nomes.filter((_, indice) => notas[indice] < 5)

console.log(reprovados)