package com.iab.omid.library.vungle.messagelistener;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.messagelistener.b */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11302b {
    String getListenerName();

    void onMessageReceived(String str, JSONObject jSONObject);

    void onWebMessageListenerUnsupported();
}
