package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.d3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3700d3 {

    /* JADX INFO: renamed from: c */
    public static final a f13797c = new a(null);

    /* JADX INFO: renamed from: a */
    public final Object f13798a;

    /* JADX INFO: renamed from: b */
    public final CBError f13799b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.d3$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3700d3 m17257a(CBError cBError) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new C3700d3(defaultConstructorMarker, cBError, defaultConstructorMarker);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final C3700d3 m17258a(Object obj) {
            return new C3700d3(obj, null, 0 == true ? 1 : 0);
        }
    }

    public C3700d3(Object obj, CBError cBError) {
        this.f13798a = obj;
        this.f13799b = cBError;
    }

    public /* synthetic */ C3700d3(Object obj, CBError cBError, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cBError);
    }

    /* JADX INFO: renamed from: a */
    public static final C3700d3 m17256a(CBError cBError) {
        return f13797c.m17257a(cBError);
    }
}
