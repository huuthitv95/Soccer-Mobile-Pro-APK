package com.vungle.ads.fpd;

import kotlin.Metadata;

/* JADX INFO: compiled from: Demographic.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m43475d2 = {"Lcom/vungle/ads/fpd/LiftoffGender;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "FEMALE", "MALE", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public enum LiftoffGender {
    FEMALE(0),
    MALE(1);

    private final int value;

    LiftoffGender(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
