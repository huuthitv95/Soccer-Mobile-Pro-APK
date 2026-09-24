package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.C10970a;
import com.iab.omid.library.bytedance2.internal.C10980c;
import com.iab.omid.library.bytedance2.internal.C10982e;
import com.iab.omid.library.bytedance2.utils.C11001h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11006a {

    /* JADX INFO: renamed from: a */
    private final HashMap<View, String> f22908a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private final HashMap<View, a> f22909b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private final HashMap<String, View> f22910c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private final HashSet<View> f22911d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    private final HashSet<String> f22912e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    private final HashSet<String> f22913f = new HashSet<>();

    /* JADX INFO: renamed from: g */
    private final HashMap<String, String> f22914g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    private final Map<View, Boolean> f22915h = new WeakHashMap();

    /* JADX INFO: renamed from: i */
    private boolean f22916i;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C10982e f22917a;

        /* JADX INFO: renamed from: b */
        private final ArrayList<String> f22918b = new ArrayList<>();

        public a(C10982e c10982e, String str) {
            this.f22917a = c10982e;
            m23653a(str);
        }

        /* JADX INFO: renamed from: a */
        public C10982e m23652a() {
            return this.f22917a;
        }

        /* JADX INFO: renamed from: a */
        public void m23653a(String str) {
            this.f22918b.add(str);
        }

        /* JADX INFO: renamed from: b */
        public ArrayList<String> m23654b() {
            return this.f22918b;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m23637a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m23640b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strM23611a = C11001h.m23611a(view);
            if (strM23611a != null) {
                return strM23611a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f22911d.addAll(hashSet);
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m23638a(C10970a c10970a) {
        Iterator<C10982e> it = c10970a.m23437d().iterator();
        while (it.hasNext()) {
            m23639a(it.next(), c10970a);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23639a(C10982e c10982e, C10970a c10970a) {
        View view = c10982e.m23494c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f22909b.get(view);
        if (aVar != null) {
            aVar.m23653a(c10970a.getAdSessionId());
        } else {
            this.f22909b.put(view, new a(c10982e, c10970a.getAdSessionId()));
        }
    }

    /* JADX INFO: renamed from: b */
    private Boolean m23640b(View view) {
        if (view.hasWindowFocus()) {
            this.f22915h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f22915h.containsKey(view)) {
            return this.f22915h.get(view);
        }
        Map<View, Boolean> map = this.f22915h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    /* JADX INFO: renamed from: a */
    public View m23641a(String str) {
        return this.f22910c.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m23642a() {
        this.f22908a.clear();
        this.f22909b.clear();
        this.f22910c.clear();
        this.f22911d.clear();
        this.f22912e.clear();
        this.f22913f.clear();
        this.f22914g.clear();
        this.f22916i = false;
    }

    /* JADX INFO: renamed from: b */
    public String m23643b(String str) {
        return this.f22914g.get(str);
    }

    /* JADX INFO: renamed from: b */
    public HashSet<String> m23644b() {
        return this.f22913f;
    }

    /* JADX INFO: renamed from: c */
    public a m23645c(View view) {
        a aVar = this.f22909b.get(view);
        if (aVar != null) {
            this.f22909b.remove(view);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: c */
    public HashSet<String> m23646c() {
        return this.f22912e;
    }

    /* JADX INFO: renamed from: d */
    public String m23647d(View view) {
        if (this.f22908a.size() == 0) {
            return null;
        }
        String str = this.f22908a.get(view);
        if (str != null) {
            this.f22908a.remove(view);
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public void m23648d() {
        this.f22916i = true;
    }

    /* JADX INFO: renamed from: e */
    public EnumC11014c m23649e(View view) {
        if (this.f22911d.contains(view)) {
            return EnumC11014c.PARENT_VIEW;
        }
        return this.f22916i ? EnumC11014c.OBSTRUCTION_VIEW : EnumC11014c.UNDERLYING_VIEW;
    }

    /* JADX INFO: renamed from: e */
    public void m23650e() {
        C10980c c10980cM23477c = C10980c.m23477c();
        if (c10980cM23477c != null) {
            for (C10970a c10970a : c10980cM23477c.m23478a()) {
                View viewM23436c = c10970a.m23436c();
                if (c10970a.m23439f()) {
                    String adSessionId = c10970a.getAdSessionId();
                    if (viewM23436c != null) {
                        String strM23637a = m23637a(viewM23436c);
                        if (strM23637a == null) {
                            this.f22912e.add(adSessionId);
                            this.f22908a.put(viewM23436c, adSessionId);
                            m23638a(c10970a);
                        } else if (strM23637a != "noWindowFocus") {
                            this.f22913f.add(adSessionId);
                            this.f22910c.put(adSessionId, viewM23436c);
                            this.f22914g.put(adSessionId, strM23637a);
                        }
                    } else {
                        this.f22913f.add(adSessionId);
                        this.f22914g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m23651f(View view) {
        if (!this.f22915h.containsKey(view)) {
            return true;
        }
        this.f22915h.put(view, Boolean.TRUE);
        return false;
    }
}
