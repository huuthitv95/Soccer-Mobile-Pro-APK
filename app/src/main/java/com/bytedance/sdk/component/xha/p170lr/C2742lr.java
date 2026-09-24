package com.bytedance.sdk.component.xha.p170lr;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2672vr;
import com.bytedance.sdk.component.p160lr.p161ri.C2647di;
import com.bytedance.sdk.component.p160lr.p161ri.C2661ri;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr;
import com.bytedance.sdk.component.p160lr.p161ri.bgr;
import com.bytedance.sdk.component.p160lr.p161ri.xha;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.sdk.component.xha.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2742lr extends AbstractC2740ik {

    /* JADX INFO: renamed from: co */
    private Map<String, String> f7837co;

    /* JADX INFO: renamed from: qt */
    private C2661ri f7838qt;

    /* JADX INFO: renamed from: sf */
    private boolean f7839sf;

    /* JADX INFO: renamed from: ri */
    public static final C2661ri f7836ri = new C2661ri.ri().m9978ri().m9977lr();

    /* JADX INFO: renamed from: lr */
    public static final C2661ri f7835lr = new C2661ri.ri().m9977lr();

    public C2742lr(AbstractC2671sf abstractC2671sf) {
        super(abstractC2671sf);
        this.f7838qt = f7836ri;
        this.f7839sf = false;
        this.f7837co = new HashMap();
    }

    /* JADX INFO: renamed from: ri */
    public C2739lr m10391ri() {
        try {
            AbstractC2646co.ri riVar = new AbstractC2646co.ri();
            String strMo9984lr = "";
            if (this.f7839sf) {
                riVar.m9896lr(this.f7829mj);
            } else {
                xha.C2673ri c2673ri = new xha.C2673ri();
                Uri uri = Uri.parse(this.f7829mj);
                c2673ri.m10048ri(uri.getScheme());
                c2673ri.m10044lr(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                        encodedPath = encodedPath.substring(1);
                    }
                    c2673ri.m10042ik(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.f7837co.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.f7837co.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        c2673ri.m10049ri(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                riVar.m9904ri(c2673ri.m10045lr());
            }
            m10370lr(riVar);
            m10375ri(riVar);
            riVar.m9903ri(this.f7838qt);
            riVar.m9905ri((Object) m10366ka());
            bgr bgrVarMo9923lr = this.f7826ik.mo9987ri(riVar.m9899ri().m9898lr()).mo9923lr();
            if (bgrVarMo9923lr == null) {
                return null;
            }
            m10376ri(bgrVarMo9923lr.jbs());
            HashMap map = new HashMap();
            C2647di c2647diXha = bgrVarMo9923lr.xha();
            if (c2647diXha != null) {
                for (int i = 0; i < c2647diXha.m9910ri(); i++) {
                    map.put(c2647diXha.m9911ri(i), c2647diXha.m9909lr(i));
                }
            }
            AbstractC2672vr abstractC2672vrMo9876di = bgrVarMo9923lr.mo9876di();
            if (abstractC2672vrMo9876di != null) {
                strMo9984lr = abstractC2672vrMo9876di.mo9984lr();
            }
            return new C2739lr(bgrVarMo9923lr.mo9879ka(), bgrVarMo9923lr.mo9878ik(), bgrVarMo9923lr.mo9877fi(), map, strMo9984lr, bgrVarMo9923lr.mo9880lr(), bgrVarMo9923lr.mo9882ri());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10392ri(final AbstractC2746ri abstractC2746ri) {
        try {
            AbstractC2646co.ri riVar = new AbstractC2646co.ri();
            if (this.f7839sf) {
                riVar.m9896lr(this.f7829mj);
            } else {
                xha.C2673ri c2673ri = new xha.C2673ri();
                Uri uri = Uri.parse(this.f7829mj);
                c2673ri.m10048ri(uri.getScheme());
                c2673ri.m10044lr(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                        encodedPath = encodedPath.substring(1);
                    }
                    c2673ri.m10042ik(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.f7837co.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.f7837co.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        c2673ri.m10049ri(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                riVar.m9904ri(c2673ri.m10045lr());
            }
            m10370lr(riVar);
            m10375ri(riVar);
            riVar.m9903ri(this.f7838qt);
            riVar.m9905ri((Object) m10366ka());
            if (!TextUtils.isEmpty(this.f7825fi)) {
                riVar.m9906ri(this.f7825fi);
            }
            if (this.f7824di > 0) {
                riVar.m9900ri(this.f7824di);
            }
            this.f7826ik.mo9987ri(riVar.m9899ri().m9898lr()).mo9925ri(new InterfaceC2649ik() { // from class: com.bytedance.sdk.component.xha.lr.lr.1
                @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik
                /* JADX INFO: renamed from: ri */
                public void mo6243ri(InterfaceC2651lr interfaceC2651lr, bgr bgrVar) throws IOException {
                    if (abstractC2746ri != null) {
                        HashMap map = new HashMap();
                        if (bgrVar != null) {
                            C2742lr.this.m10376ri(bgrVar.jbs());
                            C2647di c2647diXha = bgrVar.xha();
                            if (c2647diXha != null) {
                                for (int i = 0; i < c2647diXha.m9910ri(); i++) {
                                    map.put(c2647diXha.m9911ri(i), c2647diXha.m9909lr(i));
                                }
                            }
                            AbstractC2672vr abstractC2672vrMo9876di = bgrVar.mo9876di();
                            abstractC2746ri.mo10425ri(C2742lr.this, new C2739lr(bgrVar.mo9879ka(), bgrVar.mo9878ik(), bgrVar.mo9877fi(), map, abstractC2672vrMo9876di == null ? "" : abstractC2672vrMo9876di.mo9984lr(), bgrVar.mo9880lr(), bgrVar.mo9882ri()));
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik
                /* JADX INFO: renamed from: ri */
                public void mo6244ri(InterfaceC2651lr interfaceC2651lr, IOException iOException) {
                    AbstractC2746ri abstractC2746ri2 = abstractC2746ri;
                    if (abstractC2746ri2 != null) {
                        abstractC2746ri2.mo10423ri(C2742lr.this, iOException);
                    }
                }
            });
        } catch (Throwable th) {
            if (abstractC2746ri != null) {
                abstractC2746ri.mo10423ri(this, new IOException(th.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10393ri(boolean z) {
        this.f7839sf = z;
    }
}
