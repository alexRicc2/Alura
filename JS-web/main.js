import botaoConcluir from './componentes/concluiTarefa.js'
import BotaoDeleta from './componentes/deletaTarefa.js'

const novaTarefa = document.querySelector('[data-form-button]')

function criarTarefa(evento){
    evento.preventDefault()
    
    const lista = document.querySelector('[data-list]')
    const tarefa = document.createElement('li')
    tarefa.classList.add('task')
    
    const input = document.querySelector('[data-form-input]')

    const valor = input.value
    console.log(valor)
    input.value = " "

    const conteudo = `<p class="content">${valor}</p>`

    tarefa.innerHTML = conteudo
    tarefa.appendChild(botaoConcluir())
    tarefa.appendChild(BotaoDeleta())
    lista.appendChild(tarefa)
}

novaTarefa.addEventListener('click', criarTarefa)



