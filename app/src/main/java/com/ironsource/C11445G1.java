package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: renamed from: com.ironsource.G1 */
/* JADX INFO: loaded from: classes6.dex */
public class C11445G1 {

    /* JADX INFO: renamed from: c */
    private String f24332c;

    /* JADX INFO: renamed from: d */
    private String f24333d;

    /* JADX INFO: renamed from: f */
    private int f24335f;

    /* JADX INFO: renamed from: b */
    private HashSet<String> f24331b = new HashSet<>();

    /* JADX INFO: renamed from: a */
    private boolean f24330a = false;

    /* JADX INFO: renamed from: e */
    private boolean f24334e = false;

    /* JADX INFO: renamed from: g */
    private boolean f24336g = true;

    /* JADX INFO: renamed from: a */
    public void m25818a(boolean z) {
        this.f24330a = z;
    }

    /* JADX INFO: renamed from: b */
    public HashSet<String> m25819b() {
        return this.f24331b;
    }

    /* JADX INFO: renamed from: c */
    public void m25823c(String str) {
        this.f24332c = str;
    }

    /* JADX INFO: renamed from: d */
    public String m25825d() {
        return this.f24332c;
    }

    /* JADX INFO: renamed from: e */
    public boolean m25826e() {
        return this.f24334e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m25827f() {
        return this.f24330a;
    }

    /* JADX INFO: renamed from: g */
    public boolean m25828g() {
        return this.f24336g;
    }

    /* JADX INFO: renamed from: a */
    public void m25817a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f24331b.add(str);
    }

    /* JADX INFO: renamed from: b */
    public void m25820b(String str) {
        this.f24333d = str;
    }

    /* JADX INFO: renamed from: c */
    public String m25822c() {
        return this.f24333d;
    }

    /* JADX INFO: renamed from: b */
    public void m25821b(boolean z) {
        this.f24336g = z;
    }

    /* JADX INFO: renamed from: c */
    public void m25824c(boolean z) {
        this.f24334e = z;
    }

    /* JADX INFO: renamed from: a */
    public int m25815a() {
        return this.f24335f;
    }

    /* JADX INFO: renamed from: a */
    public void m25816a(int i) {
        this.f24335f = i;
    }
}
