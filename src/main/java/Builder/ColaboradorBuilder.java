
package Builder;

import java.util.Date;

public class ColaboradorBuilder {
    
    private Colaborador colaborador;

    public ColaboradorBuilder() {
        colaborador = new Colaborador();
    }
    
    public Colaborador build(){
        if (colaborador.getId() == 0) {
            throw new IllegalArgumentException("Indentificacao invalida");
        }
        if (colaborador.getNome().equals("")) {
            throw new IllegalArgumentException("Nome invalido");
        }
        return colaborador;
    }
    
    public ColaboradorBuilder setId(int id) {
        colaborador.setId(id);
        return this;
    }

    public ColaboradorBuilder setNome(String nome) {
        colaborador.setNome(nome);
        return this;
    }

    public ColaboradorBuilder setSexo(String sexo) {
        colaborador.setSexo(sexo);
        return this;
    }

    public ColaboradorBuilder setDataNascimento(Date dataNascimento) {
        colaborador.setDataNascimento(dataNascimento);
        return this;
    }

    public ColaboradorBuilder setNacionalidade(String nacionalidade) {
        colaborador.setNacionalidade(nacionalidade);
        return this;
    }

    public ColaboradorBuilder setProfissao(String profissao) {
        colaborador.setProfissao(profissao);
        return this;
    }

    public ColaboradorBuilder setEnderecoUF(String enderecoUF) {
        colaborador.setEnderecoUF(enderecoUF);
        return this;
    }

    public ColaboradorBuilder setEnderecoCidade(String enderecoCidade) {
        colaborador.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public ColaboradorBuilder setEnderecoBairro(String enderecoBairro) {
        colaborador.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public ColaboradorBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        colaborador.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public ColaboradorBuilder setEnderecoNumero(int enderecoNumero) {
        colaborador.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public ColaboradorBuilder setEnderecoComplemento(String enderecoComplemento) {
        colaborador.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public ColaboradorBuilder setEmail(String email) {
       colaborador.setEmail(email);
        return this;
    }

    public ColaboradorBuilder setCelular(String celular) {
        colaborador.setCelular(celular);
        return this;
    }

    public ColaboradorBuilder setIdioma(String idioma) {
        colaborador.setIdioma(idioma);
        return this;
    }
}
