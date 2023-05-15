/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.gos.Repository;

import com.portfolio.gos.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion  extends JpaRepository<REducacion, Integer>{
    public Optional<Educacion> fingByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);       

    public Optional<Educacion> findByNombreE(String nombreE);

    public void save(Educacion educacion);

    public boolean existsByNombre(String nombreE);

    public void setNombreE(String nombreE);

    public void setDescripcionE(String descripcionE);
}
