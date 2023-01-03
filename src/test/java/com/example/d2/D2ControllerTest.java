package com.example.d2;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class D2ControllerTest extends D2AbstractionTest{
    @Autowired
    TestRestTemplate restTemplate;
    @Autowired
    D2repository d2Repository;
    @Test
    public void simpleTest() {
        String fooResource = "/foo";

        restTemplate.put(fooResource, "bar");

        assertThat(restTemplate.getForObject(fooResource, String.class)).as("value is set").isEqualTo("bar");
    }
    @Test
    public void simpleJPATest() {
        D2entity D2Entity = new D2entity();
        D2Entity.setValue("Some value");
        d2Repository.save(D2Entity);

        D2entity result = restTemplate.getForObject("/" + D2Entity.getId(), D2entity.class);

        assertThat(result.getValue()).as("value is set").isEqualTo("Some value");
    }
}
