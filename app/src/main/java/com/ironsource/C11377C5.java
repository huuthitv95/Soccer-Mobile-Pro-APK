package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.C5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11377C5 {

    /* JADX INFO: renamed from: a */
    private String f24128a;

    /* JADX INFO: renamed from: b */
    private boolean f24129b;

    /* JADX INFO: renamed from: c */
    private String f24130c;

    /* JADX INFO: renamed from: d */
    private InterfaceC11415E7 f24131d;

    /* JADX INFO: renamed from: e */
    private boolean f24132e;

    /* JADX INFO: renamed from: f */
    private ArrayList<Pair<String, String>> f24133f;

    /* JADX INFO: renamed from: com.ironsource.C5$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String f24134a;

        /* JADX INFO: renamed from: d */
        private InterfaceC11415E7 f24137d;

        /* JADX INFO: renamed from: b */
        private boolean f24135b = false;

        /* JADX INFO: renamed from: c */
        private String f24136c = "POST";

        /* JADX INFO: renamed from: e */
        private boolean f24138e = false;

        /* JADX INFO: renamed from: f */
        private ArrayList<Pair<String, String>> f24139f = new ArrayList<>();

        public a(String str) {
            this.f24134a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f24134a = str;
        }

        /* JADX INFO: renamed from: a */
        public a m25567a(InterfaceC11415E7 interfaceC11415E7) {
            this.f24137d = interfaceC11415E7;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m25572b(boolean z) {
            this.f24135b = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m25573c() {
            this.f24136c = "POST";
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m25566a(Pair<String, String> pair) {
            this.f24139f.add(pair);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m25571b() {
            this.f24136c = "GET";
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m25568a(List<Pair<String, String>> list) {
            this.f24139f.addAll(list);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m25569a(boolean z) {
            this.f24138e = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C11377C5 m25570a() {
            return new C11377C5(this);
        }
    }

    C11377C5(a aVar) {
        this.f24132e = false;
        this.f24128a = aVar.f24134a;
        this.f24129b = aVar.f24135b;
        this.f24130c = aVar.f24136c;
        this.f24131d = aVar.f24137d;
        this.f24132e = aVar.f24138e;
        if (aVar.f24139f != null) {
            this.f24133f = new ArrayList<>(aVar.f24139f);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m25560a() {
        return this.f24129b;
    }

    /* JADX INFO: renamed from: b */
    public String m25561b() {
        return this.f24128a;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC11415E7 m25562c() {
        return this.f24131d;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList<Pair<String, String>> m25563d() {
        return new ArrayList<>(this.f24133f);
    }

    /* JADX INFO: renamed from: e */
    public String m25564e() {
        return this.f24130c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m25565f() {
        return this.f24132e;
    }
}
