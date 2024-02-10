package co.icesi.edu.model;
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

    @Test
    public void testPromedioAltura() throws Exception {
        InfrastructureDepartament departament = new InfrastructureDepartament();
        department.promedioAltura(11.5, departament.promedioAltura(), 0.01);
    }

    @Test
    public void testPromedioAnchos() throws Exception {
        InfrastructureDepartament departament = new InfrastructureDepartament();
        assertEquals(7.5, departament.promedioAnchos(), 0.01);
    }

    @Test
    public void testPromedioAreas() throws Exception {
        InfrastructureDepartament departament = new InfrastructureDepartament();
        assertEquals(86.25, departament.promedioAreas(), 0.01);
    }

    @Test
    public void testContadorDeActivos() throws Exception {
        InfrastructureDepartament departament = new InfrastructureDepartament();
        assertEquals("Hay 1 verdaderos y 1 falsos.", departament.contadorDeActivos());
    }
}
