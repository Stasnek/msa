package com.haulmont.training.msa.platform.service

import org.springframework.stereotype.Service

@Service
class UserService {

    fun sayHello(name: String) = "Hello $name!"
}