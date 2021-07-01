import React, { Component } from "react";
import ListaDeNotas from "./components/ListaDeNotas";
import FormularioCadastro from "./components/FormularioCadastro";
import "./assets/App.css";
import './assets/index.css';
import ListaDeCategorias from "./components/listaDeCategorias";
class App extends Component {

  constructor(){
    super();
    this.state = {
      notas:[],
      categorias:["trabalho","esportes"]
    }
  }

  criarNota(titulo,texto){
    const novaNota = {titulo, texto};
    const novoArrayDeNotas = [...this.state.notas,novaNota]
    const novoEstado = {
      notas:novoArrayDeNotas
    }
    this.setState(novoEstado)
  }
  deletarNota(index){
    let arrayNotas = this.state.notas;
    arrayNotas.splice(index,1);
    this.setState({notas: arrayNotas});
  }

  adicionar(nomeCategoria){
    const novoArrayCategorias = [...this.state.categorias, nomeCategoria];
    const novoEstado = {...this.state, categorias:novoArrayCategorias};
    this.setState(novoEstado);
  }

  render() {
    return (
      <section className="conteudo">
        <FormularioCadastro criarNota={this.criarNota.bind(this)}/>

        <main className="conteudo-principal">
          <ListaDeNotas notas={this.state.notas} apagarNota={this.deletarNota.bind(this)}/>
          <ListaDeCategorias categorias={this.state.categorias} adicionarCategoria={this.adicionar.bind(this)}/>
        </main>
       
      </section>
    );
  }
}

export default App;
