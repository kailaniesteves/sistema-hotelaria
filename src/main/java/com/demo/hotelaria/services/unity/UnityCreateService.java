package com.demo.hotelaria.services.unity;

import com.demo.hotelaria.domain.Unity;
import com.demo.hotelaria.repository.UnityRepository;
import org.springframework.stereotype.Service;

@Service
public class UnityCreateService {

    private static UnityRepository unityRepository;
    public static Unity createUnity(Unity unityToCreate) {
        return unityRepository.save(unityToCreate);
    }
}