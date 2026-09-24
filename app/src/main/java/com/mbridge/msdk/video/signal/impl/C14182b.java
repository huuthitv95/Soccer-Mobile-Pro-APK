package com.mbridge.msdk.video.signal.impl;

import android.content.res.Configuration;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.video.signal.InterfaceC14079b;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.b */
/* JADX INFO: compiled from: DefaultJSActivity.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14182b implements InterfaceC14079b {
    @Override // com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: a */
    public int mo42228a() {
        C13219q0.m37813a("DefaultJSActivity", "isSystemResume");
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: a */
    public void mo42229a(int i) {
        C13219q0.m37813a("DefaultJSActivity", "setSystemResume,isResume:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: a */
    public void mo42230a(Configuration configuration) {
        C13219q0.m37813a("DefaultJSActivity", "DefaultJSActivity-onConfigurationChanged:" + configuration.orientation);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: b */
    public void mo42231b() {
        C13219q0.m37813a("DefaultJSActivity", "DefaultJSActivity-onDestory");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: c */
    public void mo42232c() {
        C13219q0.m37813a("DefaultJSActivity", "DefaultJSActivity-onStop");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: d */
    public void mo42233d() {
        C13219q0.m37813a("DefaultJSActivity", "DefaultJSActivity-onResume");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: e */
    public void mo42234e() {
        C13219q0.m37813a("DefaultJSActivity", "DefaultJSActivity-onBackPressed");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: f */
    public void mo42235f() {
        C13219q0.m37813a("DefaultJSActivity", "DefaultJSActivity-onRestart");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: g */
    public void mo42236g() {
        C13219q0.m37813a("DefaultJSActivity", "DefaultJSActivity-onPause");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: h */
    public void mo42237h() {
        C13219q0.m37813a("DefaultJSActivity", "DefaultJSActivity-onStart");
    }
}
