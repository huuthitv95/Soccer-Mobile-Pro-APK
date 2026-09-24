package com.ironsource;

import android.app.Activity;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.D8 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11398D8 {

    /* JADX INFO: renamed from: com.ironsource.D8$a */
    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(String str);

        void onNativeAdLoadSuccess(C11362B8 c11362b8);

        void onNativeAdShown();
    }

    /* JADX INFO: renamed from: a */
    void mo25607a();

    /* JADX INFO: renamed from: a */
    void mo25608a(Activity activity, JSONObject jSONObject);

    /* JADX INFO: renamed from: a */
    void mo25609a(a aVar);

    /* JADX INFO: renamed from: a */
    void mo25610a(C11416E8 c11416e8);

    /* JADX INFO: renamed from: b */
    a mo25611b();

    /* JADX INFO: renamed from: c */
    C11362B8 mo25612c();
}
