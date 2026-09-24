package com.mbridge.msdk.preload;

import com.mbridge.msdk.mbnative.service.C13342a;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.preload.a */
/* JADX INFO: compiled from: PreloadController.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13603a {
    /* JADX INFO: renamed from: a */
    public void m38974a(Map<String, Object> map) {
    }

    /* JADX INFO: renamed from: a */
    public void m38975a(Map<String, Object> map, int i) {
        try {
            C13342a.class.getMethod("preload", Map.class, Integer.TYPE).invoke(C13342a.class.newInstance(), map, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m38976b(Map<String, Object> map) {
    }
}
