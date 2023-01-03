package com.example.d2;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class D2controller {

    private final StringRedisTemplate stringRedisTemplate;

    private final D2service D2Service;

    public D2controller(StringRedisTemplate stringRedisTemplate, D2service D2Service) {
        this.stringRedisTemplate = stringRedisTemplate;
        this.D2Service = D2Service;
    }

    @GetMapping("/foo")
    public String get() {
        return stringRedisTemplate.opsForValue().get("foo");
    }

    @PutMapping("/foo")
    public void set(@RequestBody String value) {
        stringRedisTemplate.opsForValue().set("foo", value);
    }
    @GetMapping("/{id}")
    public D2entity getDemoEntity(@PathVariable("id") Long id) {
        return D2Service.getd2Entity(id);
    }
}
