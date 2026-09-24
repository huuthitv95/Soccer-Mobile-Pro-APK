package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;

/* JADX INFO: renamed from: com.ironsource.N4 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11574N4 {

    /* JADX INFO: renamed from: com.ironsource.N4$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        ISDemandOnlyBannerLayout mo26640a(Activity activity, ISBannerSize iSBannerSize);

        /* JADX INFO: renamed from: a */
        void mo26641a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str);

        /* JADX INFO: renamed from: e */
        void mo26642e(String str);
    }

    /* JADX INFO: renamed from: com.ironsource.N4$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo26643a(Activity activity, String str);

        /* JADX INFO: renamed from: a */
        void mo26644a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener);

        /* JADX INFO: renamed from: b */
        void mo26645b(Activity activity, String str, String str2);

        /* JADX INFO: renamed from: c */
        void mo26646c(String str);

        /* JADX INFO: renamed from: d */
        boolean mo26647d(String str);
    }

    /* JADX INFO: renamed from: com.ironsource.N4$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo26648a(Activity activity, String str, String str2);

        /* JADX INFO: renamed from: a */
        void mo26649a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener);

        /* JADX INFO: renamed from: a */
        void mo26650a(String str);

        /* JADX INFO: renamed from: b */
        void mo26651b(Activity activity, String str);

        /* JADX INFO: renamed from: h */
        boolean mo26652h(String str);
    }

    /* JADX INFO: renamed from: a */
    String mo26639a(Context context);
}
