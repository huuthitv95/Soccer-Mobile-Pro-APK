package com.google.ads.mediation.unity;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.ironsource.C11744X3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MediationUtilsWrapper.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¨\u0006\u000b"}, m43475d2 = {"Lcom/google/ads/mediation/unity/MediationUtilsWrapper;", "", "<init>", "()V", "findClosestSize", "Lcom/google/android/gms/ads/AdSize;", "context", "Landroid/content/Context;", C11744X3.i.f26343O, "potentials", "", "unity_release"}, m43476k = 1, m43477mv = {2, 1, 0}, m43479xi = 48)
public final class MediationUtilsWrapper {
    public final AdSize findClosestSize(Context context, AdSize adSize, List<AdSize> potentials) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter(potentials, "potentials");
        return MediationUtils.findClosestSize(context, adSize, potentials);
    }
}
