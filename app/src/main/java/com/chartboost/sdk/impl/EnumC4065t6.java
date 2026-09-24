package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.t6 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4065t6 {
    NONE(0),
    STOPPED_QUEUE(1),
    MAX_COUNT_TIME_WINDOW(2),
    FORCED_OUT(3);


    /* JADX INFO: renamed from: b */
    public final int f16327b;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumEntries f16326i = EnumEntriesKt.enumEntries(m19458a());

    /* JADX INFO: renamed from: c */
    public static final a f16320c = new a(null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.t6$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    EnumC4065t6(int i) {
        this.f16327b = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m19459b() {
        return this.f16327b;
    }
}
