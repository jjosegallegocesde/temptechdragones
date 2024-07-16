package com.example.casaDragon.controladores;


import com.example.casaDragon.models.Aliado;
import com.example.casaDragon.models.Jinete;
import com.example.casaDragon.servicios.AliadoServicio;
import com.example.casaDragon.servicios.JineteServicio;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("casadradoapi/v1/aliado")

public class ControladorAliado {

    //Inyecta el servicio
    @Autowired
    AliadoServicio aliadoServicio;

    @PostMapping
    public ResponseEntity<?> guardarAliado(@RequestBody Aliado datosClienteAliado){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(aliadoServicio.agregarAliado(datosClienteAliado));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

    @GetMapping
    public ResponseEntity<?> buscarAliados(){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(aliadoServicio.buscarAliados());

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

}
