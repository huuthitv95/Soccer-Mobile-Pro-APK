package com.fyber.inneractive.sdk.protobuf;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.k4 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC8969k4 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(AbstractC9011s.f21106b),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    EnumC8969k4(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
