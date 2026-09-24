package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.controller.C8456b0;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8556a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8566k;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.RunnableC8563h;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8721f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8735t;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8761b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8778d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.HandlerC8800y;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8760b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8782g;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C8549j implements InterfaceC8736u {

    /* JADX INFO: renamed from: a */
    public final Uri f19260a;

    /* JADX INFO: renamed from: b */
    public final C8541b f19261b;

    /* JADX INFO: renamed from: c */
    public final C8721f f19262c;

    /* JADX INFO: renamed from: d */
    public C8566k f19263d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8735t f19264e;

    public C8549j(Uri uri, InterfaceC8782g interfaceC8782g, Handler handler, C8456b0 c8456b0) {
        C8541b c8541b = new C8541b(interfaceC8782g);
        this.f19260a = uri;
        this.f19261b = c8541b;
        this.f19262c = new C8721f(handler, c8456b0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u
    /* JADX INFO: renamed from: a */
    public final InterfaceC8734s mo21080a(int i, InterfaceC8760b interfaceC8760b, long j) {
        if (i == 0) {
            return new C8548i(this.f19263d, this.f19261b, this.f19262c, interfaceC8760b, j);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u
    /* JADX INFO: renamed from: a */
    public final void mo21081a() throws IOException {
        C8566k c8566k = this.f19263d;
        c8566k.f19376h.m21288b();
        C8556a c8556a = c8566k.f19379k;
        if (c8556a != null) {
            RunnableC8563h runnableC8563h = (RunnableC8563h) c8566k.f19372d.get(c8556a);
            runnableC8563h.f19359b.m21288b();
            IOException iOException = runnableC8563h.f19367j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u
    /* JADX INFO: renamed from: a */
    public final void mo21082a(InterfaceC8734s interfaceC8734s) {
        C8548i c8548i = (C8548i) interfaceC8734s;
        c8548i.f19244a.f19375g.remove(c8548i);
        c8548i.f19251h.removeCallbacksAndMessages(null);
        C8553n[] c8553nArr = c8548i.f19257n;
        if (c8553nArr != null) {
            for (C8553n c8553n : c8553nArr) {
                int size = c8553n.f19277j.size();
                for (int i = 0; i < size; i++) {
                    ((C8538g) c8553n.f19277j.valueAt(i)).m21056b();
                }
                c8553n.f19274g.m21286a(null);
                c8553n.f19280m.removeCallbacksAndMessages(null);
                c8553n.f19286s = true;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u
    /* JADX INFO: renamed from: a */
    public final void mo21083a(InterfaceC8735t interfaceC8735t) {
        if (this.f19263d != null) {
            throw new IllegalStateException();
        }
        Uri uri = this.f19260a;
        C8541b c8541b = this.f19261b;
        C8566k c8566k = new C8566k(uri, c8541b, this.f19262c, this);
        this.f19263d = c8566k;
        this.f19264e = interfaceC8735t;
        C8778d0 c8778d0 = new C8778d0(c8541b.f19194a.mo20831a(), uri, c8566k.f19370b);
        C8761b0 c8761b0 = c8566k.f19376h;
        c8761b0.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        HandlerC8800y handlerC8800y = new HandlerC8800y(c8761b0, looperMyLooper, c8778d0, c8566k, 3, SystemClock.elapsedRealtime());
        if (c8761b0.f20453b != null) {
            throw new IllegalStateException();
        }
        c8761b0.f20453b = handlerC8800y;
        handlerC8800y.f20604e = null;
        c8761b0.f20452a.execute(handlerC8800y);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u
    /* JADX INFO: renamed from: b */
    public final void mo21084b() {
        C8566k c8566k = this.f19263d;
        if (c8566k != null) {
            c8566k.f19376h.m21286a(null);
            Iterator it = c8566k.f19372d.values().iterator();
            while (it.hasNext()) {
                ((RunnableC8563h) it.next()).f19359b.m21286a(null);
            }
            c8566k.f19373e.removeCallbacksAndMessages(null);
            c8566k.f19372d.clear();
            this.f19263d = null;
        }
        this.f19264e = null;
    }
}
