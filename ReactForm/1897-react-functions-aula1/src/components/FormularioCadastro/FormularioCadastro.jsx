import React from "react";
import Button from "@material-ui/core/Button";
import { TextField } from "@material-ui/core";
function FormularioCadastro() {
  return (
    <form>
      <TextField id="nome" label="nome"></TextField>

      <label>Sobrenome</label>
      <input type="text" />

      <label>CPF</label>
      <input type="text" />

      <label>Promoções</label>
      <input type="checkbox" />
      <label>Novidades</label>
      <input type="checkbox" />

      <Button type="submit" variant="contained" color="primary">
        Cadastrar
      </Button>
    </form>
  );
}

export default FormularioCadastro;
