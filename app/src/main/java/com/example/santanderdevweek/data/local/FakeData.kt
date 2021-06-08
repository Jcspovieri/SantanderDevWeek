package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Olá, Joao")
        val cartao = Cartao("xxxx-xxxx-xxxx-0425")

        return Conta(
            "CC 445655-4",
            "AG 0314",
            " R$ 1.200,00",
            " R$ 2.250,00",
            cliente,
            cartao


        );

    }





}