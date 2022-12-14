package com.demo.hotelaria.services.unity;

import com.demo.hotelaria.domain.Unity;
import com.demo.hotelaria.repository.UnityRepository;
import org.springframework.stereotype.Service;

@Service
public class UnityUpdateService {

    public static UnityRepository unityRepository;
    public static Unity updateUnity(Unity unityToUpdate) {
        Unity oldUnity = unityRepository.findByTradeMarkAndCnpj(
                unityToUpdate.getTradeMark(),
                unityToUpdate.getCnpj())
                .orElseThrow();
        oldUnity = unityToUpdate;
        return unityRepository.save(oldUnity);
    }
}
