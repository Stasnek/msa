package com.haulmont.training.msa.easywallet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan(basePackages = ["com.haulmont.training.msa"])
@SpringBootApplication
class EasyWalletApp

fun main(args: Array<String>) {
    runApplication<EasyWalletApp>(*args)
}
