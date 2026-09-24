package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.player.cache.C8447i;
import com.fyber.inneractive.sdk.player.cache.C8452n;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8515b;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8845x;
import com.fyber.inneractive.sdk.player.exoplayer2.C8516c;
import com.fyber.inneractive.sdk.player.exoplayer2.C8525e;
import com.fyber.inneractive.sdk.player.exoplayer2.C8667g;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8528c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C8549j;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8732q;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8741z;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8753g;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C8750d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8788m;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8790o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8792q;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8782g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C8769f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C8773j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C8775l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9186s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8463f extends AbstractC8476q {

    /* JADX INFO: renamed from: A */
    public final boolean f18835A;

    /* JADX INFO: renamed from: B */
    public final CopyOnWriteArrayList f18836B;

    /* JADX INFO: renamed from: C */
    public InterfaceC8736u f18837C;

    /* JADX INFO: renamed from: D */
    public boolean f18838D;

    /* JADX INFO: renamed from: E */
    public int f18839E;

    /* JADX INFO: renamed from: p */
    public final int f18840p;

    /* JADX INFO: renamed from: q */
    public final C8006r f18841q;

    /* JADX INFO: renamed from: r */
    public final int f18842r;

    /* JADX INFO: renamed from: s */
    public C8667g f18843s;

    /* JADX INFO: renamed from: t */
    public int f18844t;

    /* JADX INFO: renamed from: u */
    public int f18845u;

    /* JADX INFO: renamed from: v */
    public boolean f18846v;

    /* JADX INFO: renamed from: w */
    public AbstractC8490a[] f18847w;

    /* JADX INFO: renamed from: x */
    public Handler f18848x;

    /* JADX INFO: renamed from: y */
    public C8456b0 f18849y;

    /* JADX INFO: renamed from: z */
    public boolean f18850z;

    public C8463f(Context context, boolean z, C8006r c8006r) {
        Integer numMo20416a;
        super(context);
        this.f18844t = 0;
        this.f18845u = 0;
        this.f18846v = false;
        this.f18850z = false;
        this.f18836B = new CopyOnWriteArrayList();
        this.f18837C = null;
        this.f18839E = 0;
        this.f18835A = z;
        this.f18841q = c8006r;
        this.f18842r = IAConfigManager.f17654M.f17688t.f17862b.m20443a("extractor_source_retry_count", 6, 3);
        C7994v c7994v = c8006r != null ? (C7994v) c8006r.m20432a(C7994v.class) : null;
        this.f18840p = (c7994v == null || (numMo20416a = c7994v.mo20416a("max_tries")) == null) ? 0 : numMo20416a.intValue();
        IAlog.m21945a("Creating IAExoPlayer2Controller", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: a */
    public final void mo20835a() {
        if (this.f18843s != null) {
            if (!this.f18850z) {
                this.f18850z = true;
                AbstractC9183r.f21477a.execute(new RunnableC8461e(this));
            }
            C8456b0 c8456b0 = this.f18849y;
            if (c8456b0 != null) {
                c8456b0.f18822a.clear();
            }
            this.f18849y = null;
        }
        Iterator it = this.f18836B.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f18836B.clear();
        super.mo20835a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: a */
    public final void mo20837a(int i, boolean z) {
        IAlog.m21945a("%sseekTo called with %d playAfterSeek = %s", IAlog.m21943a(this), Integer.valueOf(i), Boolean.valueOf(z));
        C8667g c8667g = this.f18843s;
        if (c8667g == null || this.f18850z) {
            return;
        }
        c8667g.m21190a(z);
        C8667g c8667g2 = this.f18843s;
        c8667g2.m21189a(c8667g2.m21188a(), i);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: a */
    public final void mo20838a(Surface surface) {
        C8667g c8667g;
        IAlog.m21945a("%ssetSurface called with %s", IAlog.m21943a(this), surface);
        AbstractC8490a[] abstractC8490aArr = this.f18847w;
        if (abstractC8490aArr == null || (c8667g = this.f18843s) == null || this.f18850z) {
            return;
        }
        c8667g.m21191a(new C8525e(abstractC8490aArr[0], 1, surface));
    }

    /* JADX INFO: renamed from: a */
    public final void m20871a(InterfaceC8736u interfaceC8736u) {
        C8667g c8667g = this.f18843s;
        if (c8667g == null || interfaceC8736u == null) {
            return;
        }
        if (!c8667g.f20138m.m21395c() || c8667g.f20139n != null) {
            c8667g.f20138m = AbstractC8845x.f20771a;
            c8667g.f20139n = null;
            Iterator it = c8667g.f20130e.iterator();
            while (it.hasNext()) {
                ((C8456b0) it.next()).getClass();
            }
        }
        if (c8667g.f20133h) {
            c8667g.f20133h = false;
            int i = C8741z.f20425d;
            c8667g.f20140o = c8667g.f20127b;
            ((AbstractC8753g) c8667g.f20126a).getClass();
            Iterator it2 = c8667g.f20130e.iterator();
            while (it2.hasNext()) {
                ((C8456b0) it2.next()).getClass();
            }
        }
        c8667g.f20137l++;
        c8667g.f20129d.f20182f.obtainMessage(0, 1, 0, interfaceC8736u).sendToTarget();
        m20907a(EnumC8489b.Preparing);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: a */
    public final void mo20839a(String str, int i) {
        InterfaceC8782g interfaceC8782g;
        InterfaceC8782g c8769f;
        InterfaceC8736u c8549j;
        if (this.f18843s == null || this.f18850z) {
            return;
        }
        char c = 0;
        IAlog.m21945a("%sloadMediaPlayerUri called with %s", IAlog.m21943a(this), str);
        Uri uri = Uri.parse(str);
        int i2 = AbstractC8827z.f20671a;
        String path = uri.getPath();
        if (path == null) {
            c = 3;
        } else {
            String lowerCase = path.toLowerCase();
            if (!lowerCase.endsWith(".mpd")) {
                if (lowerCase.endsWith(".m3u8")) {
                    c = 2;
                } else if (lowerCase.endsWith(".ism") || lowerCase.endsWith(".isml") || lowerCase.endsWith(".ism/manifest") || lowerCase.endsWith(".isml/manifest")) {
                    c = 1;
                } else {
                    c = 3;
                }
            }
        }
        if (!this.f18835A || !C8452n.f18811f.f18814c || !AbstractC9186s.m22012a() || c == 2) {
            C8788m c8788m = new C8788m();
            C8790o c8790o = new C8790o(this.f18867a, c8788m, new C8792q(IAConfigManager.f17654M.f17692x.m22016a(), c8788m));
            File fileM20834a = C8452n.m20834a(this.f18867a, "ia-vid-cache-ex2");
            if (fileM20834a != null) {
                c8769f = new C8769f(new C8775l(fileM20834a, new C8773j()), c8790o);
            } else {
                interfaceC8782g = c8790o;
            }
            if (c != 2) {
                c8549j = new C8732q(uri, interfaceC8782g, new C8528c(), this.f18842r, this.f18848x, this.f18849y);
            } else {
                c8549j = new C8549j(uri, interfaceC8782g, this.f18848x, this.f18849y);
            }
            this.f18837C = c8549j;
            m20871a(c8549j);
        }
        c8769f = new C8447i(this, i, this.f18841q);
        interfaceC8782g = c8769f;
        if (c != 2) {
            c8549j = new C8732q(uri, interfaceC8782g, new C8528c(), this.f18842r, this.f18848x, this.f18849y);
        } else {
            c8549j = new C8549j(uri, interfaceC8782g, this.f18848x, this.f18849y);
        }
        this.f18837C = c8549j;
        m20871a(c8549j);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: a */
    public final void mo20840a(boolean z) {
        if (this.f18843s != null || this.f18850z) {
            return;
        }
        this.f18838D = z;
        IAlog.m21945a("%sMediaPlayerController: creating media player", IAlog.m21943a(this));
        C8456b0 c8456b0 = this.f18849y;
        if (c8456b0 != null) {
            c8456b0.f18822a.clear();
        }
        this.f18849y = new C8456b0(this);
        this.f18848x = new Handler(Looper.getMainLooper());
        AbstractC8490a[] abstractC8490aArr = new AbstractC8490a[z ? 2 : 1];
        this.f18847w = abstractC8490aArr;
        abstractC8490aArr[0] = new MediaCodecVideoRenderer(this.f18848x, this.f18849y);
        if (z) {
            this.f18847w[1] = new MediaCodecAudioRenderer();
        }
        C8667g c8667g = new C8667g(this.f18847w, new C8750d(), new C8516c());
        this.f18843s = c8667g;
        c8667g.f20130e.add(this.f18849y);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: b */
    public final int mo20841b() {
        long jM21012a;
        C8667g c8667g = this.f18843s;
        if (c8667g == null || this.f18850z) {
            return 0;
        }
        if (c8667g.f20138m.m21395c() || c8667g.f20136k > 0) {
            jM21012a = c8667g.f20144s;
        } else {
            c8667g.f20138m.mo21276a(c8667g.f20142q.f20164a, c8667g.f20132g, false);
            jM21012a = AbstractC8515b.m21012a(c8667g.f20142q.f20166c) + AbstractC8515b.m21012a(c8667g.f20132g.f20683e);
        }
        return (int) jM21012a;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: b */
    public final void mo20842b(boolean z) {
        C8667g c8667g;
        this.f18880n = z;
        AbstractC8490a[] abstractC8490aArr = this.f18847w;
        if (abstractC8490aArr == null || (c8667g = this.f18843s) == null || this.f18850z || abstractC8490aArr.length < 2) {
            return;
        }
        c8667g.m21191a(new C8525e(abstractC8490aArr[1], 2, Float.valueOf(0.0f)));
        this.f18846v = true;
        m20908c(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: c */
    public final int mo20843c() {
        C8667g c8667g = this.f18843s;
        if (c8667g == null || this.f18850z) {
            return 0;
        }
        return (int) (c8667g.f20138m.m21395c() ? -9223372036854775807L : AbstractC8515b.m21012a(c8667g.f20138m.m21394a(c8667g.m21188a(), c8667g.f20131f).f20769f));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: d */
    public final String mo20844d() {
        return this.f18835A ? "exo_c" : "exo";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: d */
    public final void mo20845d(boolean z) {
        this.f18880n = z;
        if (this.f18843s == null || this.f18850z) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f18867a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = streamVolume / streamMaxVolume;
        IAlog.m21945a(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
        if (streamVolume == 0) {
            IAlog.m21945a("Avoided unmute - Device is muted", new Object[0]);
            return;
        }
        AbstractC8490a[] abstractC8490aArr = this.f18847w;
        if (abstractC8490aArr != null && abstractC8490aArr.length >= 2) {
            this.f18843s.m21191a(new C8525e(abstractC8490aArr[1], 2, Float.valueOf(f)));
        }
        this.f18846v = false;
        m20908c(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: e */
    public final int mo20846e() {
        return this.f18845u;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: f */
    public final int mo20847f() {
        return this.f18844t;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: g */
    public final boolean mo20848g() {
        return this.f18846v;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: h */
    public final boolean mo20872h() {
        return (this.f18843s == null || this.f18850z || this.f18871e != EnumC8489b.Playing) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: i */
    public final void mo20849i() {
        EnumC8489b enumC8489b;
        EnumC8489b enumC8489b2 = this.f18871e;
        if (enumC8489b2 == EnumC8489b.Idle || enumC8489b2 == EnumC8489b.Completed || enumC8489b2 == (enumC8489b = EnumC8489b.Paused) || enumC8489b2 == EnumC8489b.Prepared) {
            IAlog.m21945a("%s paused called when player is in mState: %s ignoring", IAlog.m21943a(this), enumC8489b2);
            return;
        }
        C8667g c8667g = this.f18843s;
        if (c8667g != null && !this.f18850z) {
            c8667g.m21190a(false);
        }
        m20909k();
        m20907a(enumC8489b);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: j */
    public final void mo20850j() {
        IAlog.m21945a("%sstart called", IAlog.m21943a(this));
        if (mo20872h()) {
            return;
        }
        m20907a(EnumC8489b.Start_in_progress);
        this.f18843s.m21190a(true);
    }
}
