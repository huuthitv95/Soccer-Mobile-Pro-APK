package com.bytedance.sdk.openadsdk.xha;

import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.p028vk.openvk.preload.geckox.net.INetWork;
import com.bykv.p028vk.openvk.preload.geckox.net.Response;
import com.bykv.p028vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf;
import com.bytedance.sdk.component.p160lr.p161ri.C2645aw;
import com.bytedance.sdk.component.p160lr.p161ri.C2647di;
import com.bytedance.sdk.component.p160lr.p161ri.C2648fi;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr;
import com.bytedance.sdk.component.p160lr.p161ri.bgr;
import com.bytedance.sdk.component.p160lr.p161ri.jbs;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.xha.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3612ri implements INetWork {

    /* JADX INFO: renamed from: ri */
    protected AbstractC2671sf f13384ri = new AbstractC2671sf.ri().m10010ri(10, TimeUnit.SECONDS).m10009lr(10, TimeUnit.SECONDS).m10008ik(10, TimeUnit.SECONDS).m10012ri();

    /* JADX INFO: renamed from: lr */
    protected AbstractC2671sf f13383lr = new AbstractC2671sf.ri().m10010ri(10, TimeUnit.SECONDS).m10009lr(30, TimeUnit.SECONDS).m10008ik(30, TimeUnit.SECONDS).m10012ri();

    /* JADX INFO: renamed from: ri */
    private Map<String, String> m16753ri(C2647di c2647di) {
        if (c2647di == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < c2647di.m9910ri(); i++) {
            map.put(c2647di.m9911ri(i), c2647di.m9909lr(i));
        }
        return map;
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        bgr bgrVarMo9923lr = this.f13384ri.mo9987ri(new AbstractC2646co.ri().m9899ri().m9896lr(str).m9906ri("gecko").m9898lr()).mo9923lr();
        return new Response(m16753ri(bgrVarMo9923lr.xha()), bgrVarMo9923lr.mo9878ik() == 200 ? bgrVarMo9923lr.mo9876di().mo9984lr() : null, bgrVarMo9923lr.mo9878ik(), bgrVarMo9923lr.mo9877fi());
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        bgr bgrVarMo9923lr = this.f13384ri.mo9987ri(new AbstractC2646co.ri().m9896lr(str).m9902ri(C2645aw.m9874ri(jbs.m9914ri("application/json; charset=utf-8"), str2)).m9906ri("gecko").m9898lr()).mo9923lr();
        return new Response(m16753ri(bgrVarMo9923lr.xha()), bgrVarMo9923lr.mo9878ik() == 200 ? bgrVarMo9923lr.mo9876di().mo9984lr() : null, bgrVarMo9923lr.mo9878ik(), bgrVarMo9923lr.mo9877fi());
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        C2648fi.ri riVar = new C2648fi.ri();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                riVar.m9912ri((String) pair.first, (String) pair.second);
            }
        }
        bgr bgrVarMo9923lr = this.f13384ri.mo9987ri(new AbstractC2646co.ri().m9896lr(str).m9902ri((C2645aw) riVar.m9913ri()).m9906ri("gecko").m9898lr()).mo9923lr();
        return new Response(m16753ri(bgrVarMo9923lr.xha()), bgrVarMo9923lr.mo9878ik() == 200 ? bgrVarMo9923lr.mo9876di().mo9984lr() : null, bgrVarMo9923lr.mo9878ik(), bgrVarMo9923lr.mo9877fi());
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception {
        BufferedInputStream bufferedInputStream;
        Exception e;
        BufferedInputStream bufferedInputStream2 = null;
        int i = 0;
        try {
            try {
                bgr bgrVarMo9923lr = this.f13383lr.mo9987ri(new AbstractC2646co.ri().m9899ri().m9906ri("gecko").m9896lr(str).m9898lr()).mo9923lr();
                int iMo9878ik = bgrVarMo9923lr.mo9878ik();
                try {
                    bufferedInputStream = new BufferedInputStream(bgrVarMo9923lr.mo9876di().mo9982ik());
                    try {
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i2 = bufferedInputStream.read(bArr, 0, 2048);
                                if (i2 == -1) {
                                    CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                                bufferOutputStream.write(bArr, 0, i2);
                                th = th;
                                bufferedInputStream2 = bufferedInputStream;
                                CloseableUtils.close(bufferedInputStream2);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = iMo9878ik;
                            throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream2 = bufferedInputStream;
                    }
                } catch (Exception e3) {
                    bufferedInputStream = null;
                    e = e3;
                }
            } catch (Exception e4) {
                bufferedInputStream = null;
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.f13384ri.mo9987ri(new AbstractC2646co.ri().m9899ri().m9896lr(str).m9906ri("gecko").m9898lr()).mo9925ri(new InterfaceC2649ik() { // from class: com.bytedance.sdk.openadsdk.xha.ri.1
            @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik
            /* JADX INFO: renamed from: ri */
            public void mo6243ri(InterfaceC2651lr interfaceC2651lr, bgr bgrVar) throws IOException {
            }

            @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik
            /* JADX INFO: renamed from: ri */
            public void mo6244ri(InterfaceC2651lr interfaceC2651lr, IOException iOException) {
            }
        });
    }
}
