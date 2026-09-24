package com.ironsource;

import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: renamed from: com.ironsource.hd */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC12233hd {
    PER_DAY("d"),
    PER_HOUR(CmcdData.Factory.STREAMING_FORMAT_HLS);


    /* JADX INFO: renamed from: a */
    public String f30500a;

    EnumC12233hd(String str) {
        this.f30500a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f30500a;
    }
}
