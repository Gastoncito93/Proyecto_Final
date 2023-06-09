/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gos.Service;

import com.portfolio.gos.Entity.Educacion;
import com.portfolio.gos.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class Seducacion {
    @Autowired
    REducacion rEducacion;
    
    public List<REducacion> list(){
        return rEducacion.findAll();
    }
    
    public Optional<REducacion> getOne(int id){
        return rEducacion.findById(id);
    }
    
      public Optional<Educacion> getByNombreE(String nombreE){
        return rEducacion.findByNombreE(nombreE);
    }
    
      public void save(Educacion educacion){
        rEducacion.save(educacion);
    }
      
      public void delete(int id){
        rEducacion.deleteById(id);
    } 
      
     public boolean existsById(int id){
       return rEducacion.existsById(id);
    } 
    
      public boolean existsByNombreE(String nombreE){
       return rEducacion.existsByNombre(nombreE);
    } 
    
}
