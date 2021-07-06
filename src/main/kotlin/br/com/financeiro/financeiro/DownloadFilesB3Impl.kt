package br.com.financeiro.financeiro

import org.apache.tomcat.util.http.fileupload.FileUtils
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.io.File
import java.net.URL
import java.time.LocalDate


@Component
class DownloadFilesB3Impl : DownloadFilesB3 {

    @Value("\${app.B3.url.host.mes}")
    private val enderecoDownloadB3: String? = null

    @Value("\${local.download.b3.serieHistorica.zip}")
    private val enderecoEntradaArquivoB3: String? = null

    override fun baixaSerieMensal(mesAno: LocalDate) {

//        val fileName = "COTAHIST_D" + hojeFormatado.toString() + ".ZIP"
//        val path = enderecoDownloadB3 + fileName
//
//        val url = URL(path)
//
//        val fos = File(enderecoEntradaArquivoB3 + "\\" + fileName)
//        FileUtils.copyURLToFile(url, fos)
//        extrairEGravarDadosB3.unzipFile(enderecoEntradaArquivoB3 + "\\" + fileName)
//
//        extrairEGravarDadosB3.convertSerieHistoricaBolsaTxtParaCsv(hojeFormatado)
    }



}