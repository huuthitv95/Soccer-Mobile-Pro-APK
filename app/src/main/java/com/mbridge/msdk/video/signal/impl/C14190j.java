package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.mbridge.msdk.video.p291bt.component.C13893d;
import com.mbridge.msdk.video.p291bt.module.MBridgeBTContainer;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.j */
/* JADX INFO: compiled from: JSBTModule.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14190j extends C14183c {

    /* JADX INFO: renamed from: b */
    private Activity f40930b;

    /* JADX INFO: renamed from: c */
    private MBridgeBTContainer f40931c;

    public C14190j(Activity activity, MBridgeBTContainer mBridgeBTContainer) {
        this.f40930b = activity;
        this.f40931c = mBridgeBTContainer;
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14183c, com.mbridge.msdk.video.signal.InterfaceC14080c
    public void reactDeveloper(Object obj, String str) {
        super.reactDeveloper(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.f40931c;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reactDeveloper(obj, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14183c, com.mbridge.msdk.video.signal.InterfaceC14080c
    public void reportUrls(Object obj, String str) {
        super.reportUrls(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.f40931c;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reportUrls(obj, str);
        } else {
            C13893d.m41513c().m41472c(obj, str);
        }
    }
}
