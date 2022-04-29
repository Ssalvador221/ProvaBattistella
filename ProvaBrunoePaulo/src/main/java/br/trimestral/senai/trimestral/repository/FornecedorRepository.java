package br.trimestral.senai.trimestral.repository;


import br.trimestral.senai.trimestral.Model.Fornecedor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FornecedorRepository {
    public Fornecedor findByNome(String nome);
    public Fornecedor findByEmail(String email);
    public Fornecedor findByTelefone(String telefone);
}
