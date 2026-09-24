package com.mbridge.msdk.mbsignalcommon.mraid;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mraid.b */
/* JADX INFO: compiled from: IMraidSignalCommunication.java */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC13381b {
    void close();

    void expand(String str, boolean z);

    CampaignEx getMraidCampaign();

    void open(String str);

    void unload();

    void useCustomClose(boolean z);
}
