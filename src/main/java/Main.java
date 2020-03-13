import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        PersistenciaSms sms = new PersistenciaSms();
        PersistenciaEmail email = new PersistenciaEmail();
        PersistenciaPdf pdf = new PersistenciaPdf();
        PersistenciaJson json = new PersistenciaJson();
        PersistenciaCsv csv = new PersistenciaCsv();
        PersistenciaXml xml = new PersistenciaXml();

        System.out.println("Digite sua mensagem");
        Mensagem m = new Mensagem(entrada.nextLine());

        int opcao = -1;
        while (opcao != 0) {
            System.out.println(Menu());
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    Persistencia p = new Persistencia(xml);
                    p.gravar(m);
                    break;
                case 2:
                    p = new Persistencia(csv);
                    p.gravar(m);
                break;
                case 3:
                    p = new Persistencia(json);
                    p.gravar(m);
                    break;
                case 4:
                    p = new Persistencia(pdf);
                    p.gravar(m);
                    break;
                case 5:
                    p = new Persistencia(email);
                    p.gravar(m);
                    break;
                case 6:
                    p = new Persistencia(sms);
                    p.gravar(m);
                    break;
            }

        }
    }

    public static String Menu(){
        return "------- MENU -------" +
                "\n 0 - Sair" +
                "\n 1 - Gravar mensagem em arquivo XML" +
                "\n 2 - Gravar mensagem em arquivo CSV" +
                "\n 3 - Gravar mensagem em arquivo JSON" +
                "\n 4 - Gravar mensagem em arquivo PDF" +
                "\n 5 - Enviar mensagem por Email" +
                "\n 6 - Enviar mensagem por SMS";
    }
}
