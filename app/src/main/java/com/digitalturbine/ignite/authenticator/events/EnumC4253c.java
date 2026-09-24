package com.digitalturbine.ignite.authenticator.events;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.events.c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4253c {
    FAILED_INIT_ENCRYPTION("failed to init encryption"),
    FAILED_EXTRACT_ENCRYPTED_DATA("failed to extract encrypted data"),
    FAILED_STORE_ENCRYPTED_DATA("failed to store encrypted data"),
    IGNITE_SERVICE_UNAVAILABLE("Ignite service unavailable"),
    IGNITE_SERVICE_INVALID_SESSION("Invalid session token"),
    ONE_DT_EMPTY_ENTITY("received empty one dt from the service"),
    ONE_DT_AUTHENTICATOR_DESTROYED("authenticator already destroyed");

    private static final Map<String, EnumC4253c> CONSTANTS = new HashMap();
    private final String value;

    static {
        for (EnumC4253c enumC4253c : values()) {
            CONSTANTS.put(enumC4253c.value, enumC4253c);
        }
    }

    EnumC4253c(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m20299a() {
        return this.value;
    }
}
