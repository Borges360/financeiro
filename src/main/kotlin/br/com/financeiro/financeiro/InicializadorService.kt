package br.com.financeiro.financeiro

import org.springframework.stereotype.Service
import java.time.LocalDate


@Service
class InicializadorService {


    fun execute() {
        baixaArquivosB3()
    }

    private fun baixaArquivosB3() {
        val dataHoje = LocalDate.now()

    }

}
