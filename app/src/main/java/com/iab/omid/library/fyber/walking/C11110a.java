package com.iab.omid.library.fyber.walking;

import android.view.View;
import com.iab.omid.library.fyber.adsession.C11073a;
import com.iab.omid.library.fyber.internal.C11083c;
import com.iab.omid.library.fyber.internal.C11085e;
import com.iab.omid.library.fyber.utils.C11105h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11110a {

    /* JADX INFO: renamed from: a */
    private final HashMap<View, String> f23183a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private final HashMap<View, a> f23184b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private final HashMap<String, View> f23185c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private final HashSet<View> f23186d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    private final HashSet<String> f23187e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    private final HashSet<String> f23188f = new HashSet<>();

    /* JADX INFO: renamed from: g */
    private final HashMap<String, String> f23189g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    private final HashSet<String> f23190h = new HashSet<>();

    /* JADX INFO: renamed from: i */
    private final Map<View, Boolean> f23191i = new WeakHashMap();

    /* JADX INFO: renamed from: j */
    private boolean f23192j;

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C11085e f23193a;

        /* JADX INFO: renamed from: b */
        private final ArrayList<String> f23194b = new ArrayList<>();

        public a(C11085e c11085e, String str) {
            this.f23193a = c11085e;
            m24169a(str);
        }

        /* JADX INFO: renamed from: a */
        public C11085e m24168a() {
            return this.f23193a;
        }

        /* JADX INFO: renamed from: a */
        public void m24169a(String str) {
            this.f23194b.add(str);
        }

        /* JADX INFO: renamed from: b */
        public ArrayList<String> m24170b() {
            return this.f23194b;
        }
    }

    /* JADX INFO: renamed from: a */
    private Boolean m24152a(View view) {
        if (view.hasWindowFocus()) {
            this.f23191i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f23191i.containsKey(view)) {
            return this.f23191i.get(view);
        }
        Map<View, Boolean> map = this.f23191i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    /* JADX INFO: renamed from: a */
    private String m24153a(View view, boolean z) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m24152a(view).booleanValue() && !z) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strM24124a = C11105h.m24124a(view);
            if (strM24124a != null) {
                return strM24124a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f23186d.addAll(hashSet);
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m24154a(C11073a c11073a) {
        Iterator<C11085e> it = c11073a.m23941f().iterator();
        while (it.hasNext()) {
            m24155a(it.next(), c11073a);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24155a(C11085e c11085e, C11073a c11073a) {
        View view = c11085e.m23998c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f23184b.get(view);
        if (aVar != null) {
            aVar.m24169a(c11073a.m23938c());
        } else {
            this.f23184b.put(view, new a(c11085e, c11073a.m23938c()));
        }
    }

    /* JADX INFO: renamed from: a */
    public View m24156a(String str) {
        return this.f23185c.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m24157a() {
        this.f23183a.clear();
        this.f23184b.clear();
        this.f23185c.clear();
        this.f23186d.clear();
        this.f23187e.clear();
        this.f23188f.clear();
        this.f23189g.clear();
        this.f23192j = false;
        this.f23190h.clear();
    }

    /* JADX INFO: renamed from: b */
    public a m24158b(View view) {
        a aVar = this.f23184b.get(view);
        if (aVar != null) {
            this.f23184b.remove(view);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public String m24159b(String str) {
        return this.f23189g.get(str);
    }

    /* JADX INFO: renamed from: b */
    public HashSet<String> m24160b() {
        return this.f23188f;
    }

    /* JADX INFO: renamed from: c */
    public String m24161c(View view) {
        if (this.f23183a.size() == 0) {
            return null;
        }
        String str = this.f23183a.get(view);
        if (str != null) {
            this.f23183a.remove(view);
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public HashSet<String> m24162c() {
        return this.f23187e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m24163c(String str) {
        return this.f23190h.contains(str);
    }

    /* JADX INFO: renamed from: d */
    public EnumC11118c m24164d(View view) {
        if (this.f23186d.contains(view)) {
            return EnumC11118c.PARENT_VIEW;
        }
        return this.f23192j ? EnumC11118c.OBSTRUCTION_VIEW : EnumC11118c.UNDERLYING_VIEW;
    }

    /* JADX INFO: renamed from: d */
    public void m24165d() {
        this.f23192j = true;
    }

    /* JADX INFO: renamed from: e */
    public void m24166e() {
        C11083c c11083cM23981c = C11083c.m23981c();
        if (c11083cM23981c != null) {
            for (C11073a c11073a : c11083cM23981c.m23982a()) {
                View viewM23940e = c11073a.m23940e();
                if (c11073a.m23943h()) {
                    String strM23938c = c11073a.m23938c();
                    if (viewM23940e != null) {
                        boolean zM24128e = C11105h.m24128e(viewM23940e);
                        if (zM24128e) {
                            this.f23190h.add(strM23938c);
                        }
                        String strM24153a = m24153a(viewM23940e, zM24128e);
                        if (strM24153a == null) {
                            this.f23187e.add(strM23938c);
                            this.f23183a.put(viewM23940e, strM23938c);
                            m24154a(c11073a);
                        } else if (strM24153a != "noWindowFocus") {
                            this.f23188f.add(strM23938c);
                            this.f23185c.put(strM23938c, viewM23940e);
                            this.f23189g.put(strM23938c, strM24153a);
                        }
                    } else {
                        this.f23188f.add(strM23938c);
                        this.f23189g.put(strM23938c, "noAdView");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m24167e(View view) {
        if (!this.f23191i.containsKey(view)) {
            return true;
        }
        this.f23191i.put(view, Boolean.TRUE);
        return false;
    }
}
