package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C7824n implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f17498a;

    public C7824n(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f17498a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.m21945a("onPrepared", new Object[0]);
        InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore = this.f17498a;
        inneractiveRichMediaVideoPlayerActivityCore.f17479a.seekTo(inneractiveRichMediaVideoPlayerActivityCore.f17480b);
        this.f17498a.f17479a.start();
    }
}
