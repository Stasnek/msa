package com.haulmont.training.msa.easywallet.controller

import com.haulmont.training.msa.platform.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController()
class HelloController(private val userService: UserService) {

    @GetMapping("/hello")
    fun hello(@RequestParam(defaultValue = "World") name: String) = userService.sayHello(name)
}
