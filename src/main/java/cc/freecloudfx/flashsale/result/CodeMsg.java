package cc.freecloudfx.flashsale.result;

/**
 * @author StReaM on 3/25/2018
 */
public class CodeMsg {

    private int code;
    private String msg;

    // 通用异常
    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");

    // todo 登陆模块 500200

    // todo 商品模块 500300

    // todo 订单模块 500400

    // todo 秒杀模块 500500

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
