package com.msh;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: mshaikh4
 * Date: 30-08-2021
 * Time: 18:05
 * Year: 2021
 * Project: micronauth-demo
 * Package: com.msh
 */
@MicronautTest
public class HomeControllerTest {

    @Inject
    HomeController homeController;

    /*@Test
    void testItWorks() {
        Assertions.assertTrue();
    }*/
}
