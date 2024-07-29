package com.golden.contractor.repository;

import com.golden.contractor.models.Vaga;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VagaRepository extends CrudRepository<Vaga, String> {

    Vaga findByCodigo(long codigo);
    List<Vaga> findByNome(String nome);
}
