package com.bytedance.adsdk.p077ri.p078lr.p086ri;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2218ri {

    /* JADX INFO: renamed from: lr */
    private Object[] f5473lr;

    /* JADX INFO: renamed from: ri */
    private String f5474ri;

    /* JADX INFO: renamed from: lr */
    public Object[] m7306lr() {
        return this.f5473lr;
    }

    /* JADX INFO: renamed from: ri */
    public String m7307ri() {
        return this.f5474ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m7308ri(String str) {
        this.f5474ri = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m7309ri(Object[] objArr) {
        this.f5473lr = objArr;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.f5474ri + "', args=" + Arrays.toString(this.f5473lr) + AbstractJsonLexerKt.END_OBJ;
    }
}
