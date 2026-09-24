package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.q */
/* JADX INFO: loaded from: classes4.dex */
public final class C7827q implements MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f17501a;

    public C7827q(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f17501a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m21945a("Error: video can not be played.", new Object[0]);
        this.f17501a.finish();
        return false;
    }
}
