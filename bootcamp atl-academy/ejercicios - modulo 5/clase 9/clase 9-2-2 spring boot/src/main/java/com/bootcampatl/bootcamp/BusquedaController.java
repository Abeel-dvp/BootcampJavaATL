package com.bootcampatl.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusquedaController {

    @GetMapping("/busqueda-usuario/{busqueda}")
    public String[] obtenerPalabrasAutocompletar(@PathVariable String busqueda){


        //logica de busqueda
        String[] frasesTipicasDeBusqueda= {busqueda, "porque java es tan dificil", "java curso 2023"};


       String[] resultadoDeLaBusqueda = new String[10];
        int contador = 0;

        for (String frase :frasesTipicasDeBusqueda){
            if (frase.contains(busqueda)){
                resultadoDeLaBusqueda[contador]= frase;
                contador++;

            }
        }

        return resultadoDeLaBusqueda;

    }

}
