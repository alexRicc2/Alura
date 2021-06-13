import React, { Component } from 'react';
import  ListaDeNotas  from './componentes/ListaDeNotas';
import  FormularioCadastro  from './componentes/FormularioCadastro';

class App extends Component {
  render (){
    return (
      <section>
      <FormularioCadastro/>
      <ListaDeNotas/>
      </section>
    ); 
  }
}

export default App;
