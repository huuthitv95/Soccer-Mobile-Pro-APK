package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.adsession.C10919a;
import com.iab.omid.library.applovin.internal.C10929c;
import com.iab.omid.library.applovin.internal.C10931e;
import com.iab.omid.library.applovin.utils.C10951h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.a */
/* JADX INFO: loaded from: classes6.dex */
public class C10956a {

    /* JADX INFO: renamed from: a */
    private final HashMap<View, String> f22778a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private final HashMap<View, a> f22779b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private final HashMap<String, View> f22780c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private final HashSet<View> f22781d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    private final HashSet<String> f22782e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    private final HashSet<String> f22783f = new HashSet<>();

    /* JADX INFO: renamed from: g */
    private final HashMap<String, String> f22784g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    private final HashSet<String> f22785h = new HashSet<>();

    /* JADX INFO: renamed from: i */
    private final Map<View, Boolean> f22786i = new WeakHashMap();

    /* JADX INFO: renamed from: j */
    private boolean f22787j;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C10931e f22788a;

        /* JADX INFO: renamed from: b */
        private final ArrayList<String> f22789b = new ArrayList<>();

        public a(C10931e c10931e, String str) {
            this.f22788a = c10931e;
            m23412a(str);
        }

        /* JADX INFO: renamed from: a */
        public C10931e m23411a() {
            return this.f22788a;
        }

        /* JADX INFO: renamed from: a */
        public void m23412a(String str) {
            this.f22789b.add(str);
        }

        /* JADX INFO: renamed from: b */
        public ArrayList<String> m23413b() {
            return this.f22789b;
        }
    }

    /* JADX INFO: renamed from: a */
    private Boolean m23395a(View view) {
        if (view.hasWindowFocus()) {
            this.f22786i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f22786i.containsKey(view)) {
            return this.f22786i.get(view);
        }
        Map<View, Boolean> map = this.f22786i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    /* JADX INFO: renamed from: a */
    private String m23396a(View view, boolean z) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m23395a(view).booleanValue() && !z) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strM23367a = C10951h.m23367a(view);
            if (strM23367a != null) {
                return strM23367a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f22781d.addAll(hashSet);
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m23397a(C10919a c10919a) {
        Iterator<C10931e> it = c10919a.m23184f().iterator();
        while (it.hasNext()) {
            m23398a(it.next(), c10919a);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23398a(C10931e c10931e, C10919a c10919a) {
        View view = c10931e.m23241c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f22779b.get(view);
        if (aVar != null) {
            aVar.m23412a(c10919a.m23181c());
        } else {
            this.f22779b.put(view, new a(c10931e, c10919a.m23181c()));
        }
    }

    /* JADX INFO: renamed from: a */
    public View m23399a(String str) {
        return this.f22780c.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m23400a() {
        this.f22778a.clear();
        this.f22779b.clear();
        this.f22780c.clear();
        this.f22781d.clear();
        this.f22782e.clear();
        this.f22783f.clear();
        this.f22784g.clear();
        this.f22787j = false;
        this.f22785h.clear();
    }

    /* JADX INFO: renamed from: b */
    public a m23401b(View view) {
        a aVar = this.f22779b.get(view);
        if (aVar != null) {
            this.f22779b.remove(view);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public String m23402b(String str) {
        return this.f22784g.get(str);
    }

    /* JADX INFO: renamed from: b */
    public HashSet<String> m23403b() {
        return this.f22783f;
    }

    /* JADX INFO: renamed from: c */
    public String m23404c(View view) {
        if (this.f22778a.size() == 0) {
            return null;
        }
        String str = this.f22778a.get(view);
        if (str != null) {
            this.f22778a.remove(view);
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public HashSet<String> m23405c() {
        return this.f22782e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m23406c(String str) {
        return this.f22785h.contains(str);
    }

    /* JADX INFO: renamed from: d */
    public EnumC10964c m23407d(View view) {
        if (this.f22781d.contains(view)) {
            return EnumC10964c.PARENT_VIEW;
        }
        return this.f22787j ? EnumC10964c.OBSTRUCTION_VIEW : EnumC10964c.UNDERLYING_VIEW;
    }

    /* JADX INFO: renamed from: d */
    public void m23408d() {
        this.f22787j = true;
    }

    /* JADX INFO: renamed from: e */
    public void m23409e() {
        C10929c c10929cM23224c = C10929c.m23224c();
        if (c10929cM23224c != null) {
            for (C10919a c10919a : c10929cM23224c.m23225a()) {
                View viewM23183e = c10919a.m23183e();
                if (c10919a.m23186h()) {
                    String strM23181c = c10919a.m23181c();
                    if (viewM23183e != null) {
                        boolean zM23371e = C10951h.m23371e(viewM23183e);
                        if (zM23371e) {
                            this.f22785h.add(strM23181c);
                        }
                        String strM23396a = m23396a(viewM23183e, zM23371e);
                        if (strM23396a == null) {
                            this.f22782e.add(strM23181c);
                            this.f22778a.put(viewM23183e, strM23181c);
                            m23397a(c10919a);
                        } else if (strM23396a != "noWindowFocus") {
                            this.f22783f.add(strM23181c);
                            this.f22780c.put(strM23181c, viewM23183e);
                            this.f22784g.put(strM23181c, strM23396a);
                        }
                    } else {
                        this.f22783f.add(strM23181c);
                        this.f22784g.put(strM23181c, "noAdView");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m23410e(View view) {
        if (!this.f22786i.containsKey(view)) {
            return true;
        }
        this.f22786i.put(view, Boolean.TRUE);
        return false;
    }
}
