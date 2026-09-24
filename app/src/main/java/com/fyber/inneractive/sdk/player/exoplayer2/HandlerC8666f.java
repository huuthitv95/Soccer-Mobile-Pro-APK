package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fyber.inneractive.sdk.player.cache.C8452n;
import com.fyber.inneractive.sdk.player.controller.C8456b0;
import com.fyber.inneractive.sdk.player.controller.C8463f;
import com.fyber.inneractive.sdk.player.controller.RunnableC8469j;
import com.fyber.inneractive.sdk.player.controller.RunnableC8470k;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C8504n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8741z;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8753g;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8755i;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C8756j;
import com.fyber.inneractive.sdk.player.mediaplayer.C8868o;
import com.fyber.inneractive.sdk.util.AbstractC9186s;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.f */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC8666f extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8667g f20125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8666f(C8667g c8667g, Looper looper) {
        super(looper);
        this.f20125a = c8667g;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C8667g c8667g = this.f20125a;
        c8667g.getClass();
        switch (message.what) {
            case 0:
                c8667g.f20137l--;
                return;
            case 1:
                c8667g.f20135j = message.arg1;
                Iterator it = c8667g.f20130e.iterator();
                while (it.hasNext()) {
                    ((C8456b0) it.next()).m20855a(c8667g.f20135j, c8667g.f20134i);
                }
                return;
            case 2:
                Iterator it2 = c8667g.f20130e.iterator();
                while (it2.hasNext()) {
                    ((C8456b0) it2.next()).getClass();
                }
                return;
            case 3:
                if (c8667g.f20137l == 0) {
                    C8756j c8756j = (C8756j) message.obj;
                    c8667g.f20133h = true;
                    C8741z c8741z = c8756j.f20446a;
                    c8667g.f20140o = c8756j.f20447b;
                    AbstractC8755i abstractC8755i = c8667g.f20126a;
                    Object obj = c8756j.f20448c;
                    ((AbstractC8753g) abstractC8755i).getClass();
                    Iterator it3 = c8667g.f20130e.iterator();
                    while (it3.hasNext()) {
                        ((C8456b0) it3.next()).getClass();
                    }
                    return;
                }
                return;
            case 4:
                int i = c8667g.f20136k - 1;
                c8667g.f20136k = i;
                if (i == 0) {
                    c8667g.f20142q = (C8669i) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = c8667g.f20130e.iterator();
                        while (it4.hasNext()) {
                            ((C8456b0) it4.next()).getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (c8667g.f20136k == 0) {
                    c8667g.f20142q = (C8669i) message.obj;
                    Iterator it5 = c8667g.f20130e.iterator();
                    while (it5.hasNext()) {
                        ((C8456b0) it5.next()).getClass();
                    }
                    return;
                }
                return;
            case 6:
                C8671k c8671k = (C8671k) message.obj;
                c8667g.f20136k -= c8671k.f20173d;
                if (c8667g.f20137l == 0) {
                    c8667g.f20138m = c8671k.f20170a;
                    c8667g.f20139n = c8671k.f20171b;
                    c8667g.f20142q = c8671k.f20172c;
                    Iterator it6 = c8667g.f20130e.iterator();
                    while (it6.hasNext()) {
                        ((C8456b0) it6.next()).getClass();
                    }
                    return;
                }
                return;
            case 7:
                C8712s c8712s = (C8712s) message.obj;
                if (c8667g.f20141p.equals(c8712s)) {
                    return;
                }
                c8667g.f20141p = c8712s;
                Iterator it7 = c8667g.f20130e.iterator();
                while (it7.hasNext()) {
                    ((C8456b0) it7.next()).getClass();
                }
                return;
            case 8:
                C8517d c8517d = (C8517d) message.obj;
                for (C8456b0 c8456b0 : c8667g.f20130e) {
                    C8463f c8463f = (C8463f) c8456b0.f18822a.get();
                    if (c8463f != null && (c8517d.getCause() instanceof C8504n) && (c8456b0.f18823b || (c8463f.f18838D && c8463f.f18835A))) {
                        c8463f.f18846v = true;
                        C8667g c8667g2 = c8463f.f18843s;
                        if (c8667g2 != null) {
                            c8667g2.f20129d.m21216d();
                            c8667g2.f20128c.removeCallbacksAndMessages(null);
                            c8463f.f18843s = null;
                        }
                        c8463f.mo20840a(false);
                        c8463f.m20871a(c8463f.f18837C);
                        c8463f.f18875i.post(new RunnableC8470k(c8463f, false));
                    } else if (c8463f == null || !c8463f.f18835A || c8456b0.f18823b || !C8452n.f18811f.f18814c || !AbstractC9186s.m22012a() || c8463f.f18839E >= c8463f.f18840p) {
                        C8868o c8868o = new C8868o(c8517d, c8517d.getCause() == null ? "empty" : c8517d.getCause().getMessage());
                        IAlog.m21945a("%sonPlayerError called with %s for sendErrorState", c8456b0.m20854a(), c8868o);
                        C8463f c8463f2 = (C8463f) AbstractC9195v.m22024a(c8456b0.f18822a);
                        if (c8463f2 != null) {
                            c8463f2.m20907a(EnumC8489b.Error);
                            IAlog.m21945a("%sonPlayerError called with: %s for onPlayerError", IAlog.m21943a(c8463f2), c8868o);
                            c8463f2.f18875i.post(new RunnableC8469j(c8463f2, c8868o));
                            c8463f2.m20909k();
                        }
                    } else {
                        C8667g c8667g3 = c8463f.f18843s;
                        if (c8667g3 != null) {
                            c8667g3.f20129d.m21216d();
                            c8667g3.f20128c.removeCallbacksAndMessages(null);
                            c8463f.f18843s = null;
                        }
                        c8463f.mo20840a(true);
                        c8463f.m20871a(c8463f.f18837C);
                        c8463f.f18839E++;
                        c8463f.f18875i.post(new RunnableC8470k(c8463f, true));
                    }
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
