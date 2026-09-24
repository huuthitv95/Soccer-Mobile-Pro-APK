package com.bytedance.sdk.component.xha.p170lr;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2672vr;
import com.bytedance.sdk.component.p160lr.p161ri.C2645aw;
import com.bytedance.sdk.component.p160lr.p161ri.C2647di;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr;
import com.bytedance.sdk.component.p160lr.p161ri.bgr;
import com.bytedance.sdk.component.p160lr.p161ri.jbs;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p169ik.C2738ri;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2745lr;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11341A5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.xha.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2741ka extends AbstractC2740ik {

    /* JADX INFO: renamed from: ri */
    C2645aw f7832ri;

    public C2741ka(AbstractC2671sf abstractC2671sf) {
        super(abstractC2671sf);
        this.f7832ri = null;
    }

    /* JADX INFO: renamed from: di */
    private byte[] m10378di(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream2.write(str.getBytes(C11341A5.f23802O));
                        try {
                            gZIPOutputStream2.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException unused2) {
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        return byteArray;
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException unused5) {
                            throw th;
                        }
                    }
                } catch (IOException unused6) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused7) {
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
            byteArrayOutputStream.close();
        } catch (IOException unused8) {
        }
        byteArray = byteArrayOutputStream.toByteArray();
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public jbs m10379ri(AbstractC2672vr abstractC2672vr) {
        try {
            return abstractC2672vr.mo9981fi();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public Charset m10381ri(jbs jbsVar) {
        try {
            return jbsVar != null ? jbsVar.m9916ri(com.bytedance.sdk.component.p160lr.p161ri.p162lr.jbs.f7555ri) : com.bytedance.sdk.component.p160lr.p161ri.p162lr.jbs.f7555ri;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.p160lr.p161ri.p162lr.jbs.f7555ri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m10384ri(C2739lr c2739lr, bgr bgrVar) {
        if (c2739lr == null || bgrVar == null) {
            return;
        }
        c2739lr.m10360ri(bgrVar.mo9881mj());
    }

    /* JADX INFO: renamed from: fi */
    public void m10385fi(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.f7832ri = C2645aw.m9874ri(jbs.m9914ri("application/json; charset=utf-8"), str);
    }

    /* JADX INFO: renamed from: ri */
    public C2739lr m10386ri() {
        C2739lr c2739lr;
        try {
            AbstractC2646co.ri riVar = new AbstractC2646co.ri();
            if (TextUtils.isEmpty(this.f7829mj)) {
                return new C2739lr(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            riVar.m9896lr(this.f7829mj);
            if (this.f7832ri == null) {
                return new C2739lr(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            m10370lr(riVar);
            riVar.m9905ri((Object) m10366ka());
            m10375ri(riVar);
            bgr bgrVarMo9923lr = this.f7826ik.mo9987ri(riVar.m9902ri(this.f7832ri).m9898lr()).mo9923lr();
            if (bgrVarMo9923lr == null) {
                return null;
            }
            m10376ri(bgrVarMo9923lr.jbs());
            HashMap map = new HashMap();
            C2647di c2647diXha = bgrVarMo9923lr.xha();
            if (c2647diXha != null) {
                for (int i = 0; i < c2647diXha.m9910ri(); i++) {
                    String strM9911ri = c2647diXha.m9911ri(i);
                    String strM9909lr = c2647diXha.m9909lr(i);
                    map.put(strM9911ri, strM9909lr);
                    if (strM9911ri != null && strM9911ri.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strM9909lr == null ? "" : strM9909lr.toLowerCase());
                    }
                }
            }
            AbstractC2672vr abstractC2672vrMo9876di = bgrVarMo9923lr.mo9876di();
            if (C2738ri.m10353ri(map)) {
                byte[] bArrMo9983ka = abstractC2672vrMo9876di.mo9983ka();
                c2739lr = new C2739lr(bgrVarMo9923lr.mo9879ka(), bgrVarMo9923lr.mo9878ik(), bgrVarMo9923lr.mo9877fi(), map, null, bgrVarMo9923lr.mo9880lr(), bgrVarMo9923lr.mo9882ri());
                c2739lr.m10362ri(bArrMo9983ka);
            } else if (this.jbs) {
                byte[] bArrMo9983ka2 = abstractC2672vrMo9876di.mo9983ka();
                c2739lr = new C2739lr(bgrVarMo9923lr.mo9879ka(), bgrVarMo9923lr.mo9878ik(), bgrVarMo9923lr.mo9877fi(), map, new String(bArrMo9983ka2, m10381ri(m10379ri(abstractC2672vrMo9876di))), bgrVarMo9923lr.mo9880lr(), bgrVarMo9923lr.mo9882ri());
                c2739lr.m10362ri(bArrMo9983ka2);
            } else {
                if (abstractC2672vrMo9876di == null) {
                    throw new IOException(bgrVarMo9923lr.mo9877fi());
                }
                c2739lr = new C2739lr(bgrVarMo9923lr.mo9879ka(), bgrVarMo9923lr.mo9878ik(), bgrVarMo9923lr.mo9877fi(), map, abstractC2672vrMo9876di != null ? abstractC2672vrMo9876di.mo9984lr() : "", bgrVarMo9923lr.mo9880lr(), bgrVarMo9923lr.mo9882ri());
            }
            m10384ri(c2739lr, bgrVarMo9923lr);
            return c2739lr;
        } catch (Throwable th) {
            return new C2739lr(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10387ri(final AbstractC2746ri abstractC2746ri) {
        try {
            AbstractC2646co.ri riVar = new AbstractC2646co.ri();
            if (TextUtils.isEmpty(this.f7829mj)) {
                abstractC2746ri.mo10423ri(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.f7825fi)) {
                riVar.m9906ri(this.f7825fi);
            }
            if (this.f7824di > 0) {
                riVar.m9900ri(this.f7824di);
            }
            riVar.m9896lr(this.f7829mj);
            if (this.f7832ri == null) {
                if (abstractC2746ri != null) {
                    abstractC2746ri.mo10423ri(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                m10370lr(riVar);
                riVar.m9905ri((Object) m10366ka());
                m10375ri(riVar);
                this.f7826ik.mo9987ri(riVar.m9902ri(this.f7832ri).m9898lr()).mo9925ri(new InterfaceC2649ik() { // from class: com.bytedance.sdk.component.xha.lr.ka.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r13v6, types: [com.bytedance.sdk.component.xha.ri.ri] */
                    /* JADX WARN: Type inference failed for: r1v1 */
                    /* JADX WARN: Type inference failed for: r1v2 */
                    /* JADX WARN: Type inference failed for: r1v9 */
                    /* JADX WARN: Type inference failed for: r2v0 */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.sdk.component.xha.lr] */
                    /* JADX WARN: Type inference failed for: r2v11 */
                    /* JADX WARN: Type inference failed for: r2v12 */
                    /* JADX WARN: Type inference failed for: r2v13 */
                    /* JADX WARN: Type inference failed for: r2v14 */
                    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r2v5 */
                    /* JADX WARN: Type inference failed for: r2v9, types: [com.bytedance.sdk.component.xha.lr] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik
                    /* JADX INFO: renamed from: ri */
                    public void mo6243ri(InterfaceC2651lr interfaceC2651lr, bgr bgrVar) throws IOException {
                        Throwable th;
                        ?? r2;
                        AbstractC2746ri abstractC2746ri2 = abstractC2746ri;
                        if (abstractC2746ri2 != null) {
                            if (bgrVar == null) {
                                abstractC2746ri2.mo10423ri(C2741ka.this, new IOException("No response"));
                                return;
                            }
                            C2741ka.this.m10376ri(bgrVar.jbs());
                            ?? r1 = 0;
                            IOException iOException = null;
                            try {
                                HashMap map = new HashMap();
                                C2647di c2647diXha = bgrVar.xha();
                                ?? c2739lr = "";
                                if (c2647diXha != null) {
                                    for (int i = 0; i < c2647diXha.m9910ri(); i++) {
                                        String strM9911ri = c2647diXha.m9911ri(i);
                                        String strM9909lr = c2647diXha.m9909lr(i);
                                        map.put(strM9911ri, strM9909lr);
                                        if (strM9911ri != null && strM9911ri.equalsIgnoreCase("content-type")) {
                                            map.put("content-type", strM9909lr == null ? "" : strM9909lr.toLowerCase());
                                        }
                                    }
                                }
                                AbstractC2672vr abstractC2672vrMo9876di = bgrVar.mo9876di();
                                try {
                                    if (C2738ri.m10353ri(map)) {
                                        byte[] bArrMo9983ka = abstractC2672vrMo9876di.mo9983ka();
                                        C2739lr c2739lr2 = new C2739lr(bgrVar.mo9879ka(), bgrVar.mo9878ik(), bgrVar.mo9877fi(), map, null, bgrVar.mo9880lr(), bgrVar.mo9882ri());
                                        c2739lr2.m10362ri(bArrMo9983ka);
                                        c2739lr = c2739lr2;
                                    } else if (C2741ka.this.jbs) {
                                        byte[] bArrMo9983ka2 = abstractC2672vrMo9876di.mo9983ka();
                                        C2741ka c2741ka = C2741ka.this;
                                        C2739lr c2739lr3 = new C2739lr(bgrVar.mo9879ka(), bgrVar.mo9878ik(), bgrVar.mo9877fi(), map, new String(bArrMo9983ka2, c2741ka.m10381ri(c2741ka.m10379ri(abstractC2672vrMo9876di))), bgrVar.mo9880lr(), bgrVar.mo9882ri());
                                        c2739lr3.m10362ri(bArrMo9983ka2);
                                        c2739lr = c2739lr3;
                                    } else {
                                        if (abstractC2672vrMo9876di == null) {
                                            throw new IOException(bgrVar.mo9877fi());
                                        }
                                        c2739lr = new C2739lr(bgrVar.mo9879ka(), bgrVar.mo9878ik(), bgrVar.mo9877fi(), map, abstractC2672vrMo9876di != null ? abstractC2672vrMo9876di.mo9984lr() : "", bgrVar.mo9880lr(), bgrVar.mo9882ri());
                                    }
                                    C2741ka.this.m10384ri((C2739lr) c2739lr, bgrVar);
                                    r2 = c2739lr;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r1 = c2739lr;
                                    r2 = r1;
                                    iOException = new IOException(th);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            if (r2 != 0) {
                                abstractC2746ri.mo10425ri(C2741ka.this, r2);
                                return;
                            }
                            AbstractC2746ri abstractC2746ri3 = abstractC2746ri;
                            if (!(abstractC2746ri3 instanceof AbstractC2745lr)) {
                                C2741ka c2741ka2 = C2741ka.this;
                                if (iOException == null) {
                                    iOException = new IOException("Unexpected exception");
                                }
                                abstractC2746ri3.mo10423ri(c2741ka2, iOException);
                                return;
                            }
                            AbstractC2745lr abstractC2745lr = (AbstractC2745lr) abstractC2746ri3;
                            C2741ka c2741ka3 = C2741ka.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            abstractC2745lr.mo10424ri(c2741ka3, iOException, new C2739lr(bgrVar.mo9879ka(), bgrVar.mo9878ik(), bgrVar.mo9877fi(), null, null, bgrVar.mo9880lr(), bgrVar.mo9882ri()));
                        }
                    }

                    @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik
                    /* JADX INFO: renamed from: ri */
                    public void mo6244ri(InterfaceC2651lr interfaceC2651lr, IOException iOException) {
                        AbstractC2746ri abstractC2746ri2 = abstractC2746ri;
                        if (abstractC2746ri2 != null) {
                            abstractC2746ri2.mo10423ri(C2741ka.this, iOException);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            abstractC2746ri.mo10423ri(this, new IOException(th.getMessage()));
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10388ri(String str, boolean z) {
        if (!z) {
            m10385fi(str);
        } else {
            m10389ri("application/json; charset=utf-8", m10378di(str));
            m10372lr(HttpHeaders.CONTENT_ENCODING, "gzip");
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10389ri(String str, byte[] bArr) {
        this.f7832ri = C2645aw.m9875ri(jbs.m9914ri(str), bArr);
    }

    /* JADX INFO: renamed from: ri */
    public void m10390ri(JSONObject jSONObject) {
        this.f7832ri = C2645aw.m9874ri(jbs.m9914ri("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : JsonUtils.EMPTY_JSON);
    }
}
