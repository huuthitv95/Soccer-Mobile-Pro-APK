package com.iab.omid.library.unity3d.walking;

import android.view.View;
import com.iab.omid.library.unity3d.adsession.C11224a;
import com.iab.omid.library.unity3d.internal.C11234c;
import com.iab.omid.library.unity3d.internal.C11236e;
import com.iab.omid.library.unity3d.utils.C11254h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11258a {

    /* JADX INFO: renamed from: a */
    private final HashMap<View, String> f23582a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private final HashMap<View, a> f23583b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private final HashMap<String, View> f23584c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private final HashSet<View> f23585d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    private final HashSet<String> f23586e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    private final HashSet<String> f23587f = new HashSet<>();

    /* JADX INFO: renamed from: g */
    private final HashMap<String, String> f23588g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    private final Map<View, Boolean> f23589h = new WeakHashMap();

    /* JADX INFO: renamed from: i */
    private boolean f23590i;

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C11236e f23591a;

        /* JADX INFO: renamed from: b */
        private final ArrayList<String> f23592b = new ArrayList<>();

        public a(C11236e c11236e, String str) {
            this.f23591a = c11236e;
            m24909a(str);
        }

        /* JADX INFO: renamed from: a */
        public C11236e m24908a() {
            return this.f23591a;
        }

        /* JADX INFO: renamed from: a */
        public void m24909a(String str) {
            this.f23592b.add(str);
        }

        /* JADX INFO: renamed from: b */
        public ArrayList<String> m24910b() {
            return this.f23592b;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m24893a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m24896b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strM24869a = C11254h.m24869a(view);
            if (strM24869a != null) {
                return strM24869a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f23585d.addAll(hashSet);
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m24894a(C11224a c11224a) {
        Iterator<C11236e> it = c11224a.m24703d().iterator();
        while (it.hasNext()) {
            m24895a(it.next(), c11224a);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24895a(C11236e c11236e, C11224a c11224a) {
        View view = c11236e.m24760c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f23583b.get(view);
        if (aVar != null) {
            aVar.m24909a(c11224a.getAdSessionId());
        } else {
            this.f23583b.put(view, new a(c11236e, c11224a.getAdSessionId()));
        }
    }

    /* JADX INFO: renamed from: b */
    private Boolean m24896b(View view) {
        if (view.hasWindowFocus()) {
            this.f23589h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f23589h.containsKey(view)) {
            return this.f23589h.get(view);
        }
        Map<View, Boolean> map = this.f23589h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    /* JADX INFO: renamed from: a */
    public View m24897a(String str) {
        return this.f23584c.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m24898a() {
        this.f23582a.clear();
        this.f23583b.clear();
        this.f23584c.clear();
        this.f23585d.clear();
        this.f23586e.clear();
        this.f23587f.clear();
        this.f23588g.clear();
        this.f23590i = false;
    }

    /* JADX INFO: renamed from: b */
    public String m24899b(String str) {
        return this.f23588g.get(str);
    }

    /* JADX INFO: renamed from: b */
    public HashSet<String> m24900b() {
        return this.f23587f;
    }

    /* JADX INFO: renamed from: c */
    public a m24901c(View view) {
        a aVar = this.f23583b.get(view);
        if (aVar != null) {
            this.f23583b.remove(view);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: c */
    public HashSet<String> m24902c() {
        return this.f23586e;
    }

    /* JADX INFO: renamed from: d */
    public String m24903d(View view) {
        if (this.f23582a.size() == 0) {
            return null;
        }
        String str = this.f23582a.get(view);
        if (str != null) {
            this.f23582a.remove(view);
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public void m24904d() {
        this.f23590i = true;
    }

    /* JADX INFO: renamed from: e */
    public EnumC11266c m24905e(View view) {
        if (this.f23585d.contains(view)) {
            return EnumC11266c.PARENT_VIEW;
        }
        return this.f23590i ? EnumC11266c.OBSTRUCTION_VIEW : EnumC11266c.UNDERLYING_VIEW;
    }

    /* JADX INFO: renamed from: e */
    public void m24906e() {
        C11234c c11234cM24743c = C11234c.m24743c();
        if (c11234cM24743c != null) {
            for (C11224a c11224a : c11234cM24743c.m24744a()) {
                View viewM24702c = c11224a.m24702c();
                if (c11224a.m24705f()) {
                    String adSessionId = c11224a.getAdSessionId();
                    if (viewM24702c != null) {
                        String strM24893a = m24893a(viewM24702c);
                        if (strM24893a == null) {
                            this.f23586e.add(adSessionId);
                            this.f23582a.put(viewM24702c, adSessionId);
                            m24894a(c11224a);
                        } else if (strM24893a != "noWindowFocus") {
                            this.f23587f.add(adSessionId);
                            this.f23584c.put(adSessionId, viewM24702c);
                            this.f23588g.put(adSessionId, strM24893a);
                        }
                    } else {
                        this.f23587f.add(adSessionId);
                        this.f23588g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m24907f(View view) {
        if (!this.f23589h.containsKey(view)) {
            return true;
        }
        this.f23589h.put(view, Boolean.TRUE);
        return false;
    }
}
