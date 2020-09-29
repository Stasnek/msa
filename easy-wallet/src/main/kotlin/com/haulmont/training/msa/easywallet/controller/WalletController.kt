package com.haulmont.training.msa.easywallet.controller

import com.haulmont.training.msa.easywallet.entity.Wallet
import com.haulmont.training.msa.easywallet.service.WalletService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import reactor.core.publisher.Flux

@Controller
class WalletController(private val walletService: WalletService) {

    @GetMapping("/wallets")
    fun getAll(): Flux<Wallet> = walletService.getAll()
}