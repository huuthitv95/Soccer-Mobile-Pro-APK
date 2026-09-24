package com.chartboost.sdk.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.yf */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4184yf {
    MRAID(CampaignEx.JSON_KEY_MRAID),
    HTML("html"),
    VAST("vast"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: b */
    public final String f17059b;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumEntries f17058i = EnumEntriesKt.enumEntries(m20057a());

    /* JADX INFO: renamed from: c */
    public static final a f17052c = new a(null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.yf$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC4184yf m20060a(String str) {
            Object next;
            Iterator<E> it = EnumC4184yf.m20058b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.equals(((EnumC4184yf) next).m20059c(), str, true));
            EnumC4184yf enumC4184yf = (EnumC4184yf) next;
            return enumC4184yf == null ? EnumC4184yf.UNKNOWN : enumC4184yf;
        }
    }

    EnumC4184yf(String str) {
        this.f17059b = str;
    }

    /* JADX INFO: renamed from: b */
    public static EnumEntries m20058b() {
        return f17058i;
    }

    /* JADX INFO: renamed from: c */
    public final String m20059c() {
        return this.f17059b;
    }
}
