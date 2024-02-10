package co.icesi.edu.model;
import org.junit.Assert;
import org.junit.Test;


import java.lang.reflect.Method;
import java.util.ArrayList;

public class InfrastructureDepartamentTest {

    //---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---

    @Test
    public void testAddBillboard() throws Exception {
        // Crear una instancia de la clase InfrastructureDepartament
        InfrastructureDepartament department = new InfrastructureDepartament();

        // Agregar un cartel al departamento de infraestructura
        department.addBillboard(10.0, 5.0, true, "Coca-Cola");
    }

    //---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---

    @Test
    public void testPromedioAltura() throws Exception {
        InfrastructureDepartament department = new InfrastructureDepartament();

        double promedioAltura = department.promedioAltura();
        Assert.assertEquals(303.4, promedioAltura, 000.1);
    }

    @Test
    public void testPromedioAnchos() throws Exception {
        InfrastructureDepartament department = new InfrastructureDepartament();

        double promedioAnchos = department.promedioAnchos();
        Assert.assertEquals(792.2, promedioAnchos, 000.1);
    }

    @Test
    public void testPromedioAreas() throws Exception {
        InfrastructureDepartament department = new InfrastructureDepartament();

        double promedioAreas = department.promedioAreas();
        Assert.assertEquals(236091.0, promedioAreas, 000.1);
    }

    //---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---

    @Test
    public void testContadorDeActivos() throws Exception {
        InfrastructureDepartament department = new InfrastructureDepartament();

        String contadorDeActivos = department.contadorDeActivos();
        String supestoResultado = "Hay 3 en Uso y 2 en Desuso.";

        //se tenian que compara comparar cadenas de texto en forma de varibles
        Assert.assertEquals(supestoResultado, contadorDeActivos);
    }

    //---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---

    @Test
    public void testNombresConRepeticiones() throws Exception {
        InfrastructureDepartament department = new InfrastructureDepartament();

        String resultado = department.nombresConRepeticiones();
        String supestoResultado = " - Auctor Quis Tristique Corp.: 1 veces\n" +
                " - Hendrerit Institute: 2 veces\n" +
                " - Risus Morbi LLC: 2 veces\n";
        Assert.assertEquals(supestoResultado, resultado);
    }

    //---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---

    @Test
    public void testLoadBillboard() throws Exception {
        InfrastructureDepartament department = new InfrastructureDepartament();

        // Asi se obtiene la referencia al método (privado loadBillboard)
        Method loadBillboardMethod = InfrastructureDepartament.class.getDeclaredMethod("loadBillboard");

        // Esto hace que el método sea accesible
        loadBillboardMethod.setAccessible(true);

        // Invocamos el método
        loadBillboardMethod.invoke(department);
    }

    @Test
    public void testImportData() throws Exception {
        InfrastructureDepartament department = new InfrastructureDepartament();

        Method importDataMethod = InfrastructureDepartament.class.getDeclaredMethod("importData", String.class);

        importDataMethod.setAccessible(true);
        importDataMethod.invoke(department, "100.0|40.0|true|Auctor Quis Tristique Corp.");
    }

    //---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---

}
