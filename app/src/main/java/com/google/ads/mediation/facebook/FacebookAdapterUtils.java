package com.google.ads.mediation.facebook;

import com.ironsource.C12644zf;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: FacebookAdapterUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m43474d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m43475d2 = {"Lcom/google/ads/mediation/facebook/FacebookAdapterUtils;", "", "<init>", "()V", C12644zf.f33347b, "", "getAdapterVersion$annotations", "getAdapterVersion", "()Ljava/lang/String;", "meta_release"}, m43476k = 1, m43477mv = {2, 1, 0}, m43479xi = 48)
public final class FacebookAdapterUtils {
    public static final FacebookAdapterUtils INSTANCE = new FacebookAdapterUtils();

    private FacebookAdapterUtils() {
    }

    public static final String getAdapterVersion() {
        return BuildConfig.ADAPTER_VERSION;
    }

    @JvmStatic
    public static /* synthetic */ void getAdapterVersion$annotations() {
    }
}
