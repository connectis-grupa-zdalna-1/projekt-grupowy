package pl.connectis.projektgrupowy.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import pl.connectis.projektgrupowy.type.ResponseStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicResponse {
    private String responseMsg;
    private ResponseStatus status;
    private String errorCode;
    private String errorMsg;

    public BasicResponse(){}

    public BasicResponse(String responseMsg) {
        this.responseMsg = responseMsg;
        this.status=ResponseStatus.SUCCESS;
    }

    public BasicResponse(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.status=ResponseStatus.ERROR;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }


    public static BasicResponse of (String responseMsg){return new BasicResponse(responseMsg);}
    public static BasicResponse ofError(String errorCode,String errorMsg){
        return new BasicResponse(errorCode,errorMsg);
    }
}
