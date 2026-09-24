package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.T4 */
/* JADX INFO: loaded from: classes6.dex */
public class C11677T4 {

    /* JADX INFO: renamed from: a */
    private final Map<String, C11660S4> f25727a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    private final Map<String, C11660S4> f25728b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    private final Map<String, C11660S4> f25729c = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    private Map<String, C11660S4> m27511b(C12386n8.e eVar) {
        if (eVar.name().equalsIgnoreCase(C12386n8.e.RewardedVideo.name())) {
            return this.f25727a;
        }
        if (eVar.name().equalsIgnoreCase(C12386n8.e.Interstitial.name())) {
            return this.f25728b;
        }
        if (eVar.name().equalsIgnoreCase(C12386n8.e.Banner.name())) {
            return this.f25729c;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Collection<C11660S4> m27515a(C12386n8.e eVar) {
        Map<String, C11660S4> mapM27511b = m27511b(eVar);
        return mapM27511b != null ? mapM27511b.values() : new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public C11660S4 m27513a(C12386n8.e eVar, String str) {
        Map<String, C11660S4> mapM27511b;
        if (TextUtils.isEmpty(str) || (mapM27511b = m27511b(eVar)) == null) {
            return null;
        }
        return mapM27511b.get(str);
    }

    /* JADX INFO: renamed from: b */
    public void m27516b(C12386n8.e eVar, String str) {
        Map<String, C11660S4> mapM27511b;
        C11660S4 c11660s4Remove;
        if (TextUtils.isEmpty(str) || (mapM27511b = m27511b(eVar)) == null || (c11660s4Remove = mapM27511b.remove(str)) == null) {
            return;
        }
        c11660s4Remove.m27436a();
    }

    /* JADX INFO: renamed from: a */
    private void m27510a(C12386n8.e eVar, String str, C11660S4 c11660s4) {
        Map<String, C11660S4> mapM27511b;
        if (TextUtils.isEmpty(str) || c11660s4 == null || (mapM27511b = m27511b(eVar)) == null) {
            return;
        }
        mapM27511b.put(str, c11660s4);
    }

    /* JADX INFO: renamed from: a */
    public C11660S4 m27512a(C12386n8.e eVar, C11471H9 c11471h9) {
        C11660S4 c11660s4 = new C11660S4(c11471h9);
        m27510a(eVar, c11471h9.m25995e(), c11660s4);
        return c11660s4;
    }

    /* JADX INFO: renamed from: a */
    public C11660S4 m27514a(C12386n8.e eVar, String str, Map<String, String> map, InterfaceC11384Cc interfaceC11384Cc) {
        C11660S4 c11660s4 = new C11660S4(str, str, map, interfaceC11384Cc);
        m27510a(eVar, str, c11660s4);
        return c11660s4;
    }
}
