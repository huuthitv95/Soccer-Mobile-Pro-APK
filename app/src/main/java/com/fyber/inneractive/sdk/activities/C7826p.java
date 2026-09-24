package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C7826p implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f17500a;

    public C7826p(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f17500a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f17500a.finish();
    }
}
