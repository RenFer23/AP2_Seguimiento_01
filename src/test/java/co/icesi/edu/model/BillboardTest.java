package co.icesi.edu.model;
import org.junit.Assert;
import org.junit.Test;

public class BillboardTest {

    // Método de prueba para verificar el cálculo del área de un cartel
    @Test
    public void testArea() {
        //instancia de la clase Billboard con valores específicos
        Billboard obj = new Billboard(100.0, 40.0, true, "asd");

        // Calcular el área del cartel
        double area = obj.calculateArea();

        // Verificar si el área calculada es igual a 4000.0 con un margen de error de 0
        Assert.assertEquals(4000.0, area, 0);
    }
}
