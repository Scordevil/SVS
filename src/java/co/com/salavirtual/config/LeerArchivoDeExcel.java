/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.config;

import co.com.salavirtual.modelo.dto.Usuario_TO;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Gustavo Cardenas
 */
public class LeerArchivoDeExcel {

    public LeerArchivoDeExcel(File fileName) {
        List cellData = new ArrayList();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            XSSFWorkbook workBook = new XSSFWorkbook(fileInputStream);

            XSSFSheet hssfSheet = workBook.getSheetAt(0);

            Iterator rowIterator = hssfSheet.rowIterator();

            while (rowIterator.hasNext()) {
                XSSFRow hssfRow = (XSSFRow) rowIterator.next();

                Iterator iterator = hssfRow.cellIterator();

                List cellTemp = new ArrayList();
                while (iterator.hasNext()) {
                    XSSFCell hssfCell = (XSSFCell) iterator.next();

                    cellTemp.add(hssfCell);
                }
                cellData.add(cellTemp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        obtener(cellData);
    }

    private void obtener(List cellDataList) {
        List<Usuario_TO> usuarios = new ArrayList<>(); 
        for (int i = 1; i < cellDataList.size(); i++) {
            List cellTempList = (List) cellDataList.get(i);
            for (int j = 0; j < cellTempList.size(); j++) {
                 XSSFCell hssfCell = (XSSFCell) cellTempList.get(j);
                 
                 String stringCellValue = hssfCell.toString();
                 System.out.print(stringCellValue+"-");
            }
            System.out.println("-");
        }
    }
    
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Gustavo\\Downloads\\Colpatria - Base Beneficiarios el Faro.xlsx");
        if(f.exists()){
            LeerArchivoDeExcel obj = new LeerArchivoDeExcel(f);
        }
    }

}
