package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.foundation.tools.C13219q0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.b */
/* JADX INFO: compiled from: DownloadMessage.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12788b<T> {

    /* JADX INFO: renamed from: a */
    private T f34079a;

    /* JADX INFO: renamed from: b */
    private int f34080b;

    /* JADX INFO: renamed from: c */
    private String f34081c;

    /* JADX INFO: renamed from: d */
    private Map<String, Object> f34082d;

    /* JADX INFO: renamed from: e */
    private int f34083e = 0;

    /* JADX INFO: renamed from: f */
    private String f34084f = "";

    /* JADX INFO: renamed from: g */
    private String f34085g;

    /* JADX INFO: renamed from: h */
    private boolean f34086h;

    /* JADX INFO: renamed from: i */
    private long f34087i;

    /* JADX INFO: renamed from: j */
    private float f34088j;

    public C12788b(T t, String str, String str2, int i) {
        this.f34079a = t;
        this.f34085g = str2;
        this.f34080b = i;
        try {
            URL url = new URL(str);
            this.f34081c = url.getProtocol() + "://" + url.getHost() + url.getPath();
            StringBuilder sb = new StringBuilder("resourceUrl: ");
            sb.append(this.f34081c);
            C13219q0.m37813a("DownloadMessage", sb.toString());
        } catch (MalformedURLException e) {
            C13219q0.m37817b("DownloadMessage", e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35350a(String str, Object obj) {
        if (this.f34082d == null) {
            this.f34082d = new HashMap(4);
        }
        this.f34082d.put(str, obj);
    }

    /* JADX INFO: renamed from: b */
    public float m35352b() {
        return this.f34088j;
    }

    /* JADX INFO: renamed from: c */
    public int m35353c() {
        return this.f34080b;
    }

    /* JADX INFO: renamed from: d */
    public String m35354d() {
        return this.f34081c;
    }

    /* JADX INFO: renamed from: e */
    public String m35355e() {
        return this.f34085g;
    }

    /* JADX INFO: renamed from: f */
    public String m35356f() {
        return this.f34084f;
    }

    /* JADX INFO: renamed from: g */
    public boolean m35357g() {
        return this.f34086h;
    }

    /* JADX INFO: renamed from: a */
    public void m35349a(String str) {
        this.f34084f = str;
    }

    /* JADX INFO: renamed from: a */
    public void m35351a(boolean z) {
        this.f34086h = z;
    }

    /* JADX INFO: renamed from: a */
    public long m35346a() {
        return this.f34087i;
    }

    /* JADX INFO: renamed from: a */
    public void m35348a(long j) {
        this.f34087i = j;
    }

    /* JADX INFO: renamed from: a */
    public void m35347a(float f) {
        this.f34088j = f;
    }
}
