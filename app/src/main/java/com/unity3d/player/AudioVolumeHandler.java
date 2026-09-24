package com.unity3d.player;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class AudioVolumeHandler implements C14681b.b {

    /* JADX INFO: renamed from: a */
    private C14681b f41512a;

    AudioVolumeHandler(Context context) {
        C14681b c14681b = new C14681b(context);
        this.f41512a = c14681b;
        c14681b.m43267a(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m43202a() {
        this.f41512a.m43266a();
        this.f41512a = null;
    }

    @Override // com.unity3d.player.C14681b.b
    public final native void onAudioVolumeChanged(int i);
}
