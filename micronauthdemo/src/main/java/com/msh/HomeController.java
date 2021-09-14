package com.msh;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: mshaikh4
 * Date: 30-08-2021
 * Time: 18:00
 * Year: 2021
 * Project: micronauth-demo
 * Package: com.msh
 */
@Controller("/home")
public class HomeController {

    @Get()
    public String homeLoc(HttpServletRequest httpServletRequest){
        return String.format("Welcome %s to Micronaut at %s ", httpServletRequest.getRemoteAddr(),
                httpServletRequest.getLocalAddr()) ;
    }
}
