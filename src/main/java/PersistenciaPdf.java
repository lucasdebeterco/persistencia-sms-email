import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class PersistenciaPdf implements IPersistencia {

    public boolean gravarMensagem(Mensagem msg) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("msg.pdf"));
            document.open();
            document.add(new Paragraph(msg.getConteudo()));
            document.close();
            return true;
        }
        catch(DocumentException | IOException de) {
            System.err.println(de.getMessage());
            return false;
        }
    }
}