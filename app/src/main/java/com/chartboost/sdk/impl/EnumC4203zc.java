package com.chartboost.sdk.impl;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.zc */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4203zc {
    OPEN("open"),
    SET_ORIENTATION_PROPERTIES(MRAIDPresenter.SET_ORIENTATION_PROPERTIES),
    UNLOAD("unload");


    /* JADX INFO: renamed from: b */
    public final String f17125b;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumEntries f17124h = EnumEntriesKt.enumEntries(m20132a());

    /* JADX INFO: renamed from: c */
    public static final a f17119c = new a(null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.zc$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC4203zc m20134a(String stringValue) {
            Intrinsics.checkNotNullParameter(stringValue, "stringValue");
            EnumC4203zc enumC4203zc = EnumC4203zc.OPEN;
            if (Intrinsics.areEqual(stringValue, enumC4203zc.m20133b())) {
                return enumC4203zc;
            }
            EnumC4203zc enumC4203zc2 = EnumC4203zc.SET_ORIENTATION_PROPERTIES;
            if (Intrinsics.areEqual(stringValue, enumC4203zc2.m20133b())) {
                return enumC4203zc2;
            }
            EnumC4203zc enumC4203zc3 = EnumC4203zc.UNLOAD;
            if (Intrinsics.areEqual(stringValue, enumC4203zc3.m20133b())) {
                return enumC4203zc3;
            }
            throw new IllegalArgumentException("Not a valid MraidJSToNativeCommand.");
        }
    }

    EnumC4203zc(String str) {
        this.f17125b = str;
    }

    /* JADX INFO: renamed from: b */
    public final String m20133b() {
        return this.f17125b;
    }
}
