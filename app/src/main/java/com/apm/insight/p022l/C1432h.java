package com.apm.insight.p022l;

import com.facebook.internal.security.CertificateUtil;
import com.ironsource.C11744X3;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.l.h */
/* JADX INFO: compiled from: JSONWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1432h {

    /* JADX INFO: renamed from: a */
    private Writer f727a;

    /* JADX INFO: renamed from: b */
    private final List<a> f728b = new ArrayList();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.apm.insight.l.h$a */
    /* JADX INFO: compiled from: JSONWriter.java */
    static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f729a = new a("EMPTY_ARRAY", 0);

        /* JADX INFO: renamed from: b */
        public static final a f730b = new a("NONEMPTY_ARRAY", 1);

        /* JADX INFO: renamed from: c */
        public static final a f731c = new a("EMPTY_OBJECT", 2);

        /* JADX INFO: renamed from: d */
        public static final a f732d = new a("DANGLING_KEY", 3);

        /* JADX INFO: renamed from: e */
        public static final a f733e = new a("NONEMPTY_OBJECT", 4);

        /* JADX INFO: renamed from: f */
        public static final a f734f = new a("NULL", 5);

        private a(String str, int i) {
            super(str, i);
        }
    }

    private C1432h(Writer writer) {
        this.f727a = writer;
    }

    /* JADX INFO: renamed from: a */
    private C1432h m1349a() throws JSONException, IOException {
        return m1350a(a.f729a, C11744X3.j.f26438d);
    }

    /* JADX INFO: renamed from: a */
    private C1432h m1350a(a aVar, String str) throws JSONException, IOException {
        m1364f();
        this.f728b.add(aVar);
        this.f727a.write(str);
        return this;
    }

    /* JADX INFO: renamed from: a */
    private C1432h m1351a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            m1354a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            m1356a((JSONObject) obj);
            return this;
        }
        m1364f();
        if (obj == null || obj == JSONObject.NULL) {
            this.f727a.write(AbstractJsonLexerKt.NULL);
            return this;
        }
        if (obj instanceof Boolean) {
            this.f727a.write(String.valueOf(obj));
            return this;
        }
        if (obj instanceof Number) {
            this.f727a.write(JSONObject.numberToString((Number) obj));
            return this;
        }
        m1359b(obj.toString());
        return this;
    }

    /* JADX INFO: renamed from: a */
    private C1432h m1352a(String str) throws JSONException, IOException {
        m1363e();
        List<a> list = this.f728b;
        list.remove(list.size() - 1);
        this.f727a.write(str);
        return this;
    }

    /* JADX INFO: renamed from: a */
    private void m1353a(a aVar) {
        List<a> list = this.f728b;
        list.set(list.size() - 1, aVar);
    }

    /* JADX INFO: renamed from: a */
    private void m1354a(JSONArray jSONArray) throws JSONException, IOException {
        m1349a();
        for (int i = 0; i < jSONArray.length(); i++) {
            m1351a(jSONArray.get(i));
        }
        m1358b();
    }

    /* JADX INFO: renamed from: a */
    public static void m1355a(JSONArray jSONArray, Writer writer) throws Throwable {
        new C1432h(writer).m1354a(jSONArray);
        writer.flush();
    }

    /* JADX INFO: renamed from: a */
    private void m1356a(JSONObject jSONObject) throws JSONException, IOException {
        m1360c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            m1361c(next).m1351a(jSONObject.get(next));
        }
        m1362d();
    }

    /* JADX INFO: renamed from: a */
    public static void m1357a(JSONObject jSONObject, Writer writer) throws Throwable {
        new C1432h(writer).m1356a(jSONObject);
        writer.flush();
    }

    /* JADX INFO: renamed from: b */
    private C1432h m1358b() throws JSONException, IOException {
        a aVar = a.f729a;
        a aVar2 = a.f730b;
        return m1352a(C11744X3.j.f26440e);
    }

    /* JADX INFO: renamed from: b */
    private void m1359b(String str) throws IOException {
        this.f727a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                this.f727a.write("\\f");
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            this.f727a.write("\\b");
                            continue;
                        case '\t':
                            this.f727a.write("\\t");
                            continue;
                        case '\n':
                            this.f727a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f727a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                            }
                            break;
                    }
                } else {
                    this.f727a.write(92);
                }
                this.f727a.write(cCharAt);
            } else {
                this.f727a.write("\\r");
            }
        }
        this.f727a.write("\"");
    }

    /* JADX INFO: renamed from: c */
    private C1432h m1360c() throws JSONException, IOException {
        return m1350a(a.f731c, "{");
    }

    /* JADX INFO: renamed from: c */
    private C1432h m1361c(String str) throws JSONException, IOException {
        a aVarM1363e = m1363e();
        if (aVarM1363e == a.f733e) {
            this.f727a.write(44);
        } else if (aVarM1363e != a.f731c) {
            throw new JSONException("Nesting problem");
        }
        m1353a(a.f732d);
        m1359b(str);
        return this;
    }

    /* JADX INFO: renamed from: d */
    private C1432h m1362d() throws JSONException, IOException {
        a aVar = a.f731c;
        a aVar2 = a.f733e;
        return m1352a("}");
    }

    /* JADX INFO: renamed from: e */
    private a m1363e() throws JSONException {
        List<a> list = this.f728b;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: f */
    private void m1364f() throws JSONException, IOException {
        if (this.f728b.isEmpty()) {
            return;
        }
        a aVarM1363e = m1363e();
        if (aVarM1363e == a.f729a) {
            m1353a(a.f730b);
            return;
        }
        if (aVarM1363e == a.f730b) {
            this.f727a.write(44);
        } else if (aVarM1363e == a.f732d) {
            this.f727a.write(CertificateUtil.DELIMITER);
            m1353a(a.f733e);
        } else if (aVarM1363e != a.f734f) {
            throw new JSONException("Nesting problem");
        }
    }

    public final String toString() {
        return "";
    }
}
