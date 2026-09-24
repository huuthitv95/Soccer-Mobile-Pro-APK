package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import androidx.work.WorkRequest;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8608a implements InterfaceC8628q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8609b f19794a;

    public C8608a(C8609b c8609b) {
        this.f19794a = c8609b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final long mo21019a(long j) {
        if (j == 0) {
            return this.f19794a.f19796b;
        }
        C8609b c8609b = this.f19794a;
        long j2 = (((long) c8609b.f19798d.f19841i) * j) / 1000000;
        long j3 = c8609b.f19796b;
        long j4 = c8609b.f19797c;
        long j5 = ((((j4 - j3) * j2) / c8609b.f19800f) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) + j3;
        if (j5 >= j3) {
            j3 = j5;
        }
        return j3 >= j4 ? j4 - 1 : j3;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final boolean mo21020a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: c */
    public final long mo21021c() {
        C8609b c8609b = this.f19794a;
        return (c8609b.f19800f * 1000000) / ((long) c8609b.f19798d.f19841i);
    }
}
