package com.demo.hotelaria.repository;

import com.demo.hotelaria.domain.Unit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UnitRepository extends CrudRepository<Unit, Long> {

    Optional<Unit> findByTradeMarkAndCnpj(final String tradeMark, final Long cnpj);

    void deleteByTradeMarkAndCnpj(final String tradeMark, final Long cnpj);
}
