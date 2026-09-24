package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.C13942c;
import com.mbridge.msdk.video.dynview.inter.InterfaceC13947a;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13952e;
import com.mbridge.msdk.video.dynview.wrapper.C13985a;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.energize.a */
/* JADX INFO: compiled from: DataEnergize.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13944a {

    /* JADX INFO: renamed from: b */
    private static volatile C13944a f39982b;

    /* JADX INFO: renamed from: a */
    public InterfaceC13947a f39983a;

    private C13944a() {
    }

    /* JADX INFO: renamed from: a */
    public static C13944a m41754a() {
        C13944a c13944a;
        if (f39982b != null) {
            return f39982b;
        }
        synchronized (C13944a.class) {
            if (f39982b == null) {
                f39982b = new C13944a();
            }
            c13944a = f39982b;
        }
        return c13944a;
    }

    /* JADX INFO: renamed from: a */
    private void m41755a(C13942c c13942c, View view, InterfaceC13952e interfaceC13952e) {
        new C13985a().m41920a(c13942c, view, interfaceC13952e);
    }

    /* JADX INFO: renamed from: a */
    private void m41756a(C13942c c13942c, View view, Map map, InterfaceC13952e interfaceC13952e) {
        C13985a c13985a = new C13985a();
        c13985a.m41921a(c13942c, view, map, interfaceC13952e);
        this.f39983a = c13985a.f40135l;
    }

    /* JADX INFO: renamed from: b */
    private void m41757b(C13942c c13942c, View view, Map map, InterfaceC13952e interfaceC13952e) {
        new C13985a().m41922b(c13942c, view, map, interfaceC13952e);
    }

    /* JADX INFO: renamed from: c */
    private void m41758c(C13942c c13942c, View view, Map map, InterfaceC13952e interfaceC13952e) {
        new C13985a().m41923c(c13942c, view, map, interfaceC13952e);
    }

    /* JADX INFO: renamed from: a */
    public void m41759a(View view, C13942c c13942c, Map map, InterfaceC13952e interfaceC13952e) {
        int iM41711g = c13942c.m41711g();
        if (iM41711g == 1) {
            m41756a(c13942c, view, map, interfaceC13952e);
            return;
        }
        if (iM41711g == 2) {
            m41757b(c13942c, view, map, interfaceC13952e);
            return;
        }
        if (iM41711g == 4) {
            m41755a(c13942c, view, interfaceC13952e);
        } else if (iM41711g != 5) {
            interfaceC13952e.mo41779a(view, new ArrayList());
        } else {
            m41758c(c13942c, view, map, interfaceC13952e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m41760b() {
        InterfaceC13947a interfaceC13947a = this.f39983a;
        if (interfaceC13947a != null) {
            interfaceC13947a.mo41774b();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m41761c() {
        InterfaceC13947a interfaceC13947a = this.f39983a;
        if (interfaceC13947a != null) {
            interfaceC13947a.mo41773a();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m41762d() {
        InterfaceC13947a interfaceC13947a = this.f39983a;
        if (interfaceC13947a != null) {
            interfaceC13947a.mo41775c();
        }
    }
}
