package com.vungle.ads;

import kotlin.Metadata;

/* JADX INFO: renamed from: com.vungle.ads.Ad */
/* JADX INFO: compiled from: BaseAd.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, m43475d2 = {"Lcom/vungle/ads/Ad;", "", "canPlayAd", "", "()Ljava/lang/Boolean;", "load", "", "adMarkup", "", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public interface InterfaceC14894Ad {

    /* JADX INFO: renamed from: com.vungle.ads.Ad$DefaultImpls */
    /* JADX INFO: compiled from: BaseAd.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 7, 1}, m43479xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void load$default(InterfaceC14894Ad interfaceC14894Ad, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            interfaceC14894Ad.load(str);
        }
    }

    Boolean canPlayAd();

    void load(String adMarkup);
}
