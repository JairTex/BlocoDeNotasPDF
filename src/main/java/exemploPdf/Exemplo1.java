/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploPdf;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author Steix
 */
public class Exemplo1 {
    public Exemplo1(String fraseAImprimir){
        
        Document documentoPDF = new Document();
        
        try {
            PdfWriter.getInstance(documentoPDF, new FileOutputStream("ExemploPDF.pdf"));
            
            documentoPDF.open();
            
            Paragraph primeiroParagrafo = new Paragraph(fraseAImprimir);
            
            documentoPDF.add(primeiroParagrafo);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exemplo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        documentoPDF.close();
    
        
    }
    public static void abrirArquivoPDF() {
    	
    	try {
    		File arquivoPDF = new File("ExemploPDF.pdf");
    		
    		if(arquivoPDF.exists()) {
    			if(Desktop.isDesktopSupported()) {
    				Desktop.getDesktop().open(arquivoPDF);
    			}
    			else {
    				JOptionPane.showMessageDialog(null, "Arquivo não suportado", "Erro!", 0);
    			}
    		}
    		else {
    			JOptionPane.showMessageDialog(null, "Arquivo não criado", "Erro!", 0);
    		}
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	
    }
    
}
