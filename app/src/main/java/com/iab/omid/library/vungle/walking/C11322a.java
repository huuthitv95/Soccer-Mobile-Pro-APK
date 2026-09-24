package com.iab.omid.library.vungle.walking;

import android.view.View;
import com.iab.omid.library.vungle.adsession.C11271a;
import com.iab.omid.library.vungle.internal.C11292c;
import com.iab.omid.library.vungle.internal.C11294e;
import com.iab.omid.library.vungle.utils.C11317h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11322a {

    /* JADX INFO: renamed from: a */
    private final HashMap<View, String> f23746a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private final HashMap<View, a> f23747b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private final HashMap<String, View> f23748c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private final HashSet<View> f23749d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    private final HashSet<String> f23750e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    private final HashSet<String> f23751f = new HashSet<>();

    /* JADX INFO: renamed from: g */
    private final HashMap<String, String> f23752g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    private final HashSet<String> f23753h = new HashSet<>();

    /* JADX INFO: renamed from: i */
    private final Map<View, Boolean> f23754i = new WeakHashMap();

    /* JADX INFO: renamed from: j */
    private boolean f23755j;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C11294e f23756a;

        /* JADX INFO: renamed from: b */
        private final ArrayList<String> f23757b = new ArrayList<>();

        public a(C11294e c11294e, String str) {
            this.f23756a = c11294e;
            m25214a(str);
        }

        /* JADX INFO: renamed from: a */
        public C11294e m25213a() {
            return this.f23756a;
        }

        /* JADX INFO: renamed from: a */
        public void m25214a(String str) {
            this.f23757b.add(str);
        }

        /* JADX INFO: renamed from: b */
        public ArrayList<String> m25215b() {
            return this.f23757b;
        }
    }

    /* JADX INFO: renamed from: a */
    private Boolean m25197a(View view) {
        if (view.hasWindowFocus()) {
            this.f23754i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f23754i.containsKey(view)) {
            return this.f23754i.get(view);
        }
        Map<View, Boolean> map = this.f23754i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    /* JADX INFO: renamed from: a */
    private String m25198a(View view, boolean z) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m25197a(view).booleanValue() && !z) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strM25169a = C11317h.m25169a(view);
            if (strM25169a != null) {
                return strM25169a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f23749d.addAll(hashSet);
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m25199a(C11271a c11271a) {
        Iterator<C11294e> it = c11271a.m24936f().iterator();
        while (it.hasNext()) {
            m25200a(it.next(), c11271a);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m25200a(C11294e c11294e, C11271a c11271a) {
        View view = c11294e.m25020c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f23747b.get(view);
        if (aVar != null) {
            aVar.m25214a(c11271a.m24933c());
        } else {
            this.f23747b.put(view, new a(c11294e, c11271a.m24933c()));
        }
    }

    /* JADX INFO: renamed from: a */
    public View m25201a(String str) {
        return this.f23748c.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m25202a() {
        this.f23746a.clear();
        this.f23747b.clear();
        this.f23748c.clear();
        this.f23749d.clear();
        this.f23750e.clear();
        this.f23751f.clear();
        this.f23752g.clear();
        this.f23755j = false;
        this.f23753h.clear();
    }

    /* JADX INFO: renamed from: b */
    public a m25203b(View view) {
        a aVar = this.f23747b.get(view);
        if (aVar != null) {
            this.f23747b.remove(view);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public String m25204b(String str) {
        return this.f23752g.get(str);
    }

    /* JADX INFO: renamed from: b */
    public HashSet<String> m25205b() {
        return this.f23751f;
    }

    /* JADX INFO: renamed from: c */
    public String m25206c(View view) {
        if (this.f23746a.size() == 0) {
            return null;
        }
        String str = this.f23746a.get(view);
        if (str != null) {
            this.f23746a.remove(view);
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public HashSet<String> m25207c() {
        return this.f23750e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m25208c(String str) {
        return this.f23753h.contains(str);
    }

    /* JADX INFO: renamed from: d */
    public EnumC11330c m25209d(View view) {
        if (this.f23749d.contains(view)) {
            return EnumC11330c.PARENT_VIEW;
        }
        return this.f23755j ? EnumC11330c.OBSTRUCTION_VIEW : EnumC11330c.UNDERLYING_VIEW;
    }

    /* JADX INFO: renamed from: d */
    public void m25210d() {
        this.f23755j = true;
    }

    /* JADX INFO: renamed from: e */
    public void m25211e() {
        C11292c c11292cM25003c = C11292c.m25003c();
        if (c11292cM25003c != null) {
            for (C11271a c11271a : c11292cM25003c.m25004a()) {
                View viewM24935e = c11271a.m24935e();
                if (c11271a.m24938h()) {
                    String strM24933c = c11271a.m24933c();
                    if (viewM24935e != null) {
                        boolean zM25173e = C11317h.m25173e(viewM24935e);
                        if (zM25173e) {
                            this.f23753h.add(strM24933c);
                        }
                        String strM25198a = m25198a(viewM24935e, zM25173e);
                        if (strM25198a == null) {
                            this.f23750e.add(strM24933c);
                            this.f23746a.put(viewM24935e, strM24933c);
                            m25199a(c11271a);
                        } else if (strM25198a != "noWindowFocus") {
                            this.f23751f.add(strM24933c);
                            this.f23748c.put(strM24933c, viewM24935e);
                            this.f23752g.put(strM24933c, strM25198a);
                        }
                    } else {
                        this.f23751f.add(strM24933c);
                        this.f23752g.put(strM24933c, "noAdView");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m25212e(View view) {
        if (!this.f23754i.containsKey(view)) {
            return true;
        }
        this.f23754i.put(view, Boolean.TRUE);
        return false;
    }
}
