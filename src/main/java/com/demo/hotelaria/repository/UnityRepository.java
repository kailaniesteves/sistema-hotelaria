package com.demo.hotelaria.repository;

import com.demo.hotelaria.domain.Unity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UnityRepository extends CrudRepository<Unity, Long> {

    Optional<Unity> findByTradeMarkAndCnpj(final String tradeMark, final Long cnpj);

    void deleteByTradeMarkAndCnpj(final String tradeMark, final Long cnpj);
}
