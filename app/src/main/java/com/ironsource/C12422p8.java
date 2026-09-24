package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.p8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12422p8 {

    /* JADX INFO: renamed from: a */
    private HashMap<String, Object> f31708a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public HashMap<String, Object> m33062a() {
        return this.f31708a;
    }

    /* JADX INFO: renamed from: a */
    public C12422p8 m33061a(String str, Object obj) {
        if (obj != null) {
            this.f31708a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
