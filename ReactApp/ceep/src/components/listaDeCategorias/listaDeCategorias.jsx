import React, { Component } from 'react';

class ListaDeCategorias extends Component {

    constructor(){
        super();
        this.state = {categorias:[]}
    }

    componentDidMount(){
        this.props.categorias.inscrever(this._novasCategorias.bind(this));
    }

    _novasCategorias(categorias){
        console.log(categorias);
        this.setState({...this.state, categorias})
    }
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
                {this.state.categorias.map((categoria,index) =>{
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