package com.fyber.inneractive.sdk.player.p277ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.flow.endcard.C8086d;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.t */
/* JADX INFO: loaded from: classes4.dex */
public final class C8903t extends C8891o {
    public C8903t(Context context, C8884h c8884h, C8006r c8006r) {
        super(context, null, c8884h, c8006r, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21434a(C8086d c8086d, C8878b c8878b) {
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.C8891o, com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m
    /* JADX INFO: renamed from: a */
    public final boolean mo21439a() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8888l
    /* JADX INFO: renamed from: b */
    public final void mo21456b(int i, int i2) {
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s, com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m
    /* JADX INFO: renamed from: c */
    public final boolean mo21459c() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8888l, com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public View getEndCardView() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.C8891o, com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public View[] getTrackingFriendlyView() {
        return new View[0];
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.C8891o, com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[0];
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8888l
    /* JADX INFO: renamed from: h */
    public final void mo21457h(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.C8891o
    /* JADX INFO: renamed from: q */
    public final void mo21460q() {
        setBackgroundColor(0);
        this.f20957m = (ViewGroup) findViewById(C7809R.id.ia_texture_view_host);
        removeView(findViewById(C7809R.id.ia_video_progressbar));
        ImageView imageView = (ImageView) findViewById(C7809R.id.ia_iv_mute_button);
        this.f20906N = imageView;
        removeView(imageView);
        this.f20906N = null;
        this.f20910R = findViewById(C7809R.id.ia_buffering_overlay);
        TextView textView = (TextView) findViewById(C7809R.id.ia_tv_call_to_action);
        this.f20905M = textView;
        removeView(textView);
        this.f20905M = null;
    }
}
