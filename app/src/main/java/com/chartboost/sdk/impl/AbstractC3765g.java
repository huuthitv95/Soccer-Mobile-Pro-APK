package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3765g extends Exception {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.g$a */
    public static final class a extends AbstractC3765g {

        /* JADX INFO: renamed from: b */
        public static final a f14258b = new a();

        public a() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 400454163;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BAD_BASE_64";
        }
    }

    public AbstractC3765g() {
    }

    public /* synthetic */ AbstractC3765g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
