import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PersistenciaXml implements IPersistencia {

    public boolean gravarMensagem(Mensagem msg) {
        try{
            FileOutputStream fos = new FileOutputStream(new File("mensagem.xml"));
            XMLEncoder encoder = new XMLEncoder(fos);
            encoder.writeObject(msg);
            encoder.close();
            fos.close();

        } catch (IOException ex){
            ex.printStackTrace();
            return false;
        }
        return true;

    }
}