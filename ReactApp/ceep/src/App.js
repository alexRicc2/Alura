import React, { Component } from "react";
import ListaDeNotas from "./components/ListaDeNotas";
import FormularioCadastro from "./components/FormularioCadastro";
import "./assets/App.css";
import './assets/index.css';
import ListaDeCategorias from "./components/listaDeCategorias";
import Categorias from "./dados/Categorias";
import ArrayDeNotas from "./dados/Notas";
class App extends Component {

  constructor(){
    super();
    this.categorias = new Categorias();
    this.notas = new ArrayDeNotas();
  }


  render() {
    return (
      <section className="conteudo">
        <FormularioCadastro categorias={this.categorias} criarNota={this.notas.adicionarNota.bind(this.notas)}/>

        <main className="conteudo-principal">
          <ListaDeNotas notas={this.notas} apagarNota={this.notas.apagarNota.bind(this.notas)}/>
          <ListaDeCategorias categorias={this.categorias} adicionarCategoria={this.categorias.adicionarCategoria.bind(this.categorias)}/>
        </main>
       
      </section>
    );
  }
}

export default App;
