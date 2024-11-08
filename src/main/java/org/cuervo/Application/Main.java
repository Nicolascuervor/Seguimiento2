package org.cuervo.Application;

import org.cuervo.Application.Services.Service;
import org.cuervo.InfraEstructure.FileAvionRepository;
import org.cuervo.InfraEstructure.FileVueloRepository;
import org.cuervo.Interface.ObjectRepository;

public class Main {

    public static void main(String[] args) {
        ObjectRepository repository = new FileAvionRepository();
        Service service = new Service(repository);


        ObjectRepository repository2 = new FileVueloRepository();
        Service service2 = new Service(repository2);



        Visual visual = new Visual(service, service2);


        visual.iniciar();

    }



}
