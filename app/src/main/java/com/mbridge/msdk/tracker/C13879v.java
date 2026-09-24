package com.mbridge.msdk.tracker;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.tracker.network.AbstractC13850t;
import com.mbridge.msdk.tracker.network.C13835e;
import com.mbridge.msdk.tracker.network.C13847q;
import com.mbridge.msdk.tracker.network.C13867v;
import com.mbridge.msdk.tracker.network.InterfaceC13869x;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.v */
/* JADX INFO: compiled from: ReportRequest.java */
/* JADX INFO: loaded from: classes9.dex */
public class C13879v<T> extends AbstractC13850t<T> {

    /* JADX INFO: renamed from: A */
    private C13835e f39635A;

    /* JADX INFO: renamed from: w */
    private Map<String, String> f39636w;

    /* JADX INFO: renamed from: x */
    private AbstractC13850t.a f39637x;

    /* JADX INFO: renamed from: y */
    private C13867v.b<T> f39638y;

    /* JADX INFO: renamed from: z */
    private AbstractC13880w f39639z;

    public C13879v(String str, int i) {
        super(i, str);
    }

    public C13879v(String str, int i, int i2) {
        super(i, str, i2);
    }

    /* JADX INFO: renamed from: C */
    public C13867v.b<T> m41386C() {
        return this.f39638y;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: a */
    protected C13867v<T> mo41116a(C13847q c13847q) {
        return this.f39639z.mo37516a(c13847q);
    }

    /* JADX INFO: renamed from: a */
    public void m41387a(AbstractC13850t.a aVar) {
        this.f39637x = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m41388a(C13867v.b<T> bVar) {
        this.f39638y = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m41389a(AbstractC13880w abstractC13880w) {
        this.f39639z = abstractC13880w;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: a */
    protected void mo41118a(T t) {
        C13867v.b<T> bVarM41386C = m41386C();
        this.f39638y = bVarM41386C;
        if (bVarM41386C != null) {
            bVarM41386C.mo41337a(t);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41390a(Map<String, String> map) {
        this.f39636w = map;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: a */
    public boolean mo41108a() {
        return false;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: f */
    public Map<String, String> mo41111f() {
        HashMap map = new HashMap();
        map.put("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
        map.put("Charset", "UTF-8");
        return map;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: i */
    protected Map<String, String> mo41112i() {
        return this.f39636w;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: l */
    public AbstractC13850t.a mo41241l() {
        return this.f39637x;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: o */
    public InterfaceC13869x mo41113o() {
        if (C13882y.m41417b(this.f39635A)) {
            this.f39635A = new C13835e(30000, 0);
        }
        return this.f39635A;
    }
}
