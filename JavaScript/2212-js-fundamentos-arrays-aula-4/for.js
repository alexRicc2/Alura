                    //1
const numeros = [100, 200, 300, 400, 500, 600]

          // 2    //6
console.log("For")
for (let i = 0; i < numeros.length; i++){
            // numeros[0]
  console.log(i, numeros[i])
}
console.log("ForEach")
numeros.forEach( (numero, indice) => console.log(indice, numero))

console.log("Map")
console.log(numeros.map( (numero, indice) => numero))