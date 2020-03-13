import com.nexmo.client.NexmoClient;
import com.nexmo.client.sms.MessageStatus;
import com.nexmo.client.sms.SmsSubmissionResponse;
import com.nexmo.client.sms.messages.TextMessage;

public class PersistenciaSms implements IPersistencia {

    public boolean gravarMensagem(Mensagem msg) {
        String NEXMO_API_KEY = "cb27f798";
        String NEXMO_API_SECRET = "J9FwMN3Yq0hl9qqm";
        String TO_NUMBER = "5547988672400";
        String NEXMO_BRAND_NAME = "NEXMO_NUMBER";

        NexmoClient client = NexmoClient.builder().apiKey(NEXMO_API_KEY).apiSecret(NEXMO_API_SECRET).build();

        TextMessage message = new TextMessage(NEXMO_BRAND_NAME,
                TO_NUMBER,
                msg.getConteudo()
        );

        SmsSubmissionResponse response = client.getSmsClient().submitMessage(message);

        return response.getMessages().get(0).getStatus() == MessageStatus.OK;
    }
}
