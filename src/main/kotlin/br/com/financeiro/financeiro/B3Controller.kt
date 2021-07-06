package br.com.financeiro.financeiro

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class B3Controller {

    @Autowired
    lateinit var inicializadorService: InicializadorService

    @GetMapping("inicializador")
    fun inicializador() {
        inicializadorService.execute()
    }


}