package com.example.casaDragon.helpers.validaciones;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class DragonValidacion {

    //metodos que ALICARAN LAS VALIDACIONES

    public boolean validarNombresDragon(String nombreDragon) {
        //20 caracteres
        if(nombreDragon.length()>20){
            return false;
        }

        //el formato nombre tenga letras y espacion no numeros
        String expresionRegular="^[a-zA-Z\\s]+$";

        Pattern pattern=Pattern.compile(expresionRegular); //convierte una cadena en patron
        Matcher coincidencia=pattern.matcher(nombreDragon); //verifica que la cadena que voy a validar cumpla el patron
        if(!coincidencia.matches()){
           return false;
        }

        return true;

    }

}
