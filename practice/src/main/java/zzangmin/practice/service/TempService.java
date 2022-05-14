package zzangmin.practice.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TempService {

    public void save() {
        System.out.println("autowired test");
    }

}
