package com.example.skeleton;

import com.example.skeleton.domain.SkeletonMessage;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SkeletonServiceTest {

    @LocalServerPort
    int port;

    @BeforeEach
    void setUp() {
        RestAssured.port = port;
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void rootUrlShouldReturnHelloWorldJson() {
        SkeletonMessage response = given()
                .header("Content-Type", "application/json")
                .when().log().all()
                .get("/")
                .then().log().all()
                .extract().body().as(SkeletonMessage.class);
        assertThat(response.getMessage()).isEqualTo("Hello World!");
    }
}
