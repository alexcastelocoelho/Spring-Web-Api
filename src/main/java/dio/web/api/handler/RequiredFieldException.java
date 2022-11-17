package dio.web.api.handler;

public class RequiredFieldException  extends BusinessException{


    public RequiredFieldException(String field) {
        super("the field %s is required", field);
    }


}
