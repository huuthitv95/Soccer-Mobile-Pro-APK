package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4002q9 {
    NONE(0),
    TOP(1),
    LEFT(2),
    BOTTOM(4),
    RIGHT(8),
    ALL(15);


    /* JADX INFO: renamed from: b */
    public final int f15899b;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumEntries f15898k = EnumEntriesKt.enumEntries(m19148a());

    /* JADX INFO: renamed from: c */
    public static final a f15890c = new a(null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q9$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m19150a(int i) {
            return (i & EnumC4002q9.BOTTOM.m19149b()) != 0;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m19151b(int i) {
            return (i & EnumC4002q9.LEFT.m19149b()) != 0;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m19152c(int i) {
            return (i & EnumC4002q9.RIGHT.m19149b()) != 0;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m19153d(int i) {
            return (i & EnumC4002q9.TOP.m19149b()) != 0;
        }
    }

    EnumC4002q9(int i) {
        this.f15899b = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m19149b() {
        return this.f15899b;
    }
}
