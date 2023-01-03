package com.example.d2;
import org.springframework.stereotype.Service;
@Service
public class D2service {
    private final D2repository d2Repository;
    public D2service(D2repository d2Repository){
        this.d2Repository=d2Repository;
    }
    public D2entity getd2Entity(Long id){
        return d2Repository.findById(id).orElseThrow(()-> new RuntimeException("Entity not find"));
    }
}
