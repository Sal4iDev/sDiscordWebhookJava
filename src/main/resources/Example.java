import ru.sal4i.sdiscordwebhook.EmbedColor;
import ru.sal4i.sdiscordwebhook.EmbedObject;
import ru.sal4i.sdiscordwebhook.SDiscordWebhook;

import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        SDiscordWebhook webhook = new SDiscordWebhook("YOUR_WEBHOOK_URL_HERE");
        webhook.setUsername("Custom Webhook Username");
        webhook.setContent("Sal4iDev#4767!");

        webhook.addEmbed(new EmbedObject()
                .setTitle("My Title!")
                .setDescription("My Description!")
                .setColor(EmbedColor.RED)
                .addField("This is a Field name", "This is a Field value", true)
                .addField("This is a 2 Field", "__Hello, World!__", true)
        );
        webhook.addEmbed(new EmbedObject("Some Title", null, null, EmbedColor.PINK)
                .addField("Some Field Name", "Some Field Value", false)
        );

        webhook.execute();
    }
}
