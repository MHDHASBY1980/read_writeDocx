/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read_writeDocx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author USER
 */
public class writeDocx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String teks = "Semakin sulit jalan menuju suatu “tempat”, sesungguhnya akan ada suatu “kepuasan” saat titik akhir perjalanan itu tercapai"
                + "Hidup ini adalah perjalanan yang panjang di dalam waktu yang sempit, isilah dengan perjuangan yang membanggakan, dan hargai dengan ketulusan";
        
        XWPFDocument documentDocx = new XWPFDocument();
        
        String outDocxEn = "D://writeDocx.docx";
        FileOutputStream outDocx = new FileOutputStream(new File(outDocxEn));
        XWPFParagraph paragraphDocx = documentDocx.createParagraph();
        XWPFRun runDocx = paragraphDocx.createRun();
        runDocx.setText(teks);
        
        documentDocx.write(outDocx);
        outDocx.close();
        System.out.println("berhasil membuat file docx");
        
    }
}
