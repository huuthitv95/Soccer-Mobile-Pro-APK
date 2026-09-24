package com.iab.omid.library.mmadbridge.walking;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.C11175a;
import com.iab.omid.library.mmadbridge.internal.C11185c;
import com.iab.omid.library.mmadbridge.internal.C11187e;
import com.iab.omid.library.mmadbridge.utils.C11207h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11212a {

    /* JADX INFO: renamed from: a */
    private final HashMap<View, String> f23453a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private final HashMap<View, a> f23454b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private final HashMap<String, View> f23455c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private final HashSet<View> f23456d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    private final HashSet<String> f23457e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    private final HashSet<String> f23458f = new HashSet<>();

    /* JADX INFO: renamed from: g */
    private final HashMap<String, String> f23459g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    private final HashSet<String> f23460h = new HashSet<>();

    /* JADX INFO: renamed from: i */
    private final Map<View, Boolean> f23461i = new WeakHashMap();

    /* JADX INFO: renamed from: j */
    private boolean f23462j;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C11187e f23463a;

        /* JADX INFO: renamed from: b */
        private final ArrayList<String> f23464b = new ArrayList<>();

        public a(C11187e c11187e, String str) {
            this.f23463a = c11187e;
            m24675a(str);
        }

        /* JADX INFO: renamed from: a */
        public C11187e m24674a() {
            return this.f23463a;
        }

        /* JADX INFO: renamed from: a */
        public void m24675a(String str) {
            this.f23464b.add(str);
        }

        /* JADX INFO: renamed from: b */
        public ArrayList<String> m24676b() {
            return this.f23464b;
        }
    }

    /* JADX INFO: renamed from: a */
    private Boolean m24658a(View view) {
        if (view.hasWindowFocus()) {
            this.f23461i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f23461i.containsKey(view)) {
            return this.f23461i.get(view);
        }
        Map<View, Boolean> map = this.f23461i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    /* JADX INFO: renamed from: a */
    private String m24659a(View view, boolean z) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m24658a(view).booleanValue() && !z) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strM24630a = C11207h.m24630a(view);
            if (strM24630a != null) {
                return strM24630a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f23456d.addAll(hashSet);
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m24660a(C11175a c11175a) {
        Iterator<C11187e> it = c11175a.m24447d().iterator();
        while (it.hasNext()) {
            m24661a(it.next(), c11175a);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24661a(C11187e c11187e, C11175a c11175a) {
        View view = c11187e.m24504c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f23454b.get(view);
        if (aVar != null) {
            aVar.m24675a(c11175a.getAdSessionId());
        } else {
            this.f23454b.put(view, new a(c11187e, c11175a.getAdSessionId()));
        }
    }

    /* JADX INFO: renamed from: a */
    public View m24662a(String str) {
        return this.f23455c.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m24663a() {
        this.f23453a.clear();
        this.f23454b.clear();
        this.f23455c.clear();
        this.f23456d.clear();
        this.f23457e.clear();
        this.f23458f.clear();
        this.f23459g.clear();
        this.f23462j = false;
        this.f23460h.clear();
    }

    /* JADX INFO: renamed from: b */
    public a m24664b(View view) {
        a aVar = this.f23454b.get(view);
        if (aVar != null) {
            this.f23454b.remove(view);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public String m24665b(String str) {
        return this.f23459g.get(str);
    }

    /* JADX INFO: renamed from: b */
    public HashSet<String> m24666b() {
        return this.f23458f;
    }

    /* JADX INFO: renamed from: c */
    public String m24667c(View view) {
        if (this.f23453a.size() == 0) {
            return null;
        }
        String str = this.f23453a.get(view);
        if (str != null) {
            this.f23453a.remove(view);
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public HashSet<String> m24668c() {
        return this.f23457e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m24669c(String str) {
        return this.f23460h.contains(str);
    }

    /* JADX INFO: renamed from: d */
    public EnumC11220c m24670d(View view) {
        if (this.f23456d.contains(view)) {
            return EnumC11220c.PARENT_VIEW;
        }
        return this.f23462j ? EnumC11220c.OBSTRUCTION_VIEW : EnumC11220c.UNDERLYING_VIEW;
    }

    /* JADX INFO: renamed from: d */
    public void m24671d() {
        this.f23462j = true;
    }

    /* JADX INFO: renamed from: e */
    public void m24672e() {
        C11185c c11185cM24487c = C11185c.m24487c();
        if (c11185cM24487c != null) {
            for (C11175a c11175a : c11185cM24487c.m24488a()) {
                View viewM24446c = c11175a.m24446c();
                if (c11175a.m24449f()) {
                    String adSessionId = c11175a.getAdSessionId();
                    if (viewM24446c != null) {
                        boolean zM24634e = C11207h.m24634e(viewM24446c);
                        if (zM24634e) {
                            this.f23460h.add(adSessionId);
                        }
                        String strM24659a = m24659a(viewM24446c, zM24634e);
                        if (strM24659a == null) {
                            this.f23457e.add(adSessionId);
                            this.f23453a.put(viewM24446c, adSessionId);
                            m24660a(c11175a);
                        } else if (strM24659a != "noWindowFocus") {
                            this.f23458f.add(adSessionId);
                            this.f23455c.put(adSessionId, viewM24446c);
                            this.f23459g.put(adSessionId, strM24659a);
                        }
                    } else {
                        this.f23458f.add(adSessionId);
                        this.f23459g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m24673e(View view) {
        if (!this.f23461i.containsKey(view)) {
            return true;
        }
        this.f23461i.put(view, Boolean.TRUE);
        return false;
    }
}
