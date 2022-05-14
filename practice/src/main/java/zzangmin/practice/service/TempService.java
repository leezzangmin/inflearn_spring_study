package zzangmin.practice.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class TempService {

    public void save() {
        System.out.println("autowired test");
    }

}
