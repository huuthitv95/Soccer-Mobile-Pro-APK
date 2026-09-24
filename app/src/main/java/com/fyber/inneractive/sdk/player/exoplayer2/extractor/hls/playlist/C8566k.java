package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C8541b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C8549j;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8721f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC8715b;
import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC8716c;
import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC8719d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8761b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8778d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C8566k implements InterfaceC8799x {

    /* JADX INFO: renamed from: a */
    public final C8541b f19369a;

    /* JADX INFO: renamed from: f */
    public final C8549j f19374f;

    /* JADX INFO: renamed from: i */
    public final C8721f f19377i;

    /* JADX INFO: renamed from: j */
    public C8557b f19378j;

    /* JADX INFO: renamed from: k */
    public C8556a f19379k;

    /* JADX INFO: renamed from: l */
    public C8559d f19380l;

    /* JADX INFO: renamed from: m */
    public boolean f19381m;

    /* JADX INFO: renamed from: c */
    public final int f19371c = 3;

    /* JADX INFO: renamed from: g */
    public final ArrayList f19375g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final C8761b0 f19376h = new C8761b0("HlsPlaylistTracker:MasterPlaylist");

    /* JADX INFO: renamed from: b */
    public final C8562g f19370b = new C8562g();

    /* JADX INFO: renamed from: d */
    public final IdentityHashMap f19372d = new IdentityHashMap();

    /* JADX INFO: renamed from: e */
    public final Handler f19373e = new Handler();

    public C8566k(Uri uri, C8541b c8541b, C8721f c8721f, C8549j c8549j) {
        this.f19369a = c8541b;
        this.f19377i = c8721f;
        this.f19374f = c8549j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x
    /* JADX INFO: renamed from: a */
    public final int mo21091a(InterfaceC8801z interfaceC8801z, long j, long j2, IOException iOException) {
        C8778d0 c8778d0 = (C8778d0) interfaceC8801z;
        boolean z = iOException instanceof C8711r;
        C8721f c8721f = this.f19377i;
        C8786k c8786k = c8778d0.f20523a;
        long j3 = c8778d0.f20528f;
        if (c8721f.f20351b != null) {
            c8721f.f20350a.post(new RunnableC8719d(c8721f, c8786k, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z));
        }
        return z ? 3 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final C8559d m21108a(C8556a c8556a) {
        C8559d c8559d;
        RunnableC8563h runnableC8563h = (RunnableC8563h) this.f19372d.get(c8556a);
        runnableC8563h.getClass();
        runnableC8563h.f19364g = SystemClock.elapsedRealtime();
        C8559d c8559d2 = runnableC8563h.f19361d;
        if (c8559d2 != null && this.f19378j.f19304b.contains(c8556a) && (((c8559d = this.f19380l) == null || !c8559d.f19326j) && ((RunnableC8563h) this.f19372d.get(this.f19379k)).f19364g - SystemClock.elapsedRealtime() > 15000)) {
            this.f19379k = c8556a;
            ((RunnableC8563h) this.f19372d.get(c8556a)).m21107b();
        }
        return c8559d2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x
    /* JADX INFO: renamed from: a */
    public final void mo21094a(InterfaceC8801z interfaceC8801z, long j, long j2) {
        C8557b c8557b;
        C8778d0 c8778d0 = (C8778d0) interfaceC8801z;
        AbstractC8560e abstractC8560e = c8778d0.f20526d;
        boolean z = abstractC8560e instanceof C8559d;
        if (z) {
            List listSingletonList = Collections.singletonList(new C8556a(abstractC8560e.f19332a, new C8708o("0", "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
            List list = Collections.EMPTY_LIST;
            c8557b = new C8557b(null, listSingletonList, list, list, null, null);
        } else {
            c8557b = (C8557b) abstractC8560e;
        }
        this.f19378j = c8557b;
        this.f19379k = (C8556a) c8557b.f19304b.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c8557b.f19304b);
        arrayList.addAll(c8557b.f19305c);
        arrayList.addAll(c8557b.f19306d);
        int size = arrayList.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C8556a c8556a = (C8556a) arrayList.get(i);
            this.f19372d.put(c8556a, new RunnableC8563h(this, c8556a, jElapsedRealtime));
        }
        RunnableC8563h runnableC8563h = (RunnableC8563h) this.f19372d.get(this.f19379k);
        if (z) {
            runnableC8563h.m21106a((C8559d) abstractC8560e);
        } else {
            runnableC8563h.m21107b();
        }
        C8721f c8721f = this.f19377i;
        C8786k c8786k = c8778d0.f20523a;
        long j3 = c8778d0.f20528f;
        if (c8721f.f20351b != null) {
            c8721f.f20350a.post(new RunnableC8715b(c8721f, c8786k, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x
    /* JADX INFO: renamed from: a */
    public final void mo21095a(InterfaceC8801z interfaceC8801z, long j, long j2, boolean z) {
        C8778d0 c8778d0 = (C8778d0) interfaceC8801z;
        C8721f c8721f = this.f19377i;
        C8786k c8786k = c8778d0.f20523a;
        long j3 = c8778d0.f20528f;
        if (c8721f.f20351b != null) {
            c8721f.f20350a.post(new RunnableC8716c(c8721f, c8786k, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3));
        }
    }
}
