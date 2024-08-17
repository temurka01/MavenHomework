package TV.homework_24_06_2024;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Channel {
    private String channelName;
    private Program[] programs;
}
