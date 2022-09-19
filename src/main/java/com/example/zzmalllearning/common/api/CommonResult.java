package com.example.zzmalllearning.common.api;

/**
 * 通用返回对象
 */
public class CommonResult<T> {
    private long code; //
    private String message;
    private T data; //用到了泛型
    protected CommonResult() {
    }

    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     *
     * 成功返回结果
     *
     * @param data 后取得数据
     * @return
     * @param <T>
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果，可自定义消息
     */
    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), message, data)
    }



    /**
     *
     * @param errorCode
     * @return
     * @param <T>
     * 这里参数是IErrorCode接口类型 可能是传入一个实现类对象
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode) {
        return new CommonResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }


    /**
     * 操作失败返回姐u哦
     * @param message
     * @return
     * @param <T>
     */
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<T>(ResultCode.FAILED.getCode(), )
    }

    //参数验证失败
    public static <T> CommonResult<T> validateFailed(String message) {
        return new CommonResult<T>()
    }



    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
