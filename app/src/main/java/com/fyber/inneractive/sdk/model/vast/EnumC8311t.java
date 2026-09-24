package com.fyber.inneractive.sdk.model.vast;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.model.vast.t */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC8311t {
    MEDIA_TYPE_MP4("video/mp4"),
    MEDIA_TYPE_3GPP("video/3gpp"),
    MEDIA_TYPE_WEBM("video/webm"),
    MEDIA_TYPE_X_MPEG("application/x-mpegURL"),
    UNKNOWN("unknown");

    private static final Map<String, EnumC8311t> sMediaTypeMap = new HashMap();
    final String mimeType;

    static {
        for (EnumC8311t enumC8311t : values()) {
            sMediaTypeMap.put(enumC8311t.mimeType, enumC8311t);
        }
    }

    EnumC8311t(String str) {
        this.mimeType = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC8311t m20709a(String str) {
        Map<String, EnumC8311t> map = sMediaTypeMap;
        return map.containsKey(str) ? map.get(str) : UNKNOWN;
    }
}
