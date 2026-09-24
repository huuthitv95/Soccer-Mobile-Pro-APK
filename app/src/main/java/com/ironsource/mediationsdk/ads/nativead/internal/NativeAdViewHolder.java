package com.ironsource.mediationsdk.ads.nativead.internal;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;

/* JADX INFO: loaded from: classes6.dex */
public final class NativeAdViewHolder {

    /* JADX INFO: renamed from: a */
    private View f31011a;

    /* JADX INFO: renamed from: b */
    private View f31012b;

    /* JADX INFO: renamed from: c */
    private View f31013c;

    /* JADX INFO: renamed from: d */
    private View f31014d;

    /* JADX INFO: renamed from: e */
    private LevelPlayMediaView f31015e;

    /* JADX INFO: renamed from: f */
    private View f31016f;

    public final View getAdvertiserView() {
        return this.f31012b;
    }

    public final View getBodyView() {
        return this.f31014d;
    }

    public final View getCallToActionView() {
        return this.f31016f;
    }

    public final View getIconView() {
        return this.f31013c;
    }

    public final LevelPlayMediaView getMediaView() {
        return this.f31015e;
    }

    public final View getTitleView() {
        return this.f31011a;
    }

    public final void setAdvertiserView(View view) {
        this.f31012b = view;
    }

    public final void setBodyView(View view) {
        this.f31014d = view;
    }

    public final void setCallToActionView(View view) {
        this.f31016f = view;
    }

    public final void setIconView(View view) {
        this.f31013c = view;
    }

    public final void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f31015e = levelPlayMediaView;
    }

    public final void setTitleView(View view) {
        this.f31011a = view;
    }
}
