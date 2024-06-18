package ru.rsreu.rentall.composite_id;

import lombok.*;

import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode
public class ChatId implements Serializable {
    private int chatId;
    private String userOneLogin;
    private String userTwoLogin;
}
