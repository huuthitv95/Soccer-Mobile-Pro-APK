package com.ironsource;

import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.F8 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11434F8 {

    /* JADX INFO: renamed from: com.ironsource.F8$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo25789a(String str);

        /* JADX INFO: renamed from: b */
        void mo25790b(String str);
    }

    /* JADX INFO: renamed from: a */
    void mo25784a(String str, String str2);

    /* JADX INFO: renamed from: a */
    void mo25785a(String str, String str2, String str3);

    /* JADX INFO: renamed from: a */
    void mo25786a(JSONObject jSONObject, String str, String str2);

    /* JADX INFO: renamed from: b */
    void mo25787b(JSONObject jSONObject, String str, String str2);

    /* JADX INFO: renamed from: c */
    void mo25788c(JSONObject jSONObject, String str, String str2) throws JSONException;

    WebView getPresentingView();
}
