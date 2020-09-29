package com.haulmont.training.msa.easywallet.entity

import org.springframework.data.annotation.Id

class Wallet(
        @Id var id: Long?,
        val client: String?,
        val balance: Long?)