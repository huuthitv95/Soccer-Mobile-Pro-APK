package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.applovin.impl.q8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1702q8 {

    /* JADX INFO: renamed from: f */
    public static final C1702q8 f2669f = new C1702q8();

    /* JADX INFO: renamed from: a */
    private final C1702q8 f2670a;

    /* JADX INFO: renamed from: b */
    private final String f2671b;

    /* JADX INFO: renamed from: c */
    private final Map f2672c;

    /* JADX INFO: renamed from: d */
    protected String f2673d;

    /* JADX INFO: renamed from: e */
    protected final List f2674e;

    private C1702q8() {
        this.f2670a = null;
        this.f2671b = "";
        this.f2672c = Collections.EMPTY_MAP;
        this.f2673d = "";
        this.f2674e = Collections.EMPTY_LIST;
    }

    public C1702q8(String str, Map map, C1702q8 c1702q8) {
        this.f2670a = c1702q8;
        this.f2671b = str;
        this.f2672c = Collections.unmodifiableMap(map);
        this.f2674e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public List m4122a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f2674e.size());
        for (C1702q8 c1702q8 : this.f2674e) {
            if (str.equalsIgnoreCase(c1702q8.m4127c())) {
                arrayList.add(c1702q8);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public Map m4123a() {
        return this.f2672c;
    }

    /* JADX INFO: renamed from: b */
    public C1702q8 m4124b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f2674e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            C1702q8 c1702q8 = (C1702q8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(c1702q8.m4127c())) {
                return c1702q8;
            }
            arrayList.addAll(c1702q8.m4125b());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public List m4125b() {
        return Collections.unmodifiableList(this.f2674e);
    }

    /* JADX INFO: renamed from: c */
    public C1702q8 m4126c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (C1702q8 c1702q8 : this.f2674e) {
            if (str.equalsIgnoreCase(c1702q8.m4127c())) {
                return c1702q8;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public String m4127c() {
        return this.f2671b;
    }

    /* JADX INFO: renamed from: d */
    public String m4128d() {
        return this.f2673d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f2671b + "', text='" + this.f2673d + "', attributes=" + this.f2672c + AbstractJsonLexerKt.END_OBJ;
    }
}
