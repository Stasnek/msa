package com.haulmont.training.msa.easywallet.service

import com.haulmont.training.msa.easywallet.repository.WalletRepository
import org.springframework.stereotype.Service

@Service
class WalletService(private val walletRepository: WalletRepository) {

    fun getAll() = walletRepository.findAll()
}