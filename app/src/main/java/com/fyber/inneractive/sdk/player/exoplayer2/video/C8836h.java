package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8836h {

    /* JADX INFO: renamed from: a */
    public final ChoreographerFrameCallbackC8835g f20733a;

    /* JADX INFO: renamed from: b */
    public final boolean f20734b;

    /* JADX INFO: renamed from: c */
    public final long f20735c;

    /* JADX INFO: renamed from: d */
    public final long f20736d;

    /* JADX INFO: renamed from: e */
    public long f20737e;

    /* JADX INFO: renamed from: f */
    public long f20738f;

    /* JADX INFO: renamed from: g */
    public long f20739g;

    /* JADX INFO: renamed from: h */
    public boolean f20740h;

    /* JADX INFO: renamed from: i */
    public long f20741i;

    /* JADX INFO: renamed from: j */
    public long f20742j;

    /* JADX INFO: renamed from: k */
    public long f20743k;

    public C8836h() {
        double refreshRate = ((WindowManager) IAConfigManager.f17654M.f17689u.m20436a().getSystemService("window")).getDefaultDisplay().getRefreshRate();
        this.f20734b = true;
        this.f20733a = ChoreographerFrameCallbackC8835g.f20728e;
        long j = (long) (1.0E9d / refreshRate);
        this.f20735c = j;
        this.f20736d = (j * 80) / 100;
    }
}
