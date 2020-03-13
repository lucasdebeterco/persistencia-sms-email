import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaJson implements IPersistencia {

    public boolean gravarMensagem(Mensagem msg) {
        try {
            Gson gson = new Gson();
            gson = new GsonBuilder().create();
            FileWriter writer = new FileWriter("mensagem.json");
            String strJson = gson.toJson(msg);
            writer.write(strJson);

            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return true;
    }
}