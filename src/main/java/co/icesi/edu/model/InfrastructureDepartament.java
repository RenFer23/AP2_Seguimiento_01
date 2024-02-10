package co.icesi.edu.model;

import co.icesi.edu.ui.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class InfrastructureDepartament {

    public static final String BILLBOARD_FILE_NAME = "BillboardDataExported.csv";

    private ArrayList<Billboard> billboards;

    public InfrastructureDepartament() throws Exception{
        billboards = new ArrayList<>();
        loadBillboard();
        resultados();
    }
    public void  addBillboard(double w, double h, boolean ui, String b){

    }

    private void saveBillboard(){

    }

    private void loadBillboard()throws Exception{
        String resource = Main.class.getClassLoader().getResource(BILLBOARD_FILE_NAME).getFile();
        File file = new File(resource);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        line = br.readLine();
        while (line!=null){
            importData(line);
            line = br.readLine();
        }

        br.close();
        fr.close();

    }

    public void exportDangerousBillboardReport(String fn){

    }

    public void importData(String fn){
        String[] columns = fn.split("\\|");
        System.out.println(Arrays.toString(columns));
        Billboard billboard = new Billboard(Double.parseDouble(columns[0]),Double.parseDouble(columns[1]),Boolean.parseBoolean(columns[2]),columns[3]);
        billboards.add(billboard);
    }

    public String toString(){
        return "";
    }

    public double averageHeight(){
        return 0;
    }


    //---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---44

    /*
    // Método para cargar datos de carteles desde un archivo CSV
    private void loadBillboard() throws IOException {

        int contadorcito = 0;

        // Obtiene la ruta del archivo desde el classpath
        String resource = Main.class.getClassLoader().getResource(InfrastructureDepartament.BILLBOARD_FILE_NAME).getFile();

        //Objeto File con la ruta del archivo
        File file = new File(resource);

        //FileReader y BufferedReader para leer el archivo
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);


        // Lee la primera línea del archivo
        String line = br.readLine();

        // Itera sobre cada línea del archivo
        while (line != null) {
            // Divide la línea en columnas utilizando el carácter "|" como separador
            String[] columns = line.split("\\|");




            // Imprime las columnas
            if (columns.length > 0) {
                System.out.println(Arrays.toString(columns));
            } else {
                System.out.println(line);
            }

            // Lee la siguiente línea
            line = br.readLine();
        }

        // Cierra el BufferedReader
        br.close();
    }
     */

    //---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---


    public double promedioAltura() {
        double sum = 0;
        for (Billboard billboard : billboards) {
            sum += billboard.getHeight();
        }
        return sum / billboards.size();
    }

    public double promedioAnchos() {
        double sum = 0;
        for (Billboard billboard : billboards) {
            sum += billboard.getWidth();
        }
        return sum / billboards.size();
    }

    public double promedioAreas() {
        double sum = 0;
        for (Billboard billboard : billboards) {
            sum += billboard.getWidth() * billboard.getHeight();
        }
        return sum / billboards.size();
    }

    public String contadorDeActivos() {
        int trues = 0;
        int falses = 0;

        for (Billboard billboard : billboards) {
            if(billboard.getIsInUse()) {
                trues++;
            }

            if(!billboard.getIsInUse()) {
                falses++;
            }
        }
        return "Hay " + trues + " verdaderos y " + falses + " falsos.";
    }


    //---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---

    public void resultados() {
        System.out.println();
        System.out.println("El promedio de las Alturas es: " + promedioAltura());
        System.out.println("El promedio de los Anchos es: " + promedioAnchos());
        System.out.println("El promedio de las Areas es: " + promedioAreas());
        System.out.println(contadorDeActivos());

    }

    //---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---//---


}
