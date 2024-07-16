package com.example.casaDragon.servicios;

import com.example.casaDragon.helpers.MensajeServicios;
import com.example.casaDragon.models.Jinete;
import com.example.casaDragon.repositorios.JineteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JineteServicio {

    @Autowired
    JineteRepositorio jineteRepositorio;
    public Jinete agregarJinete(Jinete datosJinete) throws Exception{
        //llamar a las validaciones
        try{
            return jineteRepositorio.save(datosJinete);
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<Jinete> buscarJinetes()throws Exception{
        try{
            return jineteRepositorio.findAll();
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }


    public Jinete buscarJinetePorId(Integer idJinete)throws Exception{
        try{

            Optional<Jinete> jineteEncontrado= jineteRepositorio.findById(idJinete);
            if(jineteEncontrado.isPresent()){
                return jineteEncontrado.get();
            }else{
                throw new Exception(MensajeServicios.USUARIO_NO_ENCONTRADO.getMensaje());
            }

        }
        catch(Exception error){
            throw new Exception(error.getMessage());
        }


    }







}
