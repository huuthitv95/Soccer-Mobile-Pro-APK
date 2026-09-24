package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.l */
/* JADX INFO: loaded from: classes4.dex */
public class C8391l {

    /* JADX INFO: renamed from: a */
    public int f18666a;

    /* JADX INFO: renamed from: b */
    public final String f18667b;

    /* JADX INFO: renamed from: c */
    public InputStream f18668c;

    /* JADX INFO: renamed from: d */
    public Map f18669d;

    /* JADX INFO: renamed from: e */
    public String f18670e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f18671f = new ArrayList();

    public C8391l() {
    }

    public C8391l(FilterInputStream filterInputStream, int i, String str, Map map, String str2) {
        this.f18668c = filterInputStream;
        this.f18666a = i;
        this.f18667b = str;
        this.f18669d = map;
        this.f18670e = str2;
    }

    /* JADX INFO: renamed from: a */
    public void mo20759a() {
        InputStream inputStream = this.f18668c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }
}
