package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.binddata.wrapper.a */
/* JADX INFO: compiled from: ObservableMap.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12894a {

    /* JADX INFO: renamed from: a */
    private final Map<String, List<InterfaceC12895b<String>>> f34696a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map<String, Object> f34697b = new HashMap();

    /* JADX INFO: renamed from: a */
    public void m36048a(String str, InterfaceC12895b<String> interfaceC12895b) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                ((List) this.f34696a.computeIfAbsent(str, new Function() { // from class: com.mbridge.msdk.config.dynamic.binddata.wrapper.a$$ExternalSyntheticLambda1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return C12894a.m36042a((String) obj);
                    }
                })).add(interfaceC12895b);
                return;
            }
            List<InterfaceC12895b<String>> copyOnWriteArrayList = this.f34696a.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f34696a.put(str, copyOnWriteArrayList);
            }
            if (copyOnWriteArrayList.contains(interfaceC12895b)) {
                return;
            }
            copyOnWriteArrayList.add(interfaceC12895b);
        } catch (Exception e) {
            C13219q0.m37817b("ObservableMap", "Failed to add map observer: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m36053b(String str, InterfaceC12895b<String> interfaceC12895b) {
        try {
            m36048a(str, interfaceC12895b);
        } catch (Exception e) {
            C13219q0.m37817b("ObservableMap", "Failed to pre-register map observer: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public Map<String, List<InterfaceC12895b<String>>> m36056c() {
        return this.f34696a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m36057d() {
        return this.f34697b.isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public Set<String> m36058e() {
        return this.f34697b.keySet();
    }

    /* JADX INFO: renamed from: f */
    public int m36059f() {
        return this.f34697b.size();
    }

    /* JADX INFO: renamed from: g */
    public Collection<Object> m36060g() {
        return this.f34697b.values();
    }

    public String toString() {
        return this.f34697b.toString();
    }

    /* JADX INFO: renamed from: c */
    public Object m36055c(Object obj) {
        return this.f34697b.remove(obj);
    }

    /* JADX INFO: renamed from: b */
    public Map<String, Object> m36052b() {
        return this.f34697b;
    }

    /* JADX INFO: renamed from: b */
    public void m36054b(Map<String, List<InterfaceC12895b<String>>> map) {
        this.f34696a.clear();
        this.f34696a.putAll(map);
    }

    /* JADX INFO: renamed from: b */
    public Object m36051b(Object obj) {
        return this.f34697b.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m36042a(String str) {
        return new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: a */
    public boolean m36050a(Object obj) {
        return this.f34697b.containsKey(obj);
    }

    /* JADX INFO: renamed from: a */
    public Set<Map.Entry<String, Object>> m36047a() {
        return this.f34697b.entrySet();
    }

    /* JADX INFO: renamed from: a */
    public void m36049a(Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            m36045a(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public Integer m36045a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            this.f34697b.put(str, obj);
            m36044a(str, obj, str);
            return 1;
        } catch (Exception e) {
            C13219q0.m37817b("ObservableMap", e.getMessage(), e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public Integer m36046a(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        try {
            this.f34697b.put(str2, obj);
            m36044a(str, obj, str2);
            return 1;
        } catch (Exception e) {
            C13219q0.m37817b("ObservableMap", "Failed to notify map observers: " + e.getMessage(), e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36044a(final String str, final Object obj, String str2) {
        List<InterfaceC12895b<String>> list;
        if (this.f34696a.containsKey(str) && (list = this.f34696a.get(str)) != null) {
            for (final InterfaceC12895b<String> interfaceC12895b : list) {
                if (interfaceC12895b instanceof C12897d) {
                    View viewM36065a = ((C12897d) interfaceC12895b).m36065a();
                    if (viewM36065a != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC12895b.mo36061a(str, obj);
                        } else {
                            viewM36065a.post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.binddata.wrapper.a$$ExternalSyntheticLambda2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    interfaceC12895b.mo36061a(str, obj);
                                }
                            });
                        }
                    } else {
                        interfaceC12895b.mo36061a(str, obj);
                    }
                } else {
                    interfaceC12895b.mo36061a(str, obj);
                }
            }
        }
    }
}
