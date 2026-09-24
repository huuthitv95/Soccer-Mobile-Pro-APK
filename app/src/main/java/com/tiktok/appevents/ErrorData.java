package com.tiktok.appevents;

/* JADX INFO: loaded from: classes7.dex */
public class ErrorData {
    public static final int TT_DDL_CODE_HTTP_ERROR = -2;
    public static final int TT_DDL_CODE_NOT_INIT = -1;
    public static final String TT_DDL_MSG_HTTP_ERROR = "HTTP error";
    public static final String TT_DDL_MSG_NOT_INIT = "SDK not initialized";
    private int code;
    private String msg;

    public ErrorData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
