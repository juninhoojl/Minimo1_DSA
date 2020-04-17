package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Covid19 {

    String id;
    String nombre;
    String apellido;
    String nacimiento;
    String finforme;
    String riesgo;
    String genero;
    String correo;
    String telefono;
    String direccion;
    String clasificacion;

    static int lastId;

    public Covid19() {
        this.id = RandomUtils.getId();
    }

    public Covid19(String nombre, String apellido, String nacimiento, String finforme, String riesgo, String genero, String correo, String telefono, String direccion, String clasificacion) {

        this();
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setNacimiento(nacimiento);
        this.setFinforme(finforme);
        this.setRiesgo(riesgo);
        this.setGenero(genero);
        this.setCorreo(correo);
        this.setTelefono(telefono);
        this.setDireccion(direccion);
        this.setClasificacion(clasificacion);

    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getFinforme() {
        return finforme;
    }

    public void setFinforme(String finforme) {
        this.finforme = finforme;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Covid19 [id="+id+", nombre=" + nombre + ", apellido=" + apellido +", nacimiento=" + nacimiento +", finforme=" + finforme +", riesgo=" + riesgo +", genero=" + genero +", correo=" + correo +", telefono=" + telefono +", direccion=" + direccion +", clasificacion=" + clasificacion +"]";
    }


}
