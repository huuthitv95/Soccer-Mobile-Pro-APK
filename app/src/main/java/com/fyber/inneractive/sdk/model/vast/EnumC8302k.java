package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.model.vast.k */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC8302k {
    Jpeg("image/jpeg", "jpeg"),
    Jpg("image/jpg", "jpg"),
    Gif("image/gif", "gif"),
    Png(MimeTypes.IMAGE_PNG, "png");

    private static final Map<String, EnumC8302k> sCreativeTypeMap = new HashMap();
    public final String extension;
    public final String mimeType;

    static {
        for (EnumC8302k enumC8302k : values()) {
            sCreativeTypeMap.put(enumC8302k.mimeType, enumC8302k);
        }
    }

    EnumC8302k(String str, String str2) {
        this.mimeType = str;
        this.extension = str2;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC8302k m20706a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return sCreativeTypeMap.get(str.toLowerCase(Locale.US));
    }
}
