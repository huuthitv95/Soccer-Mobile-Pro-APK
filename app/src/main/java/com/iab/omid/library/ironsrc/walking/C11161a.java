package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.C11124a;
import com.iab.omid.library.ironsrc.internal.C11134c;
import com.iab.omid.library.ironsrc.internal.C11136e;
import com.iab.omid.library.ironsrc.utils.C11156h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11161a {

    /* JADX INFO: renamed from: a */
    private final HashMap<View, String> f23318a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private final HashMap<View, a> f23319b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private final HashMap<String, View> f23320c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private final HashSet<View> f23321d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    private final HashSet<String> f23322e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    private final HashSet<String> f23323f = new HashSet<>();

    /* JADX INFO: renamed from: g */
    private final HashMap<String, String> f23324g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    private final HashSet<String> f23325h = new HashSet<>();

    /* JADX INFO: renamed from: i */
    private final Map<View, Boolean> f23326i = new WeakHashMap();

    /* JADX INFO: renamed from: j */
    private boolean f23327j;

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C11136e f23328a;

        /* JADX INFO: renamed from: b */
        private final ArrayList<String> f23329b = new ArrayList<>();

        public a(C11136e c11136e, String str) {
            this.f23328a = c11136e;
            m24422a(str);
        }

        /* JADX INFO: renamed from: a */
        public C11136e m24421a() {
            return this.f23328a;
        }

        /* JADX INFO: renamed from: a */
        public void m24422a(String str) {
            this.f23329b.add(str);
        }

        /* JADX INFO: renamed from: b */
        public ArrayList<String> m24423b() {
            return this.f23329b;
        }
    }

    /* JADX INFO: renamed from: a */
    private Boolean m24405a(View view) {
        if (view.hasWindowFocus()) {
            this.f23326i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f23326i.containsKey(view)) {
            return this.f23326i.get(view);
        }
        Map<View, Boolean> map = this.f23326i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    /* JADX INFO: renamed from: a */
    private String m24406a(View view, boolean z) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m24405a(view).booleanValue() && !z) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strM24377a = C11156h.m24377a(view);
            if (strM24377a != null) {
                return strM24377a;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f23321d.addAll(hashSet);
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m24407a(C11124a c11124a) {
        Iterator<C11136e> it = c11124a.m24194d().iterator();
        while (it.hasNext()) {
            m24408a(it.next(), c11124a);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24408a(C11136e c11136e, C11124a c11124a) {
        View view = c11136e.m24251c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f23319b.get(view);
        if (aVar != null) {
            aVar.m24422a(c11124a.getAdSessionId());
        } else {
            this.f23319b.put(view, new a(c11136e, c11124a.getAdSessionId()));
        }
    }

    /* JADX INFO: renamed from: a */
    public View m24409a(String str) {
        return this.f23320c.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m24410a() {
        this.f23318a.clear();
        this.f23319b.clear();
        this.f23320c.clear();
        this.f23321d.clear();
        this.f23322e.clear();
        this.f23323f.clear();
        this.f23324g.clear();
        this.f23327j = false;
        this.f23325h.clear();
    }

    /* JADX INFO: renamed from: b */
    public a m24411b(View view) {
        a aVar = this.f23319b.get(view);
        if (aVar != null) {
            this.f23319b.remove(view);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public String m24412b(String str) {
        return this.f23324g.get(str);
    }

    /* JADX INFO: renamed from: b */
    public HashSet<String> m24413b() {
        return this.f23323f;
    }

    /* JADX INFO: renamed from: c */
    public String m24414c(View view) {
        if (this.f23318a.size() == 0) {
            return null;
        }
        String str = this.f23318a.get(view);
        if (str != null) {
            this.f23318a.remove(view);
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public HashSet<String> m24415c() {
        return this.f23322e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m24416c(String str) {
        return this.f23325h.contains(str);
    }

    /* JADX INFO: renamed from: d */
    public EnumC11169c m24417d(View view) {
        if (this.f23321d.contains(view)) {
            return EnumC11169c.PARENT_VIEW;
        }
        return this.f23327j ? EnumC11169c.OBSTRUCTION_VIEW : EnumC11169c.UNDERLYING_VIEW;
    }

    /* JADX INFO: renamed from: d */
    public void m24418d() {
        this.f23327j = true;
    }

    /* JADX INFO: renamed from: e */
    public void m24419e() {
        C11134c c11134cM24234c = C11134c.m24234c();
        if (c11134cM24234c != null) {
            for (C11124a c11124a : c11134cM24234c.m24235a()) {
                View viewM24193c = c11124a.m24193c();
                if (c11124a.m24196f()) {
                    String adSessionId = c11124a.getAdSessionId();
                    if (viewM24193c != null) {
                        boolean zM24381e = C11156h.m24381e(viewM24193c);
                        if (zM24381e) {
                            this.f23325h.add(adSessionId);
                        }
                        String strM24406a = m24406a(viewM24193c, zM24381e);
                        if (strM24406a == null) {
                            this.f23322e.add(adSessionId);
                            this.f23318a.put(viewM24193c, adSessionId);
                            m24407a(c11124a);
                        } else if (strM24406a != "noWindowFocus") {
                            this.f23323f.add(adSessionId);
                            this.f23320c.put(adSessionId, viewM24193c);
                            this.f23324g.put(adSessionId, strM24406a);
                        }
                    } else {
                        this.f23323f.add(adSessionId);
                        this.f23324g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m24420e(View view) {
        if (!this.f23326i.containsKey(view)) {
            return true;
        }
        this.f23326i.put(view, Boolean.TRUE);
        return false;
    }
}
