package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mg */
/* JADX INFO: loaded from: classes6.dex */
public class C12376mg {

    /* JADX INFO: renamed from: b */
    private int f31508b = 4;

    /* JADX INFO: renamed from: c */
    private int f31509c = 4;

    /* JADX INFO: renamed from: a */
    private HashMap<String, Boolean> f31507a = new a();

    /* JADX INFO: renamed from: com.ironsource.mg$a */
    class a extends HashMap<String, Boolean> {
        a() {
            put(C12148d8.f30227k, Boolean.valueOf(C12376mg.this.f31508b == 0));
            put(C12148d8.f30228l, Boolean.valueOf(C12376mg.this.f31509c == 0));
            Boolean bool = Boolean.FALSE;
            put(C12148d8.f30229m, bool);
            put(C12148d8.f30230n, bool);
        }
    }

    C12376mg() {
    }

    /* JADX INFO: renamed from: a */
    void m32789a(String str, int i, boolean z) {
        if (this.f31507a.containsKey(str)) {
            this.f31507a.put(str, Boolean.valueOf(i == 0));
        }
        this.f31507a.put(C12148d8.f30229m, Boolean.valueOf(z));
        this.f31507a.put(C12148d8.f30230n, Boolean.valueOf((this.f31507a.get(C12148d8.f30228l).booleanValue() || this.f31507a.get(C12148d8.f30227k).booleanValue()) && this.f31507a.get(C12148d8.f30229m).booleanValue()));
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m32788a() {
        return new JSONObject(this.f31507a);
    }
}
