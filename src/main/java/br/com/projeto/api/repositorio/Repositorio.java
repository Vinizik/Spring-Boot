package br.com.projeto.api.repositorio;

import java.util.List;
// Importa o CrudRepository e a annotation @Repository
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Importa o modelo Pessoa
import br.com.projeto.api.modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {

    List<Pessoa> findAll();

    Pessoa findByCodigo(int codigo);

    List<Pessoa> findByOrderByNome();

    List<Pessoa> findByNomeOrderByIdade(String nome);

    List<Pessoa> findByNomeContaining(String termo);
    
}
