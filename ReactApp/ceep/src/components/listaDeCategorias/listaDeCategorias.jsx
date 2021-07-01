import React, { Component } from 'react';

class ListaDeCategorias extends Component {

    _hendleEventoInput(e){
        if(e.key == "Enter"){
            let valorCategoria = e.target.value

            this.props.adicionarCategoria(valorCategoria);
        }
    }

    state = { }
    render() { 
        return ( 
            <section>
            <ul>
                {this.props.categorias.map((categoria,index) =>{
                    return <li key={index}>{categoria}</li>
                })}
                <li>Categorias</li>
                
            </ul>
            <input type="text" placeholder="Adicionar categoria"
            onKeyUp={this._hendleEventoInput.bind(this)}/>
            </section>
         );
    }
}
 
export default ListaDeCategorias;