package com.example.casaDragon.servicios;


import com.example.casaDragon.helpers.MensajeServicios;
import com.example.casaDragon.models.Aliado;
import com.example.casaDragon.repositorios.AliadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AliadoServicio {

    @Autowired
    AliadoRepositorio aliadoRepositorio;



    public Aliado agregarAliado(Aliado datosAliado) throws Exception{
        //llamar a las validaciones
        try{
            return (aliadoRepositorio.save(datosAliado));
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<Aliado> buscarAliados()throws Exception{
        try{
            return aliadoRepositorio.findAll();
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }


    public Aliado buscarAliadoPorId(Integer idAliado)throws Exception{
        try{

            Optional<Aliado> aliadoEncontrado= aliadoRepositorio.findById(idAliado);
            if(aliadoEncontrado.isPresent()){
                return aliadoEncontrado.get();
            }else{
                throw new Exception(MensajeServicios.USUARIO_NO_ENCONTRADO.getMensaje());
            }

        }
        catch(Exception error){
            throw new Exception(error.getMessage());
        }


    }

}
