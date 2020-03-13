import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PersistenciaCsv implements IPersistencia {

    public boolean gravarMensagem(Mensagem msg) {
        try {
            String mensagem = msg.getConteudo();
            FileWriter arq = new FileWriter("mensagem.csv");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf("%s;\n", mensagem);
            arq.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}