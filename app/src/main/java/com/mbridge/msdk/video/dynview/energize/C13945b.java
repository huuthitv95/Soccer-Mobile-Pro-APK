package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.C13942c;
import com.mbridge.msdk.video.dynview.wrapper.C13986b;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.energize.b */
/* JADX INFO: compiled from: UIEnergize.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13945b {

    /* JADX INFO: renamed from: a */
    private static volatile C13945b f39984a;

    private C13945b() {
    }

    /* JADX INFO: renamed from: a */
    public static C13945b m41763a() {
        C13945b c13945b;
        if (f39984a != null) {
            return f39984a;
        }
        synchronized (C13945b.class) {
            if (f39984a == null) {
                f39984a = new C13945b();
            }
            c13945b = f39984a;
        }
        return c13945b;
    }

    /* JADX INFO: renamed from: a */
    private void m41764a(View view, C13942c c13942c) {
        new C13986b().m41927a(view, c13942c);
    }

    /* JADX INFO: renamed from: a */
    private void m41765a(View view, Map<String, Object> map) {
        new C13986b().m41929a(view, map);
    }

    /* JADX INFO: renamed from: b */
    private void m41766b(View view, C13942c c13942c) {
        new C13986b().m41931b(view, c13942c);
    }

    /* JADX INFO: renamed from: b */
    private void m41767b(View view, C13942c c13942c, Map<String, Object> map) {
        new C13986b().m41932b(view, c13942c, map);
    }

    /* JADX INFO: renamed from: c */
    private void m41768c(View view, C13942c c13942c, Map<String, Object> map) {
        new C13986b().m41928a(view, c13942c, map);
    }

    /* JADX INFO: renamed from: a */
    public void m41769a(View view, C13942c c13942c, Map<String, Object> map) {
        if (c13942c == null) {
            return;
        }
        int iM41711g = c13942c.m41711g();
        if (iM41711g == 1) {
            m41765a(view, map);
            return;
        }
        if (iM41711g == 2) {
            m41768c(view, c13942c, map);
            return;
        }
        if (iM41711g == 3) {
            m41766b(view, c13942c);
        } else if (iM41711g == 4) {
            m41767b(view, c13942c, map);
        } else {
            if (iM41711g != 5) {
                return;
            }
            m41764a(view, c13942c);
        }
    }
}
