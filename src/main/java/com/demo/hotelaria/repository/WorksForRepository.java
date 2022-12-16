package com.demo.hotelaria.repository;

import com.demo.hotelaria.domain.WorksFor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WorksForRepository extends CrudRepository<WorksFor, Long> {

    Optional<WorksFor> findByTradeMarkAndCnpjAndCpf(final String tradeMark, final Long cnpj, final Long cpf);

    List<WorksFor> findByCpf(final Long cpf);

    void deleteByCpf(final Long cpf);
}
