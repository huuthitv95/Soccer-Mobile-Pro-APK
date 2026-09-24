package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.player.mediaplayer.C8869p;
import com.fyber.inneractive.sdk.player.mediaplayer.RunnableC8863j;
import com.fyber.inneractive.sdk.player.mediaplayer.RunnableC8866m;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8453a extends AbstractC8476q {

    /* JADX INFO: renamed from: p */
    public C8869p f18817p;

    /* JADX INFO: renamed from: q */
    public int f18818q;

    /* JADX INFO: renamed from: r */
    public final int f18819r;

    /* JADX INFO: renamed from: s */
    public int f18820s;

    /* JADX INFO: renamed from: t */
    public boolean f18821t;

    public C8453a(Context context) {
        super(context);
        this.f18818q = 0;
        this.f18819r = 2;
        this.f18820s = 0;
        this.f18821t = false;
        IAlog.m21945a("Creating IAAndroidMediaPlayerController", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: a */
    public final void mo20835a() {
        C8869p c8869p = this.f18817p;
        if (c8869p != null) {
            c8869p.reset();
            this.f18817p.release();
            this.f18817p = null;
        }
        super.mo20835a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: a */
    public final void mo20836a(int i) {
        this.f18875i.post(new RunnableC8471l(this, i));
        if (i >= mo20843c()) {
            m20907a(EnumC8489b.Completed);
        } else if (i == this.f18818q) {
            IAlog.m21945a("%sVideo is stuck! Progress doesn't change", IAlog.m21943a(this));
            int i2 = this.f18820s + 1;
            this.f18820s = i2;
            if (i2 == this.f18819r) {
                m20907a(EnumC8489b.Buffering);
                this.f18821t = true;
            }
        } else if (this.f18821t) {
            IAlog.m21945a("%sVideo progress was stuck! but now it goes forward. Remove buffering state", IAlog.m21943a(this));
            m20907a(EnumC8489b.Playing);
            this.f18820s = 0;
            this.f18821t = false;
        }
        this.f18818q = i;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: a */
    public final void mo20837a(int i, boolean z) {
        C8869p c8869p = this.f18817p;
        if (c8869p != null) {
            IAlog.m21945a("%s seek to called with = %d mPlayAfterSeek = %s", c8869p.m21413b(), Integer.valueOf(i), Boolean.valueOf(z));
            if (!c8869p.m21412a()) {
                IAlog.m21945a("%s seek called when player is not ready!", c8869p.m21413b());
                return;
            }
            EnumC8489b enumC8489b = c8869p.f20814b;
            EnumC8489b enumC8489b2 = EnumC8489b.Seeking;
            if (enumC8489b == enumC8489b2) {
                IAlog.m21945a("%s seek called when player is already seeking!", c8869p.m21413b());
                return;
            }
            c8869p.m21409a(enumC8489b2);
            c8869p.f20815c = z;
            c8869p.m21410a(new RunnableC8863j(c8869p, i));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: a */
    public final void mo20838a(Surface surface) {
        C8869p c8869p = this.f18817p;
        if (c8869p != null) {
            c8869p.setSurface(surface);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: a */
    public final void mo20839a(String str, int i) {
        this.f18817p.m21411a(str);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: a */
    public final void mo20840a(boolean z) {
        if (this.f18817p == null) {
            IAlog.m21945a("MediaPlayerController: creating media player", new Object[0]);
            this.f18817p = new C8869p(this.f18867a, this, this.f18875i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: b */
    public final int mo20841b() {
        C8869p c8869p = this.f18817p;
        if (c8869p != null) {
            return c8869p.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: b */
    public final void mo20842b(boolean z) {
        if (mo20848g() && this.f18880n) {
            return;
        }
        this.f18880n = z;
        C8869p c8869p = this.f18817p;
        if (c8869p != null) {
            c8869p.m21415d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: c */
    public final int mo20843c() {
        C8869p c8869p = this.f18817p;
        if (c8869p != null) {
            return c8869p.f20830r;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: d */
    public final String mo20844d() {
        return "media";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: d */
    public final void mo20845d(boolean z) {
        if (mo20848g() || !this.f18880n) {
            this.f18880n = z;
            C8869p c8869p = this.f18817p;
            if (c8869p != null) {
                IAlog.m21945a("%s unmute", c8869p.m21413b());
                c8869p.f20816d = false;
                if (c8869p.m21412a()) {
                    c8869p.m21410a(new RunnableC8866m(c8869p));
                } else {
                    IAlog.m21945a("%s unmute called when player is not ready!", c8869p.m21413b());
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: e */
    public final int mo20846e() {
        C8869p c8869p = this.f18817p;
        if (c8869p != null) {
            return c8869p.f20832t;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: f */
    public final int mo20847f() {
        C8869p c8869p = this.f18817p;
        if (c8869p != null) {
            return c8869p.f20831s;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: g */
    public final boolean mo20848g() {
        C8869p c8869p = this.f18817p;
        if (c8869p != null) {
            return c8869p.f20816d;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: i */
    public final void mo20849i() {
        C8869p c8869p = this.f18817p;
        if (c8869p != null) {
            c8869p.pause();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8476q
    /* JADX INFO: renamed from: j */
    public final void mo20850j() {
        C8869p c8869p = this.f18817p;
        if (c8869p != null) {
            c8869p.start();
        }
    }
}
