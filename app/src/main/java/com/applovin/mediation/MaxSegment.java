package com.applovin.mediation;

import com.applovin.impl.sdk.C1768p;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class MaxSegment {

    /* JADX INFO: renamed from: a */
    private final int f4125a;

    /* JADX INFO: renamed from: b */
    private final List f4126b;

    public MaxSegment(int i, List<Integer> list) {
        this.f4125a = i;
        this.f4126b = list;
        m5767a(i);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            m5767a(it.next().intValue());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5767a(int i) {
        if (i >= 0) {
            return;
        }
        C1768p.m5167h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i);
    }

    public int getKey() {
        return this.f4125a;
    }

    public List<Integer> getValues() {
        return this.f4126b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f4125a + ", values=" + this.f4126b + AbstractJsonLexerKt.END_OBJ;
    }
}
