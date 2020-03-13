public class Persistencia {

    private IPersistencia pers;

    Persistencia(IPersistencia pers){
        this.pers = pers;
    }

    public void gravar(Mensagem msg){
        pers.gravarMensagem(msg);
    }
}
