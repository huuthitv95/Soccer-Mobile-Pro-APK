package com.iab.omid.library.chartboost.walking;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.C11021a;
import com.iab.omid.library.chartboost.internal.C11031c;
import com.iab.omid.library.chartboost.internal.C11033e;
import com.iab.omid.library.chartboost.utils.C11053h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11058a {

    /* JADX INFO: renamed from: a */
    private final HashMap<View, String> f23048a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private final HashMap<View, a> f23049b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private final HashMap<String, View> f23050c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private final HashSet<View> f23051d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    private final HashSet<String> f23052e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    private final HashSet<String> f23053f = new HashSet<>();

    /* JADX INFO: renamed from: g */
    private final HashMap<String, String> f23054g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    private final HashSet<String> f23055h = new HashSet<>();

    /* JADX INFO: renamed from: i */
    private final Map<View, Boolean> f23056i = new WeakHashMap();

    /* JADX INFO: renamed from: j */
    private boolean f23057j;

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C11033e f23058a;

        /* JADX INFO: renamed from: b */
        private final ArrayList<String> f23059b = new ArrayList<>();

        public a(C11033e c11033e, String str) {
            this.f23058a = c11033e;
            m23913a(str);
        }

        /* JADX INFO: renamed from: a */
        public C11033e m23912a() {
            return this.f23058a;
        }

        /* JADX INFO: renamed from: a */
        public void m23913a(String str) {
            this.f23059b.add(str);
        }

        /* JADX INFO: renamed from: b */
        public ArrayList<String> m23914b() {
            return this.f23059b;
        }
    }

    /* JADX INFO: renamed from: a */
    private Boolean m23896a(View view) {
        if (view.hasWindowFocus()) {
            this.f23056i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f23056i.containsKey(view)) {
            return this.f23056i.get(view);
        }
        Map<View, Boolean> map = this.f23056i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    /* JADX INFO: renamed from: a */
    private String m23897a(View view, boolean z) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m23896a(view).booleanValue() && !z) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strM23868a = C11053h.m23868a(view);
            if (strM23868a != null) {
                return strM23868a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f23051d.addAll(hashSet);
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m23898a(C11021a c11021a) {
        Iterator<C11033e> it = c11021a.m23680f().iterator();
        while (it.hasNext()) {
            m23899a(it.next(), c11021a);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23899a(C11033e c11033e, C11021a c11021a) {
        View view = c11033e.m23741c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f23049b.get(view);
        if (aVar != null) {
            aVar.m23913a(c11021a.m23677c());
        } else {
            this.f23049b.put(view, new a(c11033e, c11021a.m23677c()));
        }
    }

    /* JADX INFO: renamed from: a */
    public View m23900a(String str) {
        return this.f23050c.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m23901a() {
        this.f23048a.clear();
        this.f23049b.clear();
        this.f23050c.clear();
        this.f23051d.clear();
        this.f23052e.clear();
        this.f23053f.clear();
        this.f23054g.clear();
        this.f23057j = false;
        this.f23055h.clear();
    }

    /* JADX INFO: renamed from: b */
    public a m23902b(View view) {
        a aVar = this.f23049b.get(view);
        if (aVar != null) {
            this.f23049b.remove(view);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public String m23903b(String str) {
        return this.f23054g.get(str);
    }

    /* JADX INFO: renamed from: b */
    public HashSet<String> m23904b() {
        return this.f23053f;
    }

    /* JADX INFO: renamed from: c */
    public String m23905c(View view) {
        if (this.f23048a.size() == 0) {
            return null;
        }
        String str = this.f23048a.get(view);
        if (str != null) {
            this.f23048a.remove(view);
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public HashSet<String> m23906c() {
        return this.f23052e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m23907c(String str) {
        return this.f23055h.contains(str);
    }

    /* JADX INFO: renamed from: d */
    public EnumC11066c m23908d(View view) {
        if (this.f23051d.contains(view)) {
            return EnumC11066c.PARENT_VIEW;
        }
        return this.f23057j ? EnumC11066c.OBSTRUCTION_VIEW : EnumC11066c.UNDERLYING_VIEW;
    }

    /* JADX INFO: renamed from: d */
    public void m23909d() {
        this.f23057j = true;
    }

    /* JADX INFO: renamed from: e */
    public void m23910e() {
        C11031c c11031cM23724c = C11031c.m23724c();
        if (c11031cM23724c != null) {
            for (C11021a c11021a : c11031cM23724c.m23725a()) {
                View viewM23679e = c11021a.m23679e();
                if (c11021a.m23682h()) {
                    String strM23677c = c11021a.m23677c();
                    if (viewM23679e != null) {
                        boolean zM23872e = C11053h.m23872e(viewM23679e);
                        if (zM23872e) {
                            this.f23055h.add(strM23677c);
                        }
                        String strM23897a = m23897a(viewM23679e, zM23872e);
                        if (strM23897a == null) {
                            this.f23052e.add(strM23677c);
                            this.f23048a.put(viewM23679e, strM23677c);
                            m23898a(c11021a);
                        } else if (strM23897a != "noWindowFocus") {
                            this.f23053f.add(strM23677c);
                            this.f23050c.put(strM23677c, viewM23679e);
                            this.f23054g.put(strM23677c, strM23897a);
                        }
                    } else {
                        this.f23053f.add(strM23677c);
                        this.f23054g.put(strM23677c, "noAdView");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m23911e(View view) {
        if (!this.f23056i.containsKey(view)) {
            return true;
        }
        this.f23056i.put(view, Boolean.TRUE);
        return false;
    }
}
