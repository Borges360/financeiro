package br.com.financeiro.financeiro

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDate


@Service
class InicializadorService {

    @Autowired
    lateinit var inicializadorFacade: InicializadorFacade

    fun execute() {
        var listaMesesDownload = buscaMeses()
        baixaArquivosB3()
    }

    private fun buscaMeses(): MutableList<LocalDate> {
        val listaMesesCincoAnos: MutableList<LocalDate> = arrayListOf()
        val dataHoje = LocalDate.now()

        for (i in 1..60){
            listaMesesCincoAnos.add(dataHoje.minusMonths(i.toLong()))
        }

        return listaMesesCincoAnos

    }

    private fun baixaArquivosB3() {


    }

}
