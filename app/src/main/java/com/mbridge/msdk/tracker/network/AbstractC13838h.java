package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.C13093d;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.h */
/* JADX INFO: compiled from: MBridgeBaseRequest.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13838h<T> extends AbstractC13850t<T> {

    /* JADX INFO: renamed from: B */
    protected static final String f39452B = "h";

    /* JADX INFO: renamed from: A */
    private boolean f39453A;

    /* JADX INFO: renamed from: w */
    private final long f39454w;

    /* JADX INFO: renamed from: x */
    private Map<String, String> f39455x;

    /* JADX INFO: renamed from: y */
    private Map<String, String> f39456y;

    /* JADX INFO: renamed from: z */
    private InterfaceC13869x f39457z;

    public AbstractC13838h(int i, String str, int i2, String str2, long j) {
        super(i, str, i2, str2);
        this.f39453A = false;
        if (j > 0) {
            this.f39454w = j;
        } else {
            this.f39454w = 60000L;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41107a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f39455x == null) {
            this.f39455x = new HashMap();
        }
        try {
            this.f39455x.putAll(map);
        } catch (Exception e) {
            C13219q0.m37816b(f39452B, "addParams error: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: a */
    public boolean mo41108a() {
        return this.f39453A && C13093d.m37130a(m41244p(), m41248t());
    }

    /* JADX INFO: renamed from: b */
    public void m41109b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f39456y == null) {
            this.f39456y = new HashMap();
        }
        try {
            this.f39456y.put(str, str2);
        } catch (Exception e) {
            C13219q0.m37816b(f39452B, "addHeader error: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    public void m41110d(boolean z) {
        this.f39453A = z;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: f */
    public Map<String, String> mo41111f() {
        if (this.f39456y == null) {
            this.f39456y = new HashMap();
        }
        this.f39456y.put("Charset", "UTF-8");
        return this.f39456y;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: i */
    protected Map<String, String> mo41112i() {
        if (this.f39455x == null) {
            this.f39455x = new HashMap();
        }
        return this.f39455x;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: o */
    public InterfaceC13869x mo41113o() {
        if (this.f39457z == null) {
            this.f39457z = new C13835e(30000, this.f39454w, 3);
        }
        return this.f39457z;
    }
}
