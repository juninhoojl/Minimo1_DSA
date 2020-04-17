package edu.upc.dsa;

import edu.upc.dsa.models.Covid19;

import java.util.List;

public interface Covid19Manager {

    public Covid19 addCovid19(String nombre, String apellido, String nacimiento, String finforme, String riesgo, String genero, String correo, String telefono, String direccion, String clasificacion);
    public Covid19 addCovid19(Covid19 t);
    public Covid19 getCovid19(String id);
    public List<Covid19> findAll();
    public void deleteCovid19(String id);
    public Covid19 updateCovid19(Covid19 t);
    public int size();


}
