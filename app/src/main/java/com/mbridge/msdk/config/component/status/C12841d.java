package com.mbridge.msdk.config.component.status;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.C12710b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.status.d */
/* JADX INFO: compiled from: MBPreferenceChangeEventPublisher.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12841d {

    /* JADX INFO: renamed from: a */
    private SharedPreferences f34412a;

    /* JADX INFO: renamed from: b */
    private final List<String> f34413b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final List<InterfaceC12838a> f34414c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    SharedPreferences.OnSharedPreferenceChangeListener f34415d = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.status.d$a */
    /* JADX INFO: compiled from: MBPreferenceChangeEventPublisher.java */
    class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (C12841d.this.f34412a == null || !C12841d.this.f34412a.contains(str)) {
                return;
            }
            C12710b c12710b = new C12710b();
            c12710b.m34843b("916006");
            HashMap map = new HashMap();
            try {
                Object obj = C12841d.this.f34412a.getAll().get(str);
                map.put(C12770c.m35209b("key"), str);
                map.put(C12770c.m35209b("value"), obj);
            } catch (Exception unused) {
                map.put(C12770c.m35209b("key"), str);
                map.put(C12770c.m35209b("value"), C12841d.this.f34412a.getString(str, ""));
            }
            if (C12841d.this.f34413b.isEmpty()) {
                c12710b.m34841a(map);
                C12841d.this.m35733a(c12710b);
            } else if (C12841d.this.f34413b.contains(str)) {
                c12710b.m34841a(map);
                C12841d.this.m35733a(c12710b);
            }
        }
    }

    public C12841d(String str) {
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d == null) {
            return;
        }
        Context applicationContext = contextM36542d.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = applicationContext.getPackageName() + "_preferences";
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        this.f34412a = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f34415d);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m35738b(InterfaceC12838a interfaceC12838a) {
        if (interfaceC12838a != null) {
            this.f34414c.remove(interfaceC12838a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35736a(InterfaceC12838a interfaceC12838a) {
        if (interfaceC12838a != null) {
            this.f34414c.add(interfaceC12838a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35737a(List<String> list) {
        if (list != null) {
            this.f34413b.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35733a(C12710b c12710b) {
        try {
            Iterator<InterfaceC12838a> it = this.f34414c.iterator();
            while (it.hasNext()) {
                it.next().mo35715a(c12710b);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("PreferencePublisher", th.getMessage());
        }
    }
}
