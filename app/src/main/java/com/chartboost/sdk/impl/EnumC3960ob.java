package com.chartboost.sdk.impl;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ob */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3960ob {
    CONCURRENT(0),
    SEQUENTIAL(1);


    /* JADX INFO: renamed from: b */
    public final int f15658b;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumEntries f15657g = EnumEntriesKt.enumEntries(m18903a());

    /* JADX INFO: renamed from: c */
    public static final a f15653c = new a(null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ob$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC3960ob m18906a(int i) {
            Object next;
            Iterator<E> it = EnumC3960ob.m18904b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((EnumC3960ob) next).m18905c() != i);
            EnumC3960ob enumC3960ob = (EnumC3960ob) next;
            return enumC3960ob == null ? EnumC3960ob.SEQUENTIAL : enumC3960ob;
        }
    }

    EnumC3960ob(int i) {
        this.f15658b = i;
    }

    /* JADX INFO: renamed from: b */
    public static EnumEntries m18904b() {
        return f15657g;
    }

    /* JADX INFO: renamed from: c */
    public final int m18905c() {
        return this.f15658b;
    }
}
