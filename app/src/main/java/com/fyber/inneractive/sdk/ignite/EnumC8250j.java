package com.fyber.inneractive.sdk.ignite;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ignite.j */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC8250j {
    FAILED_TO_BIND_SERVICE("failed to bind"),
    FAILED_TO_RETRIEVE_CREDENTIALS("failed to retrieve credentials"),
    FAILED_TO_AUTHENTICATE("failed to authenticate"),
    INSTALL_TIMEOUT("install timeout"),
    WEBPAGE_NOT_LOADED_BEFORE_SHOW("webpage not loaded before show"),
    LOAD_WEBPAGE_TIMEOUT("webpage timeout"),
    NOT_CONNECTED("not connected"),
    SESSION_EXPIRED("session expired"),
    DOWNLOAD_IS_CANCELLED("Download is cancelled");

    private static final Map<String, EnumC8250j> CONSTANTS = new HashMap();
    private final String value;

    static {
        for (EnumC8250j enumC8250j : values()) {
            CONSTANTS.put(enumC8250j.value, enumC8250j);
        }
    }

    EnumC8250j(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m20652a() {
        return this.value;
    }
}
