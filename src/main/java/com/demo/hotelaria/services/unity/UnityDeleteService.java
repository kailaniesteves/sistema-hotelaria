package com.demo.hotelaria.services.unity;

import com.demo.hotelaria.repository.UnityRepository;
import org.springframework.stereotype.Service;

@Service
public class UnityDeleteService {

    private static UnityRepository unityRepository;
    public static void deleteUnity(final String tradeMark, final Long cnpj) {
        unityRepository.deleteByTradeMarkAndCnpj(tradeMark, cnpj);
    }
}
