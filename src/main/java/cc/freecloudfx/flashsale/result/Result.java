package cc.freecloudfx.flashsale.result;

/**
 * @author StReaM on 3/25/2018
 */
public class Result<T> {

    private int code;
    private String msg;
    private T data;

    private Result(T data) {
        this.data = data;
        this.msg = "success";
        this.code = 0;
    }

    private Result(CodeMsg codeMsg) {
        if (codeMsg == null) {
            return;
        }
        this.msg = codeMsg.getMsg();
        this.code = codeMsg.getCode();
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }

    public static <T> Result<T> error(CodeMsg msg) {
        return new Result<>(msg);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
