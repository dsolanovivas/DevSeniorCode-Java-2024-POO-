package Clase_08.model.services;

import Clase_08.model.Emergencia;

public class Ambulancia extends ServicioBase {

    public Ambulancia(String id, int personalDisponible, int combustible) {
        super(id, personalDisponible, combustible);
    }

    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("Ambulacia en camino!!!");
        System.out.println("-> [Ambulancia" + getId() + "]: " + emergencia.toString());

        asignarPersonal(3);
        gastarCombustible(5);
    }

}
