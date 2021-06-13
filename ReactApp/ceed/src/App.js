import React from 'react';
import { ListaDeNotas } from './componentes/ListaDeNotas';

function App() {
  return (
    <section>
    <form>
      <input type="text" placeholder="Titulo"></input>
      <textarea placeholder="Escreva sua nota"></textarea>
      <button>Criar Nota</button>
    </form>
    <ListaDeNotas/>
    </section>
  );
}

export default App;
