package co.icesi.edu.model;
import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;

public class InfrastructureDepartamentTest {

    @Test
    public void testAddBillboard() throws Exception {
        // Crear una instancia de la clase InfrastructureDepartament
        InfrastructureDepartament department = new InfrastructureDepartament();

        // Agregar un cartel al departamento de infraestructura
        department.addBillboard(10.0, 5.0, true, "Coca-Cola");
    }
}


