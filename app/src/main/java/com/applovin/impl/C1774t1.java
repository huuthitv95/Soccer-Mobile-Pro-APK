package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.applovin.impl.t1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1774t1 {

    /* JADX INFO: renamed from: b */
    private final String f3274b;

    /* JADX INFO: renamed from: c */
    private final Map f3275c;

    /* JADX INFO: renamed from: a */
    private final String f3273a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: d */
    private final long f3276d = System.currentTimeMillis();

    public C1774t1(String str, Map map) {
        this.f3274b = str;
        this.f3275c = map;
    }

    /* JADX INFO: renamed from: a */
    public long m5206a() {
        return this.f3276d;
    }

    /* JADX INFO: renamed from: b */
    public String m5207b() {
        return this.f3273a;
    }

    /* JADX INFO: renamed from: c */
    public String m5208c() {
        return this.f3274b;
    }

    /* JADX INFO: renamed from: d */
    public Map m5209d() {
        return this.f3275c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1774t1 c1774t1 = (C1774t1) obj;
        if (this.f3276d == c1774t1.f3276d && Objects.equals(this.f3274b, c1774t1.f3274b) && Objects.equals(this.f3275c, c1774t1.f3275c)) {
            return Objects.equals(this.f3273a, c1774t1.f3273a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3274b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f3275c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j = this.f3276d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f3273a;
        return i + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f3274b + "', id='" + this.f3273a + "', creationTimestampMillis=" + this.f3276d + ", parameters=" + this.f3275c + AbstractJsonLexerKt.END_OBJ;
    }
}
