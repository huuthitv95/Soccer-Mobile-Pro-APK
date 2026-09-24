package com.mbridge.msdk.reward.controller;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.error.C13081a;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.reward.adapter.C13609c;
import com.mbridge.msdk.videocommon.C14200a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.b */
/* JADX INFO: compiled from: RewardVideoControllerHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public class HandlerC13614b extends Handler {

    /* JADX INFO: renamed from: a */
    private final C13613a f37837a;

    public HandlerC13614b(C13613a c13613a) {
        super(Looper.getMainLooper());
        this.f37837a = c13613a;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        Object obj = message.obj;
        C13154c c13154cM39231a = this.f37837a.m39231a(message);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM39252i = this.f37837a.m39252i();
        List<CampaignEx> listM39251h = this.f37837a.m39251h();
        C13609c c13609cM39257n = this.f37837a.m39257n();
        boolean zM39262s = this.f37837a.m39262s();
        String strM39255l = this.f37837a.m39255l();
        String strM39259p = this.f37837a.m39259p();
        C13613a.h hVarM39254k = this.f37837a.m39254k();
        InterVideoOutListener interVideoOutListenerM39258o = this.f37837a.m39258o();
        boolean zM39261r = this.f37837a.m39261r();
        MBridgeIds mBridgeIdsM39250g = this.f37837a.m39250g();
        boolean zM39263t = this.f37837a.m39263t();
        switch (i) {
            case 8:
                if (copyOnWriteArrayListM39252i != null && copyOnWriteArrayListM39252i.size() > 0) {
                    boolean z = (listM39251h == null || listM39251h.size() <= 0) ? false : !TextUtils.isEmpty(listM39251h.get(0).getCMPTEntryUrl());
                    int nscpt = copyOnWriteArrayListM39252i.get(0).getNscpt();
                    if (c13609cM39257n != null && c13609cM39257n.m39120a(copyOnWriteArrayListM39252i, z, nscpt)) {
                        if (hVarM39254k != null && zM39262s) {
                            hVarM39254k.m39286c(strM39255l, strM39259p, c13154cM39231a);
                            break;
                        }
                    } else if (hVarM39254k != null && zM39262s) {
                        C14200a.m42397a(strM39259p);
                        C14200a.m42395a();
                        C13082b c13082bM37011a = C13081a.m37011a(880010, "load timeout");
                        if (c13154cM39231a != null) {
                            c13154cM39231a.m37422a(c13082bM37011a);
                        }
                        hVarM39254k.m39284a(c13082bM37011a, c13154cM39231a);
                        break;
                    }
                }
                break;
            case 9:
                if (interVideoOutListenerM39258o != null && zM39262s) {
                    if (zM39261r) {
                        this.f37837a.m39233a();
                    }
                    interVideoOutListenerM39258o.onVideoLoadSuccess(mBridgeIdsM39250g);
                    break;
                }
                break;
            case 16:
            case 18:
                if (interVideoOutListenerM39258o != null && zM39262s) {
                    String string = obj instanceof String ? obj.toString() : "";
                    if (c13154cM39231a != null && c13154cM39231a.m37464u() != null) {
                        string = c13154cM39231a.m37464u().m37032l();
                    }
                    C14200a.m42397a(strM39259p);
                    C14200a.m42395a();
                    if (zM39261r) {
                        this.f37837a.m39233a();
                    }
                    interVideoOutListenerM39258o.onVideoLoadFail(mBridgeIdsM39250g, string);
                    break;
                }
                break;
            case 17:
                if (interVideoOutListenerM39258o != null && zM39262s) {
                    if (zM39261r) {
                        this.f37837a.m39233a();
                    }
                    interVideoOutListenerM39258o.onLoadSuccess(mBridgeIdsM39250g);
                    break;
                }
                break;
            case 1001001:
                this.f37837a.m39241a(false, C13156d.m37475b().m37479a(0, zM39263t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, strM39259p, true, 1));
                break;
            case 1001002:
                if (c13609cM39257n != null) {
                    if (!c13609cM39257n.m39138l()) {
                        if (!c13609cM39257n.m39134g(false)) {
                            if (c13609cM39257n.m39134g(true)) {
                                if (!c13609cM39257n.m39138l()) {
                                    c13609cM39257n.m39136h(true);
                                } else if (hVarM39254k != null) {
                                    c13609cM39257n.m39132f(true);
                                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM39135h = c13609cM39257n.m39135h();
                                    if (copyOnWriteArrayListM39135h != null && copyOnWriteArrayListM39135h.size() == 0) {
                                        copyOnWriteArrayListM39135h = c13609cM39257n.m39131f();
                                    }
                                    this.f37837a.m39240a(copyOnWriteArrayListM39135h);
                                    C13154c c13154cM39232a = this.f37837a.m39232a(copyOnWriteArrayListM39135h, c13154cM39231a);
                                    if (c13154cM39232a != null) {
                                        c13154cM39232a.m37429b(copyOnWriteArrayListM39135h);
                                    }
                                    hVarM39254k.m39287d(strM39255l, strM39259p, c13154cM39232a);
                                }
                            }
                        } else if (!c13609cM39257n.m39138l()) {
                            c13609cM39257n.m39136h(false);
                            if (c13609cM39257n.m39134g(true)) {
                                if (!c13609cM39257n.m39138l()) {
                                    c13609cM39257n.m39136h(true);
                                } else if (hVarM39254k != null) {
                                    c13609cM39257n.m39132f(true);
                                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM39135h2 = c13609cM39257n.m39135h();
                                    if (copyOnWriteArrayListM39135h2 != null && copyOnWriteArrayListM39135h2.size() == 0) {
                                        copyOnWriteArrayListM39135h2 = c13609cM39257n.m39131f();
                                    }
                                    this.f37837a.m39240a(copyOnWriteArrayListM39135h2);
                                    C13154c c13154cM39232a2 = this.f37837a.m39232a(copyOnWriteArrayListM39135h2, c13154cM39231a);
                                    if (c13154cM39232a2 != null) {
                                        c13154cM39232a2.m37429b(copyOnWriteArrayListM39135h2);
                                    }
                                    hVarM39254k.m39287d(strM39255l, strM39259p, c13154cM39232a2);
                                }
                            }
                        } else if (hVarM39254k != null) {
                            c13609cM39257n.m39132f(false);
                            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM39135h3 = c13609cM39257n.m39135h();
                            if (copyOnWriteArrayListM39135h3 != null && copyOnWriteArrayListM39135h3.size() == 0) {
                                copyOnWriteArrayListM39135h3 = c13609cM39257n.m39131f();
                            }
                            this.f37837a.m39240a(copyOnWriteArrayListM39135h3);
                            C13154c c13154cM39232a3 = this.f37837a.m39232a(copyOnWriteArrayListM39135h3, c13154cM39231a);
                            if (c13154cM39232a3 != null) {
                                c13154cM39232a3.m37429b(copyOnWriteArrayListM39135h3);
                            }
                            hVarM39254k.m39287d(strM39255l, strM39259p, c13154cM39232a3);
                        }
                    } else if (hVarM39254k != null) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM39135h4 = c13609cM39257n.m39135h();
                        if (copyOnWriteArrayListM39135h4 != null && copyOnWriteArrayListM39135h4.size() == 0) {
                            copyOnWriteArrayListM39135h4 = c13609cM39257n.m39131f();
                        }
                        this.f37837a.m39240a(copyOnWriteArrayListM39135h4);
                        C13154c c13154cM39232a4 = this.f37837a.m39232a(copyOnWriteArrayListM39135h4, c13154cM39231a);
                        if (c13154cM39232a4 != null) {
                            c13154cM39232a4.m37429b(copyOnWriteArrayListM39135h4);
                        }
                        hVarM39254k.m39287d(strM39255l, strM39259p, c13154cM39232a4);
                    }
                }
                break;
        }
    }
}
