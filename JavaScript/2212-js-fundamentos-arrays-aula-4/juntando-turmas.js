const salaDePython = ['Melissa','Helena','Rodrigo']

const salaDeJavaScript = ['Ju','Leo','Raquel']

const salaTeste = ['Joao', 'Pedro', 'Thales']

const salasUnificadas = salaDePython.concat(salaDeJavaScript, salaTeste)
const salaGeral = [...salaDePython, ...salaDeJavaScript, ...salaTeste]
console.log(salasUnificadas)
console.log(salaGeral)