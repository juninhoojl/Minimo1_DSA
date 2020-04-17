package edu.upc.dsa;
import edu.upc.dsa.models.Covid19;
import java.util.LinkedList;
import java.util.List;

import edu.upc.dsa.models.Track;
import org.apache.log4j.Logger;

public class Covid19ManagerImpl implements Covid19Manager{

    private static Covid19Manager instance;
    protected List<Covid19> covids;
    final static Logger logger = Logger.getLogger(Covid19ManagerImpl.class);

    private Covid19ManagerImpl() {
        this.covids = new LinkedList<>();
    }

    public static Covid19Manager getInstance() {
        if (instance==null) instance = new Covid19ManagerImpl();
        return instance;
    }

    @Override
    public int size() {
        int ret = this.covids.size();
        logger.info("size " + ret);

        return ret;
    }


    @Override
    public Covid19 addCovid19(Covid19 t) {
        logger.info("new Covid19 " + t);

        this.covids.add (t);
        logger.info("new Covid19 added");
        return t;
    }

    @Override
    public Covid19 addCovid19(String nombre, String apellido, String nacimiento, String finforme, String riesgo, String genero, String correo, String telefono, String direccion, String clasificacion) {
        return this.addCovid19(new Covid19(nombre, apellido, nacimiento, finforme, riesgo, genero, correo, telefono, direccion, clasificacion));
    }

    @Override
    public Covid19 getCovid19(String id) {
        logger.info("getCovid19("+id+")");

        for (Covid19 t: this.covids) {
            if (t.getId().equals(id)) {
                logger.info("getCovid19("+id+"): "+t);

                return t;
            }
        }
        logger.warn("not found " + id);
        return null;
    }

    @Override
    public List<Covid19> findAll() {
        return this.covids;
    }

    @Override
    public void deleteCovid19(String id) {

        Covid19 t = this.getCovid19(id);
        if (t==null) {
            logger.warn("not found " + t);
        }
        else logger.info(t+" deleted ");

        this.covids.remove(t);

    }

    @Override
    public Covid19 updateCovid19(Covid19 p) {
        Covid19 t = this.getCovid19(p.getId());

        if (t!=null) {
            logger.info(p+" rebut!!!! ");

           t.setNombre(p.getNombre());
           t.setApellido(p.getApellido());
           t.setNacimiento(p.getNacimiento());
           t.setFinforme(p.getFinforme());
           t.setRiesgo(p.getRiesgo());
           t.setGenero(p.getGenero());
           t.setCorreo(p.getCorreo());
           t.setTelefono(p.getTelefono());
           t.setDireccion(p.getDireccion());
           t.setClasificacion(p.getClasificacion());

            logger.info(t+" updated ");
        }
        else {
            logger.warn("not found "+p);
        }

        return t;
    }


}
