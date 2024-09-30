package UniP_server_chat.Unip_party_chat.global.exception.errorCode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ChatRoomErrorCode implements ErrorCode {
    //Todo: 추가해야됨
    EX(HttpStatus.BAD_REQUEST, "예시텍스트");

    private HttpStatus httpStatus;
    private String message;
}