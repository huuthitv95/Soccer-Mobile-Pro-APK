package com.mbridge.msdk.config.component.cal;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.cal.model.C12713a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.nori.NoriCpt;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.config.manager.callback.InterfaceC12908a;
import com.mbridge.msdk.config.manager.callback.InterfaceC12909b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class CalCpt extends C12709a {

    /* JADX INFO: renamed from: h */
    private C12713a f33814h;

    /* JADX INFO: renamed from: i */
    private MBridgeIds f33815i;

    /* JADX INFO: renamed from: j */
    private String f33816j;

    /* JADX INFO: renamed from: k */
    private String f33817k;

    /* JADX INFO: renamed from: l */
    private String f33818l;

    /* JADX INFO: renamed from: m */
    private String f33819m;

    /* JADX INFO: renamed from: n */
    private String f33820n;

    /* JADX INFO: renamed from: o */
    private String f33821o;

    /* JADX INFO: renamed from: p */
    private String f33822p;

    /* JADX INFO: renamed from: q */
    private Object f33823q;

    /* JADX INFO: renamed from: a */
    private void m34849a(boolean z, String str, String str2) {
        HashMap map = new HashMap();
        map.put(C12770c.m35209b("500"), z ? "1" : "2");
        if (!z) {
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), str);
            map.put(C12770c.m35209b("reason"), str2);
        }
        m34829a(m34827a("910002", map));
    }

    /* JADX INFO: renamed from: h */
    private String m34850h() {
        Map<String, Object> mapM34872f = this.f33814h.m34872f();
        this.f33816j = String.valueOf(mapM34872f.get(C12770c.m35209b("107")));
        this.f33817k = String.valueOf(mapM34872f.get(C12770c.m35209b("cbType")));
        this.f33818l = String.valueOf(mapM34872f.get(C12770c.m35209b("110")));
        this.f33819m = String.valueOf(mapM34872f.get(C12770c.m35209b("111")));
        this.f33820n = String.valueOf(mapM34872f.get(C12770c.m35209b("106")));
        this.f33821o = String.valueOf(mapM34872f.get(C12770c.m35209b("108")));
        this.f33822p = String.valueOf(mapM34872f.get(C12770c.m35209b("109")));
        Object objM36051b = ((C12894a) this.f33806d.m36051b("adModel")).m36051b("host");
        StringBuilder sb = new StringBuilder();
        if (objM36051b instanceof String) {
            sb.append(objM36051b);
            sb.append("/addReward?user_id=");
            sb.append(this.f33816j);
            sb.append("&cb_type=");
            sb.append(this.f33817k);
            sb.append("&reward_name=");
            sb.append(this.f33818l);
            sb.append("&reward_amount=");
            sb.append(this.f33819m);
            sb.append("&unit_id=");
            sb.append(this.f33820n);
            sb.append("&click_id=");
            sb.append(this.f33821o);
            sb.append("&extra=");
            sb.append(this.f33822p);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    private void m34851i() {
        Map<String, Object> mapM34872f = this.f33814h.m34872f();
        this.f33818l = String.valueOf(mapM34872f.get(C12770c.m35209b("110")));
        this.f33819m = String.valueOf(mapM34872f.get(C12770c.m35209b("111")));
        RewardInfo rewardInfo = new RewardInfo(mapM34872f.get(C12770c.m35209b("112")).equals("1"), 1);
        rewardInfo.setRewardName(this.f33818l);
        rewardInfo.setRewardAmount(this.f33819m);
        Object obj = this.f33823q;
        if (obj instanceof InterfaceC12909b) {
            ((InterfaceC12909b) obj).onAdClose(this.f33815i, rewardInfo);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m34852j() {
        if (this.f33823q instanceof InterfaceC12908a) {
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("buyer_id"), this.f33814h.m34865a());
            ((InterfaceC12908a) this.f33823q).mo36204a(map);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m34853k() {
        Object obj = this.f33823q;
        if (obj instanceof InterfaceC12909b) {
            ((InterfaceC12909b) obj).onEndCardShow(this.f33815i);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m34854l() {
        if (this.f33823q instanceof InterfaceC12908a) {
            HashMap map = new HashMap();
            map.put(C12770c.m35209b(MBridgeConstans.PROPERTIES_UNIT_ID), this.f33814h.m34873g());
            map.put(C12770c.m35209b("ready_state"), Boolean.valueOf(this.f33814h.m34871e() == 1));
            ((InterfaceC12908a) this.f33823q).mo36204a(map);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m34855m() {
        Object obj = this.f33823q;
        if (obj instanceof InterfaceC12909b) {
            ((InterfaceC12909b) obj).onVideoLoadFail(this.f33815i, this.f33814h.m34869c() == null ? "" : this.f33814h.m34869c());
        }
    }

    /* JADX INFO: renamed from: n */
    private void m34856n() {
        Object obj = this.f33823q;
        if (obj instanceof InterfaceC12909b) {
            ((InterfaceC12909b) obj).onLoadSuccess(this.f33815i);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m34857o() {
        Object obj = this.f33823q;
        if (obj instanceof InterfaceC12909b) {
            ((InterfaceC12909b) obj).onVideoLoadSuccess(this.f33815i);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m34858p() {
        if (this.f33823q instanceof InterfaceC12908a) {
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("init_status"), Integer.valueOf(this.f33814h.m34870d()));
            map.put(C12770c.m35209b("reason"), this.f33814h.m34869c());
            ((InterfaceC12908a) this.f33823q).mo36204a(map);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m34859q() {
        String strM34850h = m34850h();
        NoriCpt noriCpt = new NoriCpt();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("URLs", strM34850h);
        map2.put("scheme", "HTTP");
        map2.put("method", "GET");
        map.put("componentConfig", map2);
        noriCpt.m34832a(map, this.f33806d, "");
        noriCpt.mo34836d();
    }

    /* JADX INFO: renamed from: r */
    private void m34860r() {
        Object obj = this.f33823q;
        if (obj instanceof InterfaceC12909b) {
            ((InterfaceC12909b) obj).onShowFail(this.f33815i, this.f33814h.m34869c() == null ? "" : this.f33814h.m34869c());
        }
    }

    /* JADX INFO: renamed from: s */
    private void m34861s() {
        Object obj = this.f33823q;
        if (obj instanceof InterfaceC12909b) {
            ((InterfaceC12909b) obj).onAdShow(this.f33815i);
        }
    }

    /* JADX INFO: renamed from: t */
    private void m34862t() {
        Object obj = this.f33823q;
        if (obj instanceof InterfaceC12909b) {
            ((InterfaceC12909b) obj).onVideoAdClicked(this.f33815i);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m34863u() {
        Object obj = this.f33823q;
        if (obj instanceof InterfaceC12909b) {
            ((InterfaceC12909b) obj).onVideoComplete(this.f33815i);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "910001";
        this.f33814h = new C12713a(map);
        MBridgeIds mBridgeIds = new MBridgeIds();
        this.f33815i = mBridgeIds;
        mBridgeIds.setUnitId(this.f33814h.m34873g());
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        try {
            C12894a c12894a = this.f33806d;
            if (c12894a != null && c12894a.m36050a((Object) C12770c.m35209b("sdk_context"))) {
                Object objM36051b = this.f33806d.m36051b(C12770c.m35209b("sdk_context"));
                if (objM36051b instanceof Map) {
                    this.f33823q = ((Map) objM36051b).get(C12770c.m35209b("callback"));
                }
            }
            if (this.f33823q == null) {
                m34849a(false, "", "Callback Listener is NULL");
            }
            C12894a c12894a2 = this.f33806d;
            if (c12894a2 != null && c12894a2.m36050a((Object) C12770c.m35209b("51"))) {
                Object objM36051b2 = this.f33806d.m36051b(C12770c.m35209b("51"));
                if (objM36051b2 instanceof Map) {
                    String strValueOf = String.valueOf(((Map) objM36051b2).get("id"));
                    if (!TextUtils.isEmpty(strValueOf) && strValueOf.contains("-")) {
                        this.f33815i.setContextId(strValueOf);
                    }
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b("CalCpt", th.getMessage(), th);
        }
        m34864g();
    }

    /* JADX INFO: renamed from: g */
    public void m34864g() {
        String strM34868b = this.f33814h.m34868b();
        if (strM34868b == null) {
            m34849a(false, "900001", "command is null");
            return;
        }
        try {
            if (C12770c.m35209b("loadV3Success").equals(strM34868b)) {
                m34856n();
            } else if (C12770c.m35209b("loadSuccess").equals(strM34868b)) {
                m34857o();
            } else if (C12770c.m35209b("loadFailed").equals(strM34868b)) {
                m34855m();
            } else if (C12770c.m35209b("301").equals(strM34868b)) {
                m34861s();
            } else if (C12770c.m35209b("302").equals(strM34868b)) {
                m34860r();
            } else if (C12770c.m35209b("304").equals(strM34868b)) {
                m34853k();
            } else if (C12770c.m35209b("305").equals(strM34868b)) {
                m34862t();
            } else if (C12770c.m35209b("306").equals(strM34868b)) {
                m34851i();
            } else if (C12770c.m35209b("303").equals(strM34868b)) {
                m34863u();
            } else if (C12770c.m35209b("308").equals(strM34868b)) {
                m34859q();
            } else if (C12770c.m35209b("300").equals(strM34868b)) {
                m34854l();
            } else if (C12770c.m35209b("sdkInit").equals(strM34868b)) {
                m34858p();
            } else if (C12770c.m35209b("309").equals(strM34868b)) {
                m34852j();
            }
        } catch (Exception e) {
            C13219q0.m37817b("CalCpt", e.getMessage(), e);
            m34849a(false, "900002", "callback type failed");
        }
        m34849a(true, "", "");
    }
}
