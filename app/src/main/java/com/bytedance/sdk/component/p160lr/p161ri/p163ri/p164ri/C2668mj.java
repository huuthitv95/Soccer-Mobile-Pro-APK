package com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2672vr;
import com.bytedance.sdk.component.p160lr.p161ri.C2647di;
import com.bytedance.sdk.component.p160lr.p161ri.C2660qt;
import com.bytedance.sdk.component.p160lr.p161ri.bgr;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.ri.ri.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2668mj extends bgr {

    /* JADX INFO: renamed from: lr */
    public static int f7593lr = -2;

    /* JADX INFO: renamed from: ri */
    public static int f7594ri = -1;

    /* JADX INFO: renamed from: di */
    String f7595di;

    /* JADX INFO: renamed from: fi */
    final int f7596fi;

    /* JADX INFO: renamed from: ik */
    HttpURLConnection f7597ik;

    /* JADX INFO: renamed from: ka */
    AbstractC2646co f7598ka;
    String xha;

    public C2668mj(int i, String str, AbstractC2646co abstractC2646co) {
        this.f7595di = str;
        this.f7598ka = abstractC2646co;
        this.f7596fi = i;
    }

    public C2668mj(int i, String str, AbstractC2646co abstractC2646co, String str2) {
        this.f7595di = str;
        this.f7598ka = abstractC2646co;
        this.f7596fi = i;
        this.xha = str2;
    }

    public C2668mj(HttpURLConnection httpURLConnection, AbstractC2646co abstractC2646co, int i) {
        this.f7597ik = httpURLConnection;
        this.f7598ka = abstractC2646co;
        this.f7596fi = i;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.bgr, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            mo9876di().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.bgr
    /* JADX INFO: renamed from: di */
    public AbstractC2672vr mo9876di() {
        jbs jbsVar;
        AbstractC2646co abstractC2646co = this.f7598ka;
        if (abstractC2646co != null && abstractC2646co.f7529lr != null) {
            this.f7598ka.f7529lr.m9757sf();
        }
        try {
            try {
                jbsVar = new jbs(this.f7597ik);
            } catch (Throwable th) {
                th.getMessage();
                jbsVar = null;
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.f7597ik;
            jbsVar = new jbs(httpURLConnection, httpURLConnection.getErrorStream());
        }
        AbstractC2646co abstractC2646co2 = this.f7598ka;
        if (abstractC2646co2 != null && abstractC2646co2.f7529lr != null) {
            this.f7598ka.f7529lr.m9747aw();
        }
        return jbsVar;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.bgr
    /* JADX INFO: renamed from: fi */
    public String mo9877fi() throws IOException {
        return !TextUtils.isEmpty(this.f7595di) ? this.f7595di : this.f7597ik.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.bgr
    /* JADX INFO: renamed from: ik */
    public int mo9878ik() {
        return this.f7596fi;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.bgr
    public String jbs() {
        return this.xha;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.bgr
    /* JADX INFO: renamed from: ka */
    public boolean mo9879ka() {
        int i = this.f7596fi;
        return i >= 200 && i < 300;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.bgr
    /* JADX INFO: renamed from: lr */
    public long mo9880lr() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.bgr
    /* JADX INFO: renamed from: mj */
    public C2660qt mo9881mj() {
        if (m10001qt() == null || m10001qt().f7529lr == null) {
            return null;
        }
        return new C2660qt(m10001qt().f7529lr);
    }

    /* JADX INFO: renamed from: qt */
    public AbstractC2646co m10001qt() {
        return this.f7598ka;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.bgr
    /* JADX INFO: renamed from: ri */
    public long mo9882ri() {
        return 0L;
    }

    /* JADX INFO: renamed from: ri */
    public void m10002ri(String str) {
        this.xha = str;
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.bgr
    public C2647di xha() {
        if (this.f7597ik == null) {
            return new C2647di(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.f7597ik.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!HttpHeaders.CONTENT_RANGE.equalsIgnoreCase(entry.getKey()) || mo9878ik() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new C2647di((String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}
