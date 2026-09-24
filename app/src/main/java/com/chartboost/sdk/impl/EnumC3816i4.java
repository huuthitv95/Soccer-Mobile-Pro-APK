package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.i4 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3816i4 {
    CLICK_PREFERENCE_EMBEDDED(0),
    CLICK_PREFERENCE_NATIVE(1);


    /* JADX INFO: renamed from: b */
    public final int f14558b;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumEntries f14557g = EnumEntriesKt.enumEntries(m17957a());

    /* JADX INFO: renamed from: c */
    public static final a f14553c = new a(null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.i4$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC3816i4 m17959a(int i) {
            if (i != 0 && i == 1) {
                return EnumC3816i4.CLICK_PREFERENCE_NATIVE;
            }
            return EnumC3816i4.CLICK_PREFERENCE_EMBEDDED;
        }
    }

    EnumC3816i4(int i) {
        this.f14558b = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m17958b() {
        return this.f14558b;
    }
}
