package todolist.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ServiceRuntimeException extends RuntimeException {

    private final HttpStatus httpStatus;

    private final String errorCode;

    public ServiceRuntimeException(HttpStatus httpStatus,
                                   String errorCode,
                                   String errorMessage) {
        super(errorMessage);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
    }

}
